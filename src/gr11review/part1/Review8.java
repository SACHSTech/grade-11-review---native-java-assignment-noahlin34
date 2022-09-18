package gr11review.part1;
import java.util.Random;

public class Review8 {

    public static void main(String[] args) {

        Random random = new Random();

        int int1;
        int int2;
        int int3;
        int intTripleCounter =0;

        for(int x = 0; x < 1000; x++) {

            int1 = random.nextInt(9);
            int2 = random.nextInt(9);
            int3 = random.nextInt(9);

            if(int1 == int2 && int1 == int3) {
                intTripleCounter++;
            }

            System.out.println(int1 + " " + int2 + " " +  int3);
        }

        System.out.println(intTripleCounter);

    }

}