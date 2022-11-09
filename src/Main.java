import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {-45.5, 7.7, -9.63, 5.12, 6.95, -7.36, -55.5, -48.3,
                6.55, 9.99, 6.05, -86.4, 2.9, 3.14, -1.03};
        double average = 0.0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] > 0) {
                        average = average + numbers[j];
                        count++;
                    }

                }
                break;
            }
        }
        System.out.println("Среднее арифметическое " + average / count);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double num = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = num;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }

    }
}