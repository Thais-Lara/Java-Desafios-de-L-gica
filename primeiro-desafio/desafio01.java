import java.util.Scanner;

class desafio01
{
    private static Scanner entrada = new Scanner(System.in);
    
    public static int[] ordenaDecrescente(int[] vetor, int tamanho)
    {
        int i, j, maior, x;

        for (i=0; i<tamanho; i++)
        {
            maior = i;
            for (j=i+1; j<tamanho; j++)
            {
                if (vetor[j] > vetor[maior])
                maior = j;
            }
            x = vetor[maior];
            vetor[maior] = vetor[i];
            vetor[i] = x;
        }    
        return vetor;
    }

    public static int[] ordenaCrescente(int[] vetor, int tamanho)
    {        
        int i, j, menor, x;

        for (i=0; i<tamanho; i++)
        {
            menor = i;
            for (j=i+1; j<tamanho; j++)
            {
                if (vetor[j] < vetor[menor])
                menor = j;

                x = vetor[menor];
                vetor[menor] = vetor[i];
                vetor[i] = x;
            }         
        }
        return vetor;
    }

    public static void main(String[] args) 
    {      
        int contadorPar = 0;
        int contadorImpar = 0;
        int contador = 1;
        int numero;

        int tamanho = entrada.nextInt();
        int[] vetorPar = new int[tamanho];
        int[] vetorImpar = new int[tamanho];
        int[] vetorFinal = new int[tamanho];
        
        do
        {
            numero = entrada.nextInt(); 
            if(numero % 2 == 0) // par
            {
                vetorPar[contadorPar] = numero; 
                contadorPar++;
            } 
            else if(numero % 2 == 1)
            {
                vetorImpar[contadorImpar] = numero; 
                contadorImpar++;
            }
        } while(contador++ < tamanho);

        vetorPar = ordenaCrescente(vetorPar, contadorPar);
        vetorImpar = ordenaDecrescente(vetorImpar, contadorImpar);

        for(int i = 0; i < contadorPar; i++)
        {

            vetorFinal[i] = vetorPar[i];
        }

        int j = 0;
        for(int i = contadorPar; i < tamanho; i++)
        {   
            vetorFinal[i] = vetorImpar[j++];
        }

        System.out.println("-------------");
        System.out.println("Ordenado:");
        for(int i = 0; i < tamanho; i++)
        {      
            System.out.println(vetorFinal[i]);
        }       
    }
}