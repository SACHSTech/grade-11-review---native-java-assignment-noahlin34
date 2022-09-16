package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Currency;


public class Review4{
    public static void main(String[] args) throws IOException {

        DecimalFormat myFormat = new DecimalFormat("$0.00");

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many items do you want to buy? ");

        int intNumItems = Integer.parseInt(keyboard.readLine());

        double floatPrice1 = 0;
        double floatPrice2 =0;
        double floatPrice3 = 0;
        double floatPrice4 = 0;

        for(int x = 1; x<intNumItems +1; x++) {
            System.out.print("Enter the price for item " + x + ": ");
            if(x == 1) {
                 floatPrice1 = Float.parseFloat(keyboard.readLine());
            } else {
                if(x == 2) {
                    floatPrice2 = Float.parseFloat(keyboard.readLine());
                }else {
                    if(x == 3) {
                       floatPrice3 = Float.parseFloat(keyboard.readLine());
                    } else {
                        if(x==4) {
                            floatPrice4 = Float.parseFloat(keyboard.readLine());

                        }
                    }
                }
            }
        }




        double intSubtotal = floatPrice1 + floatPrice2 + floatPrice3 + floatPrice4;

        double floattax = intSubtotal * 0.13;

        double doubletotal = intSubtotal * 1.13;

        System.out.println("Subtotal: " + myFormat.format(intSubtotal));
        System.out.println("Tax: " + myFormat.format(floattax));
        System.out.println("Total: " + myFormat.format(doubletotal));



    }
}
