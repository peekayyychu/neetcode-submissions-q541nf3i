class Solution {
    private class Car{
        public int pos;
        public int speed;
        public int index;

        Car(int pos, int speed, int index){
            this.pos = pos;
            this.speed = speed;
            this.index = index;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        List<Car> cars = new ArrayList<>();

        for(int i = 0; i<position.length; i++){
            cars.add(new Car(position[i], speed[i], i));
        }

        cars.sort((a,b) -> Integer.compare(b.pos, a.pos));

        Stack<Double>time = new Stack<>();

        for(Car car: cars){
            double timeTaken = (double)(target - car.pos)/(car.speed);

            if(time.isEmpty() || timeTaken > time.peek()){
                time.push(timeTaken);
            }
        }

        return time.size();
    }
}
