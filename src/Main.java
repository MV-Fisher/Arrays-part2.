public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] maiArray = new int[30];
        for (int i = 0; i < maiArray.length; i++) {
            maiArray[i] = random.nextInt(100_000) + 100_000;
        }
        return maiArray;
    }
    public static void task1() {
        printNumberTask(1);
        int[] maiArray = generateRandomArray();
        int sum = 0;
        for (int element : maiArray) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task2() {
        printNumberTask(2);
        int[] maiArray = generateRandomArray();
        int maXmaiArray = 0;
        for (final int current : maiArray) {
            if (current > maXmaiArray) {
                maXmaiArray = current;
            }
        }
        System.out.println("Максимальная сумма трат за месяц составила " + maXmaiArray + " рублей.");
        int min = maiArray[0];
        for (int i = 1; i < maiArray.length; i++) {
            if (maiArray[i] < min) {
                min = maiArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей.");
    }
    public static void task3() {
        printNumberTask(3);
        int[] maiArray = generateRandomArray();
        int sum = 0;
        double days = 30;
        for (int element : maiArray) {
            sum += element;
        }
        double srSum = sum / days;
        System.out.println("Средняя сумма трат за месяц  составила " + srSum + " рублей.");
    }
    public static void task4() {
        printNumberTask(4);
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //Первый элемент должен стать последним, а последний первым. Второй элемент должен стать предпоследним
        // а предпоследний вторым, покаа все буквы не встанут в правильном порядке. Не записывать первый элемент
        // в последний, он затрет собой последний и его уже не подставишь на место первого.
        int j = reverseFullName.length - 1;
        int k = 0;
        // Так как слов должно получиться два цикл идёт до середины массива.
        for (int i = 0; i < reverseFullName.length / 2; i = i + 1) {
        // В переменную x записываем первый элемент массива.
        // В переменную y записываем последний элемент массива.
        // Затем из первой пишем в последний, а из второй в первый.
            char x = reverseFullName[k];
            char y = reverseFullName[j];
            reverseFullName[k] = y;
            reverseFullName[j] = x;
            j--;
            k++;
        }
        System.out.println(reverseFullName);
    }
    public static void printNumberTask(int num) {System.out.println("Задача № " + num + ".");
    }
}
// Домашнее задание считаю выполненным.
