package lessonFive.rucksack;

public class RucksackByWeightsAndValuesMaximumTestApp {
//    private static int[] thingWeights = {11, 19, 7, 6, 5};
//    private static int[] thingValues = {5, 3, 1, 8, 10};
    private static int[] thingWeights = {1, 3, 4};
    private static int[] thingValues = {15, 20, 30};
//    private static int maxCapacity = 20;
    private static int maxCapacity = 4;
    private static int[] selectedThings;
    private static int[] maxValues = new int[maxCapacity];

    public static void main(String[] args) {

        for (int i = 0; i < thingWeights.length; i++) {
            selectedThings = new int[thingWeights.length];
            rucksackByWeightsAndValues(maxCapacity, thingWeights, thingValues, i);
        }
        displaySelected(selectedThings);
    }


    public static int rucksackByWeightsAndValues(int capacity, int[] thingWeights, int[] thingValues, int currentThing) {
        if (currentThing < 0 || capacity ==0 ) return 0;
        if (currentThing == 0 && thingWeights[currentThing] <= capacity) {
            maxValues[capacity - 1] = thingValues[0];
            selectedThings[0]=1;
            return maxValues[capacity - 1];
        }
//        if (thingWeights[currentThing])
        int tempA = rucksackByWeightsAndValues(capacity, thingWeights, thingValues, currentThing - 1);

        if (thingWeights[currentThing] > capacity) {
            maxValues[capacity - 1] = tempA;
            selectedThings[currentThing]=0;
        } else {
            int tempB = thingValues[currentThing] + rucksackByWeightsAndValues(capacity - thingWeights[currentThing], thingWeights, thingValues, currentThing - 1);
            if (tempA < tempB) {
                selectedThings[currentThing] = 1;
                maxValues[capacity - 1] = tempB;
            } else {
                selectedThings[currentThing]=0;
                maxValues[capacity - 1] = tempA;
            }
        }
        return maxValues[capacity - 1];
    }

    public static void displaySelected(int[] arr) {
        System.out.println("Weights of the selected things:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.print(thingWeights[i] + " ");
            }
        }
    }

}

