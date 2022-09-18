package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review7{

    public static void main(String[] args) throws IOException{

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String stringInput = keyboard.readLine();
        

        System.out.println("There are " + stringInput.length() + " characters in the sentence.");

        int intSpaceCount = 0;

        for(int x = 0; x < stringInput.length(); x++) {
            if(stringInput.charAt(x) == ' ') {
                intSpaceCount++;
            }
        }

        System.out.println("There are " + intSpaceCount + " spaces in the sentence.");

        int intCharACount = 0;

        for(int y = 0; y < stringInput.length(); y++) {
            if(stringInput.charAt(y) == 'a') {
                intCharACount++;
            }
        }

        System.out.println("There are " + intCharACount + " letter a in the sentence.");

        int intOddCount = 0;
        String stringOdd = "";

        for(int b = 1; b < stringInput.length() + 1; b++) {
            if(b % 2 != 0) {
                stringOdd = stringOdd + "-";
            }
        }

        System.out.println(stringOdd);




    }

}