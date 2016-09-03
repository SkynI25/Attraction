package calculator;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiFunction;

public class calculator {
    
    public static HashMap<Character, BiFunction<Double, Double, Double>> operators = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputExprssion;

        String arg1;
        String arg2;

        double num1 = 0;
        double num2 = 0;
        
        double result;

        inputExprssion = sc.nextLine();

        operators.put('^', (a, b) -> Math.pow(a, b));
        operators.put('+', (a, b) -> a + b);
        operators.put('-', (a, b) -> a - b);
        operators.put('*', (a, b) -> a * b);
        operators.put('/', (a, b) -> {
                                        if(b == 0) {
                                            throw new ArithmeticException("0으로 나누시면 안되요.");
                                        }
                                            
                                        return a / b;
        });

        for (int i = 0; i < inputExprssion.length(); i++) {
            if(isOperator(inputExprssion.charAt(i))) {
                num1 = getNum1(inputExprssion, i);
                num2 = getNum2(inputExprssion, i);
                
                try {
                    result = calculate(inputExprssion.charAt(i), num1, num2);
                    System.out.println(result);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
                break;
            }
        }
    }
    
    public static double getNum1(String input, int i) {
        String str = input.substring(0, i);
        return Double.parseDouble(str);
    }
    
    public static double getNum2(String input, int i) {
        String str = input.substring(i + 1);
        return Double.parseDouble(str);
    }
    
    public static boolean isOperator(char c) {
        return operators.containsKey(c);
    }
    
    public static double calculate(char op, double num1, double num2) {
        return operators.get(op).apply(num1, num2);
    }
}