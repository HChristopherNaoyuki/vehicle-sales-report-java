package Solution;

// Java program to display a monthly sales report for vehicle types
// and a summary with total sales and status.

public class VehicleSalesReport
{
    public static void main(String[] args)
    {
        // Initialize the sales data in a 2D array (columns: Jan, Feb, Mar; rows: vehicle types).
        int[][] sales = {
            {25, 15, 35}, // SUV sales for Jan, Feb, Mar
            {25, 55, 35}, // Coupe sales for Jan, Feb, Mar
            {11, 20, 45}, // Sedan sales for Jan, Feb, Mar
            {17, 27, 25}  // Van sales for Jan, Feb, Mar
        };

        // Array of vehicle type names corresponding to rows in the sales array.
        String[] vehicleTypes = {"SUV", "COUPE", "SEDAN", "VAN"};

        // Print the top border and the title for the report.
        System.out.println("*********************************************");
        System.out.println("VEHICLE SALES REPORT");
        System.out.println("*********************************************");

        // Print the header for monthly sales data.
        System.out.println("Vehicle\t\tJAN\tFEB\tMAR");

        // Loop through each vehicle type to print sales data.
        for (int i = 0; i < sales.length; i++)
        {
            // Print the name of the vehicle type, followed by monthly sales.
            System.out.printf("%-10s\t", vehicleTypes[i]);

            for (int j = 0; j < sales[i].length; j++)
            {
                // Align the sales numbers to be consistent with columns.
                System.out.printf("%-8d", sales[i][j]);
            }
            System.out.println();
        }

        // Print the separator and title for total sales section.
        System.out.println("*********************************************");
        System.out.println("VEHICLE TOTAL SALES");
        System.out.println("*********************************************");

        // Loop through each vehicle type to calculate and display total sales and status.
        for (int i = 0; i < sales.length; i++)
        {
            int totalSales = 0; // Variable to accumulate total sales for the vehicle type.

            // Calculate the total sales for the current vehicle type.
            for (int j = 0; j < sales[i].length; j++)
            {
                totalSales += sales[i][j];
            }

            // Determine the sales status based on the total sales.
            String status = (totalSales >= 100) ? "Gold Star" : "Silver Star";

            // Print the vehicle type, total sales, and status with consistent alignment.
            System.out.printf("%-10s\t%-8d(%s)\n", vehicleTypes[i], totalSales, status);
        }

        // Print the closing border.
        System.out.println("*********************************************");
    }
}
