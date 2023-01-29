import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    //Задание 1
    private static void task1() {
        //Задание 1
        System.out.println("Task 1");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    //Задание 2
    private static void task2() {
        //Задание 1
        System.out.println("\nTask 2");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > max) {
                max = payments[i];
            }
            if (payments[i] < min) {
                min = payments[i];
            }
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Минимальная сумма трат за день составила " + min +
                    " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        }
    }

    //Задание 3
    private static void task3() {
        System.out.println("\nTask 3");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));

        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", (double) sum / payments.length);
    }
    //Задание 4
    private static void task4() {
        System.out.println("\nTask 4");
        char[] reverseFullName = {'a', 't', 'i', 'k', 'i', 'N'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static int [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int [] arr = new int [30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}