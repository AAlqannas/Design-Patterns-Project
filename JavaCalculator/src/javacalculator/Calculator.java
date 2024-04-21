/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacalculator;

import java.util.Scanner;

public class Calculator {

    private Scanner scanner;
    private CalculatorEngine engine;

    public Calculator() {
        scanner = new Scanner(System.in);
        engine = new CalculatorEngine();
    }

    public void run() {
        while (true) {
            System.out.print("Enter calculation (e.g., 2 + 3): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                double result = engine.calculate(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}