public class Main {
    public static void main(String[] args) {
        int[] numbers = {20, 22, 56, 48, 18, 29, 3, 30};
        int lowestNumber = numbers[0];
        for (int number : numbers) {
            if (number < lowestNumber) {
                lowestNumber = number;
            }
        }
        System.out.println(lowestNumber);
    }
}