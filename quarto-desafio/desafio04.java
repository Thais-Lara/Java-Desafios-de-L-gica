import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class desafio04 
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        int numLinhas = 0;
        int conta = 1;
        String entrada = new String();
        String decifrada = new String();

        numLinhas = scan.nextInt();
        System.out.println("\n--------DECIFRADAS--------");
        do 
        {
            entrada = scan.nextLine();
            decifrada = decifra(entrada);
            System.out.println(decifrada);
        } while(conta++ != numLinhas); 
    }

    private static String decifra(String cifrada) 
    {
        String metade1 = new String();
        String metade2 = new String();
        String decifrada = new String();
        int meioCifrada = (cifrada.length()/2);

        // Armazena metades
        for(int i = 0; i < meioCifrada; i++)
        {
            metade1 += cifrada.charAt(i);
        }

        for(int j = meioCifrada; j < cifrada.length(); j++)
        {
            metade2 += cifrada.charAt(j);
        }

        for(int i = metade1.length()-1; i >=0; i--)
        {
            decifrada += metade1.charAt(i);
        }
        
        for(int i = metade1.length()-1; i >=0; i--)
        {
            decifrada += metade2.charAt(i);
        }

        return decifrada;
    }
}