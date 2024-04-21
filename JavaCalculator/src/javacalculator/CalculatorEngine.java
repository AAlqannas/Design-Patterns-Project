/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacalculator;

public class CalculatorEngine {

    public double calculate(String expression) throws Exception {
        String[] parts = expression.split(" ");

        if (parts.length != 3) {
            throw new Exception("Invalid expression format. Use: number operator number");
        }

        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[2]);

        switch (parts[1]) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new Exception("Invalid operator: " + parts[1]);
        }
    }
}