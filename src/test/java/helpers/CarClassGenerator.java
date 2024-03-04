package helpers;

import java.util.Random;

public class CarClassGenerator {
    //    public static void main(String[] args) {
//        System.out.println("CARCLASS :"+generateCarClass());
//    }
    private static final String[] carClass = {"A", "B", "C", "D", "E"};
    private static final Random random = new Random();
    public static String generateCarClass(){
        String street = carClass[random.nextInt(carClass.length)];
        int number = random.nextInt(300);
        return carClass+ " ";

    }

}
