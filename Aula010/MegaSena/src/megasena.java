import java.util.Random;

public class megasena {

    public static void main(String[] args){

        int x = 0;
        Random generate = new Random();
        while(x < 6){
            int number = generate.nextInt(60);
            System.out.println(number);
            x++;
        }
    }
}
