package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;


public class Review6{

    public static void main (String[] args) throws IOException {

       BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        DecimalFormat myFormat = new DecimalFormat("$0.00");

        double inputValue = 0;
        double runningPrice = 0;

        System.out.print("Enter the price for an item: ");

        inputValue = Double.parseDouble(keyboard.readLine());

        runningPrice = runningPrice + inputValue;



        while (inputValue > 0) {

        
            System.out.print("Enter the price for an item: ");
            inputValue = Double.parseDouble((keyboard.readLine()));
            runningPrice = runningPrice + inputValue;
        } 

        System.out.println("Subtotal: " + myFormat.format(runningPrice));
        System.out.println("Tax: " + myFormat.format(runningPrice * 0.13));
        System.out.println("Total: " + myFormat.format(runningPrice * 1.13));





    }

}