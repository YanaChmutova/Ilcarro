package helpers;

import java.util.Random;

public class YearGenerator {
    //    public static void main(String[] args) {
//        System.out.println("YEAR: " +generateYear());
//    } проверка на работоспособность
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 20;

    public static String generateYear(){
        Random random = new Random();
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH-1)+MIN_LENGTH;
        StringBuilder year = new StringBuilder();
        for(int i=0; i<length; i++){
            if(i==0){
                year.append(random.nextInt(7)+2);
            }else{year.append(random.nextInt(10));
            }
        }
        return year.toString();
    }
}
