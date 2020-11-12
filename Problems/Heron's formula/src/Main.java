import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double area = (a+b+c)/2.0d;
        double resArea = Math.sqrt(area* (area - a) * (area - b) * (area - c));

        System.out.println(resArea);
    }
}