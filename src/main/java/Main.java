import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();


        while (true) {

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a command: ");
            String command = myObj.nextLine();

            String[] commandList = command.split(" ");

            String op = commandList[0];
            int a = Integer.parseInt(commandList[1]);
            int b = 0;
            if (commandList.length == 3) {
                b = Integer.parseInt(commandList[2]);
            }

            if (op.equals("add")) {
                System.out.println(calc.add(a, b));
            }
            if (op.equals("sub")) {
                System.out.println(calc.subtract(a, b));
            }
            if (op.equals("div")) {
                System.out.println(calc.divide(a, b));
            }
            if (op.equals("mult")) {
                System.out.println(calc.multiply(a, b));
            }
            if (op.equals("bin")) {
                System.out.println(calc.intToBinaryNumber(a));
            }
            if (op.equals("fib")) {
                System.out.println(calc.fibonacciNumberFinder(a));
            }
        }
    }
}