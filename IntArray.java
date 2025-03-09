import java.util.Random;
public class IntArray {
    private int length;
    private int[] myArray;
    public IntArray(int length) {
        if (length <= 0) {
            System.out.println("Array length must be greater than zero. Default size should be 10.");
            length = 10;
        }
        this.length = length;
        myArray = new int[length];
    }
    public int size() {
        return length;
    }
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }
    public void set(int index, int value) {
        if (index < 0 || index >= length) {
            System.out.println("Index out of bounds");
            return;
        }
        myArray[index] = value;
    }
    public int get(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Index out of bounds");
            return -1;
        }
        return myArray[index];
    }
    public void clear() {
        for (int i = 0; i < length; i++) {
            myArray[i] = 0;
        }
    }
    public boolean isEmpty() {
        for (int num : myArray) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < length; i++) {
            result += myArray[i];
            if (i < length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
