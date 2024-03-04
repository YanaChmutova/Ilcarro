package helpers;

import java.util.Random;

public class FuelGenerator {
    //    public static void main(String[] args) {
//        System.out.println("MANUFACTURE :"+generateFuel());
//    }
    private static final String[] fuel = {"Diesel", "Petrol", "Hybrid", "Electric", "Gas"};
    private static final Random random = new Random();
    public static String generateFuel(){
        String street = fuel[random.nextInt(fuel.length)];
        int number = random.nextInt(300);
        return fuel+ " ";

    }

}
