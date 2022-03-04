/**
 * JavaHomeWork5
 * @author OksanaAkchurina
 * version 03.03.2022
 */

 class Lesson5 {

     public static void main (String [] args) {
          Employee [] employees = {
                  new Employee("Сергеева Инна", "Бухгалтер",
                          "serg@inna.mail.ru", "89058980088", 28000, 35),
                  new Employee("Гуро Андрей", "Инженер",
                          "guro@andre.mail.ru", "9908708765", 54000, 43),
                  new Employee("Антонов Сергей", "Ассистент",
                          "antonov@mail.ru", "9876866544", 29000, 25),
                  new Employee("Данилина Елена", "Оператор колл-центра",
                          "elenadani@yandex.ru", "9899000874", 25000, 42),
                  new Employee("Петров Егор", "Водитель",
                          "egorii123@yandex.ru", "89076574534", 30000, 42)
          };

          for (Employee employee: employees) {
              if (employee.getAge () > 40) {
                  System.out.println(employee);
              }
          }
     }
}

 class Employee {
     private String name;
     private String position;
     private String email;
     private String phone;
     private int salary;
     private int  age;

     public Employee (String name, String position, String email, String phone,
                      int salary, int age) {
         this.name = name;
         this.position = position;
         this.email = email;
         this.phone = phone;
         this.salary = salary;
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     @Override
     public String toString () {
         return (name +
                 "\n- Position:" + position +
                 "\n- Email:" + email +
                 "\n- Phone:" + phone +
                 "\n- Salary:" + salary +
                 "\n- Age:" + age );
 }

}