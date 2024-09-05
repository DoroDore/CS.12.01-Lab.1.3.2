import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { // Corrected loop condition
                //System.out.println("Current Value: " + array[j]);
                //System.out.println("Next Value: " + array[j + 1]);
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //System.out.println("Switched!");
                }
            }
        }

        /* for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } */
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println("Current Value: " + array[j]);
                System.out.println("Next Value: " + array[j + 1]);
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println("Switched!");
                }
            }
        }
        System.out.println("Done");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j+1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;
    }

    public static int[] selectionSort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i+1; j < array.length; j++) { //starts from i+1 to avoid repeats. Goes to end then switches
                //System.out.println("---------------");
                //System.out.println("Current Value: " + array[j]);
                //System.out.println("Current Min: " + array[minIndex]);
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            //System.out.println("\nNew Loop\n");
        }
        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        return array;
    }

    public static String[] selectionSort(String[] array) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j].compareToIgnoreCase(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        return array;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        int minIndex;
        for (int i = 0; i < list.size(); i++) {
            minIndex = i;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j).compareToIgnoreCase(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
        return list;
    }

}
