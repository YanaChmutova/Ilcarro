package helpers;

import java.util.Random;

public class ModelGenerator {
    //    public static void main(String[] args) {
//        System.out.println("MODEL :"+generateModel());
//    }
    private static final String[] model = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
    private static final Random random = new Random();
    public static String generateModel(){
        String street = model[random.nextInt(model.length)];
        int number = random.nextInt(300);
        return model+ " ";

    }

}
