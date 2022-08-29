import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задание 1

      int[] myArray = new int[29];
        int sum = 0;
       for (int i = 0; i < myArray.length; i++) {
           Random random = new Random();
           myArray[i] = random.nextInt(100_000) + 100_000;
            sum += myArray[i];
        }
       System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задание 2



        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            Random random = new Random();
            myArray[i] = random.nextInt(100_000) + 100_000;
            if (max < myArray[i]) {
                max = myArray[i];
        }
        }
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            Random random = new Random();
            myArray[i] = random.nextInt(100_000) + 100_000;
            if (max > myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");


        //Задание 3

        double avg = 0;
        for (int i = 0; i < myArray.length; i++) {
            Random random = new Random();
            myArray[i] = random.nextInt(100_000) + 100_000;
            avg += (double) myArray[i] / myArray.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");


        //Задание 4

        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

    }
}


