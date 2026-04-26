import java.util.Scanner;

public class Vetor10inverso {
     public static void main(String[] args) {
        System.out.println("---Leitor de vetor 10 números---");

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];//Declarando tamanho e tipo de vetor

        for (int i = 0; i < numeros.length; i++){//for para ler numeros digitados
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }
        System.out.println("\n números digitados: ");
        for (int i = 9; i >= 0; i--) {//for para mostrar valores digitados inverso
            System.out.println(numeros[i]);
        }

        sc.close();

    }
}
