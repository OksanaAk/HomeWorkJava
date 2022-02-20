/**
 * JavaHomework#3
 * @author OksanaAkchurina
 * version 19.02.2022
 */
import java.util.Arrays;
public class WorkApp3 {
    //1
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
        integerArray();
        changeArray();
        fillDiagonal();
        createTwoArguments(8,5);
    }

    //2
    public static void integerArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            System.out.print(arr[i] = i + 1);
        }
    }

    //3
    static void changeArray() {
        int [] arrThree = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println (Arrays.toString(arrThree));
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6)
                arrThree[i] *= 2;
        }
        System.out.println(Arrays.toString(arrThree));
    }

    //4
    static void fillDiagonal() {
        int [][] arrFour = new int [7][7];
        for (int i =0; i < arrFour.length; i ++) {
            arrFour[i][i] = 1;
            arrFour[i][arrFour.length - i - 1] = 1;
        }
        for (int i =0; i < arrFour.length; i ++) {
            System.out.println(Arrays.toString(arrFour[i]));
        }
    }
    //5
    static void createTwoArguments(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}






