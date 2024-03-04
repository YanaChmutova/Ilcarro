package helpers;

import java.util.Random;

public class RegNumberGenerator {
    //    public static void main(String[] args) {
//        System.out.println("REGNUMBER: " +generateRegNumber());
//    } проверка на работоспособность
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 15;

    public static String generateRegNumber(){
        Random random = new Random();
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH-1)+MIN_LENGTH;
        StringBuilder regNumber = new StringBuilder();
        for(int i=0; i<length; i++){
            if(i==0){
                regNumber.append(random.nextInt(7)+2);
            }else{regNumber.append(random.nextInt(10));
            }
        }
        return regNumber.toString();
    }
}
