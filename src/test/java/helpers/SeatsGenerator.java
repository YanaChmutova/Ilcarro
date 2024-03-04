package helpers;

import java.util.Random;

public class SeatsGenerator {
    //    public static void main(String[] args) {
//        System.out.println("YEAR: " +generateSeats());
//    } проверка на работоспособность
    private static final int MIN_LENGTH = 2;
    private static final int MAX_LENGTH = 20;

    public static String generateSeat(){
        Random random = new Random();
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH-1)+MIN_LENGTH;
        StringBuilder seats = new StringBuilder();
        for(int i=0; i<length; i++){
            if(i==0){
                seats.append(random.nextInt(7)+2);
            }else{seats.append(random.nextInt(10));
            }
        }
        return seats.toString();
    }
}
