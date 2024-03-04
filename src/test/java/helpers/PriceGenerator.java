package helpers;

import java.util.Random;

public class PriceGenerator {
    //    public static void main(String[] args) {
//        System.out.println("PRICE: " +generatePrice());
//    } проверка на работоспособность
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 15;

    public static String generatePrice(){
        Random random = new Random();
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH-1)+MIN_LENGTH;
        StringBuilder price = new StringBuilder();
        for(int i=0; i<length; i++){
            if(i==0){
                price.append(random.nextInt(7)+2);
            }else{price.append(random.nextInt(10));
            }
        }
        return price.toString();
    }
}
