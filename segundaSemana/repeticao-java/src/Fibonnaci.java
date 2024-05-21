public class Fibonnaci {

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Sequência de Fibonacci até " + n + ":");

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }
}