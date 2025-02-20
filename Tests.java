
/**
 * File: Tests.java
 * Author: Lillie Logue
 * Date: 2/13/2025
 * Description:  input test scores, calculate the average, and display formatted output.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Tests {
    private double ave;
    private int count;
    private int score;
    
    public Tests() {
        this.ave = 0.0;
        this.count = 0;
        this.score = 0;
    }
    
    public double getAve() {
        return ave;
    }
    
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        count = 0;
        
        System.out.println("Enter test scores (-1 to quit):");
        int input = scanner.nextInt();
        
        while (input != -1) {
            sum += input;
            count++;
            System.out.println("Enter test scores (-1 to quit):");
            input = scanner.nextInt();
        }
        
        if (count > 0) {
            ave = (double) sum / count;
        } else {
            ave = Double.NaN;
        }
    }
    
    public int getCount() {
        return count;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int newScore) {
        this.score = newScore;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "The average of the " + count + " scores entered is " + df.format(ave);
    }
}
