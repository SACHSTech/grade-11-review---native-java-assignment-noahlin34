package gr11review.part1;
import java.io.*;

public class Review2{


    public static void main(String[] args) throws IOException {


        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        System.out.print("Choose a menu option: ");

        int  userselection = Integer.parseInt(keyboard.readLine());

        if(userselection == 0) {
            System.out.println("Why do bees have sticky hair?");
            System.out.println("They always use honeycombs.");

        } else {
            if(userselection == 1) {
            System.out.println("Why do bees have sticky hair?");
            System.out.println("They always use honeycombs.");
            } else {
                if(userselection == 2) {
                    System.out.println("Why do bees have sticky hair?");
                    System.out.println("They always use honeycombs.");
                } else {
                    if(userselection == 3) {
                        System.out.println("Why do bees have sticky hair?");
                        System.out.println("They always use honeycombs.");
                    } else {
                        System.out.print("Invalid menu option");
                    }
                }
            }
        }



    }
}