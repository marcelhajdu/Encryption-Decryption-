import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        double result = 9.8 * density * height;

        System.out.printf("%.3f",result);
    }
}