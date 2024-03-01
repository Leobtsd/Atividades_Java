import java.util.Random;
import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        
    

    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    int[] array = new int[100];

    double media = 0;

    for(int i = 0; i < 100; i++) {

        array[i] = random.nextInt(200);
        
    }
    for (int i = 0; i < 100; i++) {
        
        media += array[i];
        
    }
    media = media / array.length;

    System.out.println("A média dos números é: " + media);
    
    scanner.close();
    
    }

}
    