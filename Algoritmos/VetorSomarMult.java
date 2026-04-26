import java.util.Scanner;
public class VetorSomarMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Vetor Soma e multiplicação de 5 números---");

        int[] numeros = new int[5];

        int soma = 0;
        int mult = 1;

        for (int i = 0; i < numeros.length; i++){//for para ler numeros digitados
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i]; 
            mult *= numeros[i];
        }

        System.out.println("\n Numeros digitados: ");
        for (int i = 0; i < numeros.length; i++) {//for para notas digitadas
            System.out.println(numeros[i]);
        }

        System.out.println("A soma dos números = " + soma);
        System.out.println("A multiplicação do números = " + mult);

    }
    
}
