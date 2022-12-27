import java.util.Random;
import java.util.Scanner;

class desafio03
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int entradas; 
        int[] numeros = {1,5,3,4,2};      

        System.out.println("Entre com a quantidade de números:");

        entradas = scan.nextInt();

        if(entradas >= 5)
        {
            for (int i=0; i<numeros.length; i++) {
                numeros[i] = random.nextInt(entradas);
                System.out.println(numeros[i]); 
           }
        }
        
        System.out.println("Insira o valor alvo:");

        
        
    }
}