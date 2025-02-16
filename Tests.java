
/**
 * File: Tests.java
 * Author: Lillie Logue
 * Date: 2/13/2025
 * Description: Blueprint class to input test scores, calculate the average, and display formatted output.
 */
import java.util.Scanner;
public class Tests 
{
    private double average; 
    private int count; 
    public Tests()
    {
        count = 0;
        average = 0.0;
    }
    public void getAverage()
    {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        count = 0; 
        System.out.println("Enter test scores (-1 to quit):");
        double score = scanner.nextDouble();
        while (score != -1)
        {
            sum += score;
            count++;
            System.out.println("Enter test scores (-1 to quit):");
            score = scanner.nextDouble();
        }
        
        if (count > 0) 
        {
            average = sum / count;
        }
        else 
        {
            average = 0.0; 
        }
    }
    public double getAverageValue()
    {
        return average;
    }

    public int getCount()
    {
        return count;
    }
    public String toString()
    {
        return String.format("The average of the %d scores entered is %.2f", count, average);
    }
}
