package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Currency;


public class Review4{
    public static void main(String[] args) throws IOException {

        //setups up the decimal formatting
        DecimalFormat myFormat = new DecimalFormat("$0.00");

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many items do you want to buy? ");

        int intNumItems = Integer.parseInt(keyboard.readLine());

        //initial values for the prices (only 4 placeholder values are initialized)
        double doublePrice1 = 0;
        double doublePrice2 =0;
        double doublePrice3 = 0;
        double doublePrice4 = 0;

        //runs the loop as long as the number of items entered
        for(int x = 1; x<intNumItems +1; x++) {
            System.out.print("Enter the price for item " + x + ": ");
            if(x == 1) {
                 doublePrice1 = Float.parseFloat(keyboard.readLine());
            } else {
                if(x == 2) {
                    doublePrice2 = Float.parseFloat(keyboard.readLine());
                }else {
                    if(x == 3) {
                       doublePrice3 = Float.parseFloat(keyboard.readLine());
                    } else {
                        if(x==4) {
                            doublePrice4 = Float.parseFloat(keyboard.readLine());

                        }
                    }
                }
            }
        }



        //calculates the various totals 

        double doubleSubtotal = doublePrice1 + doublePrice2 + doublePrice3 + doublePrice4;

        double doubleTax = doubleSubtotal * 0.13;

        double doubletotal = doubleSubtotal * 1.13;

        System.out.println("Subtotal: " + myFormat.format(doubleSubtotal));
        System.out.println("Tax: " + myFormat.format(doubleTax));
        System.out.println("Total: " + myFormat.format(doubletotal));

        

    }
}
