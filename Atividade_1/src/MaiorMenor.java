import java.util.Random;
import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        
    

    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    int[] array = new int[100];

    for(int i = 0; i < 100; i++) {

        array[i] = random.nextInt(200);
        
    }
    int Maior = 0;
    int Menor = 200;

    for (int i = 0; i < 100; i++) {
        if(array[i] > Maior) {
            Maior = array[i];
        }
    }
    for (int i = 0; i < 100; i++) {
        if(array[i] < Menor) {
            Menor = array[i];
        }
    }

    System.out.println("Maior número: " + Maior);
    System.out.println("Menor número: " + Menor);
    
    scanner.close();
    
    }
    
}

