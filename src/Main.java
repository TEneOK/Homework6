public class Main {
    public static void main(String[] args) {
        System.out.println("-_-__Task1__-_-");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-_-__Task2__-_-");
        for (int i = 10; i > 1; i--) {
            System.out.println(i);
        }

        System.out.println("-_-__Task3__-_-");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("-_-__Task4__-_-");
        for (int i = -10; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-_-__Task5__-_-");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("-_-__Task6__-_-");
        for (int i = 7; i < 104; i += 7) {
            System.out.println(i);
        }

        System.out.println("-_-__Task7__-_-");
        for (int i = 1; i < 1024; i *= 2) {
            System.out.println(i);
        }

        System.out.println("-_-__Task8__-_-");
        int savings = 29000;
        int jar = 0;
        for (int i = 0; i <= 12; i++) {
            jar = jar + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + jar + " рублей");
        }

        System.out.println("-_-__Task9__-_-");
        int contribution = 0;
        for (int i = 0; i <= 12; i++) {
            contribution=contribution+contribution/100;
            contribution = contribution + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + contribution + " рублей");
        }

        System.out.println("-_-__Task10__-_-");
        for (int i = 1; i <= 10 ; i++){
            int result = i* 2;
            System.out.println("2*" + i+ "=" + result);
        }
    }
}