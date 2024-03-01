import java.util.Scanner;

public class Inverso {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];

        for(int i = 0; i < 10; i++) {

            System.out.print("Digite 10 números inteiros um por vez: ");
            numbers[i] = scanner.nextInt();
        }

        for(int i = 9; i >= 0; i--) {

            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
