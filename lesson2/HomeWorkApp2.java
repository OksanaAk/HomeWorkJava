/**
 * Java.Homework #2
 * @author OksanaAkchurina
 * version 16.02.2022
 */
package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(inRangeFrom10to20(5, 7));
        System.out.println(inRangeFrom10to20(12, -7));
        System.out.println(inRangeFrom10to20(12, 9));
        printPositiveorNegative(5);
        printPositiveorNegative(-3);
        System.out.println(numberNegative(-7));
        System.out.println(numberNegative(3));
        repeatLine("cat", 5);
    }

    static boolean inRangeFrom10to20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void printPositiveorNegative(int j) {
            System.out.println(j >=0?"Число положительное":"Число отрицательное");
    }
    static boolean numberNegative( int x) {
        return x<0;
    }

    static void repeatLine(String word, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}



