import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    public static void main(String[] args) {
        
    

    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    int[] array = new int[100];

    for(int i = 0; i < 100; i++) {

        array[i] = random.nextInt(200);
        
    }
    for (int i = 0; i < 100; i++) {

        System.out.println(array[i]);

    }
    System.out.println("Inverter..");

    for (int i = 99; i >= 0; i--) {

        System.out.println(array[i]);

    }
    
    scanner.close();
    }
    
}
