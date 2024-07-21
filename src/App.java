import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(findMissingInt(arr));

        System.out.println(Arrays.toString(consecutiveInsert(arr, 3)));
        ;
    }

    public static int findMissingInt(int[] arr) {
        int currentNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == currentNum) {
                currentNum++;
            }
        }
        return currentNum;
    }

    public static int[] consecutiveInsert(int[] arr, int missingNum) {

        // {0,0,0,0,0}
        // { 1,2,4,5}
        int[] newArray = new int[arr.length + 1];

        int currentNum = arr[0]; // 1 => 2 => 3

        newArray[newArray.length - 1] = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == currentNum) {
                currentNum++;
                newArray[i] = arr[i];
            } else if (arr[i] != currentNum) {
                newArray[i] = currentNum;
                currentNum++;
            }
        }

        return newArray;

    }

    // static void showArray() {
    // int[] num1 = { 1, 2, 4, 5, 6 };

    // int[] num = new int[num1.length + 1];

    // num[1] = 2;
    // System.out.println(Arrays.toString(num));

    // for (int i = 0; i < num1.length; i++) {
    // num[i] = num1[i];

    // System.out.println(Arrays.toString(num));
    // }
    // }
}
