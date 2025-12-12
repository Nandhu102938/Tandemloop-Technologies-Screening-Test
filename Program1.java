import java.util.Scanner;

class Calculator {
    private double a;
    private double b;
    private String op;

    public Calculator(double a, double b, String op) {
        this.a = a;
        this.b = b;
        this.op = op.trim().toLowerCase();
    }

    public double compute() {
        switch (op) {
            case "add":
            case "addition":
            case "+":
                return a + b;
            case "sub":
            case "subtract":
            case "minus":
            case "-":
                return a - b;
            case "mul":
            case "multiply":
            case "x":
            case "*":
                return a * b;
            case "div":
            case "divide":
            case "/":
                if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Calculator — enter a, b and operation (add, sub, mul, div or + - * /)");
            System.out.print("a = ");
            double a = Double.parseDouble(sc.nextLine().trim());
            System.out.print("b = ");
            double b = Double.parseDouble(sc.nextLine().trim());
            System.out.print("operation = ");
            String op = sc.nextLine().trim();
            Calculator calc = new Calculator(a, b, op);
            double result = calc.compute();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
