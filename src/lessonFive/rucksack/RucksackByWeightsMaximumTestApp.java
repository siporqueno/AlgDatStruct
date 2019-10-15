package lessonFive.rucksack;

public class RucksackByWeightsMaximumTestApp {
//    private static int[] thingWeightsSorted = {11, 8, 7, 6, 5};
    private static int[] thingWeightsSorted = {19, 11, 7, 6, 5};
    private static boolean flagSuccess = false;
    private static int[] selectedThings;
    private static int maxSelectedThingsWeight = 0;
    private static int[] maxSelectedThings;

    public static void main(String[] args) {

        for (int i = 0; i < thingWeightsSorted.length; i++) {
            selectedThings = new int[thingWeightsSorted.length];
            int temp;
            rucksackByWeights(20, thingWeightsSorted, i);
            if (flagSuccess) {
                displaySelected(selectedThings);
                break;
            }
            temp = getSelectedThingsWeight();
            if (temp > maxSelectedThingsWeight) {
                maxSelectedThingsWeight = temp;
                maxSelectedThings = selectedThings;
            }
        }
        if (!flagSuccess) displaySelected(maxSelectedThings);
    }

    public static void rucksackByWeights(int capacity, int[] thingWeights, int currentThing) {
        if (currentThing >= thingWeights.length) return;
        if (thingWeights[currentThing] == capacity) {
            selectedThings[currentThing] = 1;
            flagSuccess = true;
            return;
        } else {
            if (thingWeights[currentThing] < capacity) {
                selectedThings[currentThing] = 1;
                rucksackByWeights(capacity - thingWeights[currentThing], thingWeights, ++currentThing);
            } else {
                rucksackByWeights(capacity, thingWeights, ++currentThing);
            }
        }
    }

    public static void displaySelected(int[] arr) {
        System.out.println("Weights of the selected things:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.print(thingWeightsSorted[i] + " ");
            }
        }
    }

    public static int getSelectedThingsWeight() {
        int temp = 0;
        for (int i = 0; i < selectedThings.length; i++) {
            if (selectedThings[i] == 1) temp += thingWeightsSorted[i];
        }
        return temp;
    }
}

