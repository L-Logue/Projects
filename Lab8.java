import java.io.*;
import java.text.DecimalFormat;

public class Lab8 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("EmpID,PayRate,HoursWorked");
            writer.newLine();
            writer.write("101,25.25,45");
            writer.newLine();
            writer.write("234,28.5,50");
            writer.newLine();
            writer.write("342,30,40");
            writer.newLine();
            writer.write("767,24.5,45");
            writer.newLine();
            writer.write("833,28.75,48");
            writer.newLine();
            writer.write("135,35.5,40");
            writer.newLine();
            writer.write("674,40.25,40");
            writer.newLine();
            writer.write("552,30.25,40");
            writer.newLine();
            System.out.println("pay.csv file created.");
        } catch (IOException e) {
            System.out.println("Error creating pay.csv: " + e.getMessage());
            return;
        }

        DecimalFormat df = new DecimalFormat("$#,##0.00");

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {

            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length != 3) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }

                String empID = parts[0];
                double payRate = Double.parseDouble(parts[1]);
                double hoursWorked = Double.parseDouble(parts[2]);

                double weeklyPay;
                if (hoursWorked > 40) {
                    double overtime = hoursWorked - 40;
                    weeklyPay = (40 * payRate) + (overtime * payRate * 1.5);
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                String formattedPay = df.format(weeklyPay);

                String outputLine = empID + "," + payRate + "," + hoursWorked + "," + formattedPay;
                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("Payroll processing complete. Results written to output.csv");

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}
