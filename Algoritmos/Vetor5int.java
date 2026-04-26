import java.util.Scanner;

public class Vetor5int {
    public static void main(String[] args) {
        System.out.println("---Leitor de vetor 5 números---");

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];//Declarando tamanho e tipo de vetor

        for (int i = 0; i < numeros.length; i++){//for para ler numeros digitados
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("\n números digitados: ");
        for (int i = 0; i < numeros.length; i++) {//for para mostrar valores digitados
            System.out.println(numeros[i]);
        }

        sc.close();

    }
}