/**
 * File: Calc.java
 * Author: Lillie Logue
 * Date: 2/17/2025
 * Description: This program defines a Calc class that allows basic order of 
 * operations on two numbers. 
 */
public class Calc {
    private double num1;
    private double num2;

    public Calc() {
        this.num1 = 0;
        this.num2 = 0;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public double add() {
        return num1 + num2;
    }
    public double subtract() {
        return num1 - num2;
    }
    public double multiply() {
        return num1 * num2;
    }
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
    }
    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n" +
               "Num1: " + num1 + "\n" +
               "Num2: " + num2;
    }
}
