import java.util.Scanner;

public class MediaNotas {
       public static void main(String[] args) {
        System.out.println("---Media notas---");

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];//Declarando tamanho e tipo de vetor
        double soma = 0;

        for (int i = 0; i < notas.length; i++){//for para ler notas digitadas
            System.out.println("Digite a nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / 4;

        System.out.println("\n Notas digitadas: ");
        for (int i = 0; i < notas.length; i++) {//for para notas digitadas
            System.out.println(notas[i]);
        }
        System.out.printf("Media = %.2f\n", media); 

        sc.close();

    }
}

