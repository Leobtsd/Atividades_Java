import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para calcular IMC e 2 para calcular Metabolismo Basal:");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite seu nome:");
                String name = scanner.next();
                System.out.println("Digite seu peso em Kg:");
                double peso = scanner.nextDouble();
                System.out.println("Digite sua altura em metros:");
                double altura = scanner.nextDouble();

                
                double IMC = peso / Math.pow(altura, 2);

                if(IMC < 19) {
                    System.out.println(name + " voçê está abaixo do peso");
                } 
                else if(IMC >= 19 && IMC < 25) {
                    System.out.println(name + " seu peso está normal");
                }
                else if(IMC >= 25 && IMC < 30) {
                    System.out.println(name + " voçê está com sobrepeso");
                }
                else if(IMC >= 30 && IMC < 40) {
                    System.out.println(name + " voçê está com obesidade tipo I");
                }
                else if(IMC >= 40) {
                    System.out.println(name + " voçê está com obesidade morbida");
                }
            break;    

            case 2: 

            System.out.println("Digite seu Gênero: 'M' para masculino e 'F' para feminino:");
            char genero = scanner.next().charAt(0);
            System.out.println("Digite sua idade em anos");
            int idade = scanner.nextInt();
            System.out.println("Digite seu peso em Kg:");
            double pesoo = scanner.nextDouble();

            // Homem e mulher entre 18 3 30
            if(idade >= 18 && idade <= 30 && (genero == 'M' || genero == 'm')) {

                double basal = 15.057 * pesoo + 679;
                System.out.println("Seu metabolismo basal em Kcal é:" + basal);
            }
            else if(idade >= 18 && idade <= 30 && (genero == 'F' || genero == 'f')) {

                double basal = 14.7 * pesoo + 486.6;
                System.out.println("Seu metabolismo basal em Kcal é:" + basal);
            }

            // Homem e mulher entre 30 e 60
            else if(idade >= 30 && idade <= 60 && (genero == 'M' || genero == 'm')) {

                double basal = 11.6 * pesoo + 879;
                System.out.println("Seu metabolismo basal em Kcal é:" + basal);
            }
            else if(idade >= 30 && idade <= 60 && (genero == 'F' || genero == 'f')) {

                double basal = 8.7 * pesoo + 829;
                System.out.println("Seu metabolismo basal em Kcal é:" + basal);
            }

            // Homem e mulher acima de 60
            else if(idade > 60 && (genero == 'M' || genero == 'm')) {

                double basal = 13.5 * pesoo + 487;
                System.out.println("Seu metabolismo basal em Kcal é:" + basal);
            }
            else if(idade > 60 && (genero == 'F' || genero == 'f')) {

                double basal = 10.5 * pesoo + 596;
                System.out.println("Seu metabolismo basal em Kcal é: " + basal + " Kcal");
            }
            break;

            default:
            System.out.println("Escolha inválida.");
                break;
           
            
                
        }

        
    }
}
