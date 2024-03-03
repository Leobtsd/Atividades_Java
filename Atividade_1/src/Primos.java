import java.util.Random;

public class Primos {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numeros[i] = random.nextInt(200); 
        }

        System.out.println("Números primos no array:");

        for (int i = 0; i < 100; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
