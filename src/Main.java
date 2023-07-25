import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }




    public static void task1 () {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 1 ===========");
        System.out.println("============================");
        for (int i = 1; i<11; i++ ) {
            System.out.println(i);// Пишем код для задачи 2
        }
        System.out.println("===== Конец задачи 1 =======");
         // Пишем код для задачи 1
    }

    public static void task2 () {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 2 ===========");
        System.out.println("============================");
        for (int i = 10; i>0; i=i-1) {
            System.out.println(i);// Пишем код для задачи 2
        }
        System.out.println("===== Конец задачи 2 =======");

    }
    private static void task3() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 3 ===========");
        System.out.println("============================");
        for(int i=0; i<17; i=i+2) {
            System.out.println(i);
        }
        System.out.println("===== Конец задачи 3 =======");
    }
    private static void task4() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 4 ===========");
        System.out.println("============================");
        for (int i=10; i>-11; i=i-1) {
            System.out.println(i);
        }
        System.out.println("===== Конец задачи 4 =======");
    }
    private static void task5() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 5 ===========");
        System.out.println("============================");
        for (int i=1904; i<2097; i=i+4){
            System.out.println(i + " год является високосным");
        }
        System.out.println("===== Конец задачи 5 =======");
    }
    private static void task6() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 6 ===========");
        System.out.println("============================");
        for (int i=7; i<99; i=i+7) {
            System.out.println(i);
        }
        System.out.println("===== Конец задачи 6 =======");
    }
    private static void task7() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 7 ===========");
        System.out.println("============================");
        for (int i=1; i<513; i=i*2) {
            System.out.println(i);
        }
        System.out.println("===== Конец задачи 7 =======");

    }
    private static void task8() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 8 ===========");
        System.out.println("============================");
        int money = 29000;
        int savings = 0;
        int month = 0;
        for (int i=0; i<12; i++) {
            savings=savings+money;
            month++;
            System.out.println("Месяц" + month +" , сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("===== Конец задачи 8 =======");
    }
    private static void task9() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 9 ===========");
        System.out.println("============================");
        int money = 29000;
        double savings = 0;
        int month = 0;
        int moneyWithPercent=money*100;
        int savingWithPercent=0;
        for (int i=0; i<12; i++) {
            savingWithPercent= savingWithPercent+savingWithPercent/100;
            savingWithPercent= savingWithPercent + moneyWithPercent;
            savings= savingWithPercent/100.;
            month++;
            System.out.println("Месяц " + month +", сумма накоплений равна " + savings+ " рублей");
        }
        System.out.println("===== Конец задачи 9 =======");

    }
    private static void task10() {
        System.out.println("");
        System.out.println("=============================");
        System.out.println("======= Задача 10 ===========");
        System.out.println("=============================");
        int two = 2;
        int multiplication=0;
        int multiplier = 0;
        for (int i=0; i<10; i++){
            multiplier=multiplier+1;
            multiplication=two*multiplier;
            System.out.println(two + "*" + multiplier + "=" + multiplication);
        }
        System.out.println("===== Конец задачи 10 =======");

    }


}