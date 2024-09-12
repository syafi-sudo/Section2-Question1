import java.util.Arrays;

class CustomInteger {
    private int value;

    public CustomInteger(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}

public class Sort {
    public static void main(String[] args) {
        CustomInteger[] arr = {
            new CustomInteger(12), 
            new CustomInteger(8), 
            new CustomInteger(15), 
            new CustomInteger(5), 
            new CustomInteger(2)
        };

        System.out.print("Before sorting: ");
        printArray(arr);

        sortCustomIntegers(arr);

        System.out.print("After sorting: ");
        printArray(arr);
    }

    public static void printArray(CustomInteger[] arr) {
        for (CustomInteger ci : arr) {
            System.out.print(ci + " ");
        }
        System.out.println();
    }

    public static void sortCustomIntegers(CustomInteger[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getValue() > arr[j + 1].getValue()) {
                    goodSwap(arr[j], arr[j + 1]);
                }
            }
        }
    }

    public static void goodSwap(CustomInteger a, CustomInteger b) {
        int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
}
