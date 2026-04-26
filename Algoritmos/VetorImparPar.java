import java.util.Scanner;
public class VetorImparPar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---Par ou Impar---");

        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int contadorpar = 0;
        int contadorimpar = 0;

        for (int i = 0; i < numeros.length; i++){//for para ler numeros digitados
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par[contadorpar] = numeros[i];
                contadorpar++;

            } else {
                impar[contadorimpar] = numeros[i];
                contadorimpar++;
            }
          
        }

           System.out.println("\n números digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\n números pares: ");
        for (int i = 0; i < contadorpar; i++) {
            System.out.println(par[i]);
        }

        System.out.println("\n números impares: ");
        for (int i = 0; i < contadorimpar; i++) {
            System.out.println(impar[i]);
        }





        
    }
}
