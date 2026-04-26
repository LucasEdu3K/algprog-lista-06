import java.util.Scanner;

public class LeitorConsoante {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("---Leitor de Consoantes---");

         char[] consoantes = new char[10];
         int contador = 0;
    
         for (int i = 0; i < consoantes.length; i++) {//for para ler caracteres digitados
            System.out.println("Digite uma letra: ");
            consoantes[i] = sc.next().charAt(0);
          
          }

          System.out.println("\n Consoantes: ");
          for (int i = 0; i < consoantes.length; i++) {
            char letra = Character.toLowerCase(consoantes[i]);//char seguido de if para verificar se é consoante
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u'){
                contador++;
                System.out.println(letra);
            }
            
        } 
        System.out.println("Total de consoantes: " + contador);
        
    

          
        sc.close();
    }
    
   
    
}
