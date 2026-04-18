class TimeMap {
    HashMap<String, List<ValueTime>> store;

    class ValueTime{
        String value;
        int timestamp;

        public ValueTime(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public TimeMap() {
        this.store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        ValueTime valueTime = new ValueTime(value, timestamp);

        store.computeIfAbsent(key, k->new ArrayList<>()).add(valueTime);
    }
    
    public String get(String key, int timestamp) {
        if(!store.containsKey(key)){
            return "";
        }

        List<ValueTime> arr = store.get(key);

        int left = 0;
        int right = arr.size() - 1;

        String result = "";

        while(left<=right){
            int mid = (left+right)/2;

            if(arr.get(mid).timestamp == timestamp){
                return arr.get(mid).value;
            }else if(arr.get(mid).timestamp < timestamp){
                result = arr.get(mid).value;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return result;
    }
}
