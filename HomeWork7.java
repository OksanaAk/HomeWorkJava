/**
 * JavaHomeWork7
 * @author OksanaAkchurina
 * version 08/03/2022
 */
 class HomeWork7 {
     public static void main(String[] args) {
         Cat[] cats = {
                 new Cat("Funtik", 15), new Cat("Bantik", 10), new Cat("Persik", 20)
         };
         Plate plate = new Plate(30,50);
             System.out.println(plate);

         for (Cat cat : cats) {
             cat.eat(plate);
             System.out.println(cat);
         }

         System.out.println(plate);
         plate.add(40);
         System.out.println(plate);

         for (Cat cat : cats) {
             cat.setFullness(false);
             cat.eat(plate);
             System.out.println(cat);
         }
         System.out.println(plate);
     }
 }
 class Cat {
     private String name;
     private int appetite;
     private boolean fullness;

     Cat (String name, int appetite) {
         this.name = name;
         this.appetite = appetite;
         fullness = false;
     }

     void setFullness(boolean status) {
         fullness = status;
     }

     void eat(Plate plate) {
         if (!fullness) {
             fullness = plate.decreaseFood(appetite);
         }
     }

     @Override
     public String toString() {
         return "{name=" + name +", appetite=" +
             appetite + ", fullness=" + fullness +  "}";
     }
 }

 class Plate {
     private int food;
     private int volume;

     Plate( int food, int volume) {
         this.food = food;
         this.volume = volume;
     }

     boolean decreaseFood (int portion) {
         if (food < portion) {
             return false;
         }
         food -= portion;
         return true;
     }

     void add (int food) {
         if (this.food + food <=volume) {
             this.food +=food;
         }
     }

     @Override
     public String toString () {
         return "plate:" + food;
     }
 }


