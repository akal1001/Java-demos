/**
 * Created by User on 12/16/2016.
 */
public class ArrayStructures {

    private int[] myArray = new int[50];
    private int arraySize = 10;

    //fill array with random number
    public void genRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    //print
    public void displayArray() {
        System.out.println("-----------");
        for (int i = 0; i < arraySize; i++) {

            System.out.print("| " + i + " | ");

            System.out.println(myArray[i] + " |");
            System.out.println("----------");
        }

    }

    //search element
    public boolean searchArray(int searchInput) {
        boolean bValue = false;
        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] == searchInput) {
                bValue = true;
            }
        }
        return bValue;
    }

    //get element by its index
    public int getValueAtIndex(int index) {

        if (index < arraySize) {
            return myArray[index];
        } else {
            return 0;
        }
    }

    //Remove index
    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = 0; i < arraySize - 1; i++) {
                myArray[i] = myArray[i + 1];
            }
            arraySize--;
        }
    }

    //Insert value at the end
    //arraySize will be last index
    public void insertValue(int value) {

        if (arraySize < 50) {
            myArray[arraySize] = value;
            arraySize++;
        }
    }

    //linear search
    // go through every index
    public String linnearSearch(int value) {
        boolean boleanValue = false;

        String indexWithValue = "";
        System.out.print("Value was found the following indexes: ");

        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] == value) {
                boleanValue = true;
                System.out.print(i + " ");
                indexWithValue += i + " ";
            }
        }
        if (!boleanValue) {

            indexWithValue = "None!";
            System.out.print(indexWithValue);
        }
        System.out.println();
        return indexWithValue;

    }
}