package gr11review.part1;
import java.io.*;


public class Review1{

    
    public static void main(String[] args) throws IOException {

        int intMonth = 0;
        int intDay = 0;
        int intDays = 0;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(keyboard.readLine());
        
        if(intMonth == 1) {
            intDays = 1;
        } else {
            if(intMonth == 2) {
                intDay = 32;
            } else {
                if (intMonth == 3) {
                    intDays = 60;
                } else {
                    if(intMonth == 4) {
                        intDays = 91 ;
                    } else {
                        if (intMonth == 5 ) {
                            intDays = 121;
                        } else{
                            if(intMonth == 6) {
                                intDays = 152;
                            } else {
                                if(intMonth == 7) {
                                    intDays = 182;
                                } else {
                                    if(intMonth == 8) {
                                        intDays = 213;
                                    } else {
                                        if (intMonth == 9) {
                                            intDays = 244;
                                        } else {
                                            if(intMonth == 10) {
                                                intDays = 274;
                                            } else {
                                                if(intMonth == 11) {
                                                    intDays = 305;
                                                }
                                                else{
                                                    if(intMonth == 12) {
                                                        intDays = 335;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        

        if(intMonth != 0) {
            intDay--;
        }

        intDays = intDays + intDay;

        System.out.println(intDays);


    }
 



}