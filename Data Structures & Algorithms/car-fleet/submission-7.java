class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Sort
        // Know that if a car has a lesser position and a greater distance to travel,
        // They will join in the same fleet
        // From first to last
        List<List<Double>> carFleets = new ArrayList<List<Double>>();

        // Build an array of cars
        // Position, Speed
        List<List<Integer>> cars = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            cars.add(List.of(position[i], speed[i]));
        }

        cars.sort(Comparator.comparingInt((List<Integer> x) -> x.get(0)).reversed());

        // Create a list of times
        List<Double> arrivalTimes = new ArrayList<>();


        for (int i = 0; i < cars.size(); i++)
        {
            double time = (Double.valueOf(target) - Double.valueOf(cars.get(i).get(0))) / Double.valueOf(cars.get(i).get(1));
            // Cars will join a fleet if they have the same time, or a car will join its fleet if it has a less time than the one in front of it
            arrivalTimes.add(time);
        }

        List<Double> carFleetStack = new ArrayList<>();

        for (Double time : arrivalTimes)
        {
            if (carFleetStack.isEmpty())
            {
                carFleetStack.add(time);
            }
            else
            {
                // is 3 <= 3, yes so add to the stack
                // is 4 <= 2, no so add the stack to the carFleets to create a fleet and add 4 to the stack
                if (time > carFleetStack.get(carFleetStack.size() - 1))
                {
                    carFleetStack.add(time);
                }

            }
        }


        System.out.println(carFleetStack);


        return carFleetStack.size();
    }
}
