public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача №2
        System.out.println("Задача №2");
        for (int s = 10; s >= 1; s--) {
            System.out.println(s);
        }
        //Задача №3
        System.out.println("Задача №3");
        for (int q = 0; q < 17; q = q + 2) {
            System.out.println(q);
        }
        //Задача №4
        System.out.println("Задача №4");
        for (int w = 10; w >= -10; w--) {
            System.out.println(w);
        }
        //Задача №5
        System.out.println("Задача №4");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " годя является високосным");
        }
        //Задача №6
        System.out.println("Задача №6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //Задача №7
        System.out.println("Задача №7");
        for (int i = 1; i <= 512; i = i + i) {
            System.out.println(i);
        }
        //Задача №8-9
        System.out.println("Задача №8-9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
}
