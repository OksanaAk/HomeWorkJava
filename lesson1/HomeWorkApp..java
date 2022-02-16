package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(0,9);
        printColor(78);
        compareNumbers(3,35);

    }

     static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

     static void checkSumSign(int a,int b) {
            System.out.println( a +b >=0?"Сумма положительная": "Сумма отрицательная");
    }

     static void printColor(int value) {
        if (value <=0) {
            System.out.println("Красный");
        } else if (value >0 && value<=100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

     static void compareNumbers(int a,int b) {
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
        }

}
















