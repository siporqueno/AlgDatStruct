package lessonFive.rucksack;

public class RucksackByWeightsExactlyTestApp {
    private static int[] thingWeightsSorted = {11, 8, 7, 6, 5};
    private static boolean flagSuccess = false;
    private static int[] selectedThings;

    public static void main(String[] args) {

        for (int i = 0; i < thingWeightsSorted.length; i++) {
            selectedThings = new int[thingWeightsSorted.length];
            rucksackByWeights(20, thingWeightsSorted, i);
            if (flagSuccess) {
                displaySelected();
                break;
            }
        }
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

    public static void displaySelected() {
        System.out.println("Weights of the selected things:");
        for (int i = 0; i < thingWeightsSorted.length; i++) {
            if (selectedThings[i] == 1) {
                System.out.print(thingWeightsSorted[i] + " ");
            }
        }
    }

}

