import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Calculator calculate = new Calculator();

    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command: ");

    Scanner in = new Scanner(System.in);
    int a;
    int b;
    while (true) {
      String s = in.next();
      if (s.equals("add")) {
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(calculate.add(a, b));
      } else if (s.equals("subtract")) {
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(calculate.subtract(a, b));
      } else if (s.equals("multiply")) {
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(calculate.multiply(a, b));
      } else if (s.equals("divide")) {
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(calculate.divide(a, b));
      } else if (s.equals("fibonacci")) {
        a = in.nextInt();
        System.out.println(calculate.fibonacciNumberFinder(a));
      } else if (s.equals("quit")) {
        System.out.println("Goodbye");
        break;
      } else {
        a = in.nextInt();
        System.out.println(calculate.intToBinaryNumber(a));
      }
    }
  }
}
