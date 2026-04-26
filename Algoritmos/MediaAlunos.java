import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("---Media Alunos---");

        double[] medias = new double[10];//vetor para armazenar todas as medias do 4 alunos
        int contadorAprovados = 0;

        for (int i = 0; i < 10; i++){//loop dentro do outro para verificar as notas e as medias
            double soma = 0;
            for (int j = 0; j < 4; j++){
                System.out.println("Digite o valor da nota: ");
                double nota = sc.nextDouble();
                soma += nota;
            }
            medias[i] = soma / 4;
        }

        for (int i = 0; i < medias.length; i++){
            System.out.println("Aluno " + (i+1) + ": " + medias[i]);
        }

        for (int i = 0; i < medias.length; i++){
            if (medias[i] >= 7.0) {
                contadorAprovados++;
            }
        }
        System.out.println("Alunos com média >= 7:  " + contadorAprovados);

     sc.close();
    }
}
