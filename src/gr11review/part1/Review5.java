package gr11review.part1;
import java.io.*;

public class Review5{

    public static void main (String[] args ) throws IOException{
     
        

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter the yearly invested amount: ");

        double yearly = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the compound interest rate: ");

        double rate = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the target amount: ");

        double target = Double.parseDouble(keyboard.readLine());

        double currentamount = 0;

        int years = 0;

        while(currentamount < target){

            if(rate == 0) {
                currentamount = currentamount + yearly;
            }else {
                currentamount = currentamount + yearly;
                currentamount = currentamount * (rate/100) + currentamount;
            }
            years++;
        }

        System.out.println("The target amount will be earned in " + years + " years.");




    }

}