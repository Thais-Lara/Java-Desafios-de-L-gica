import java.text.DecimalFormat;
import java.util.Scanner;

class NotasMoedas
{

    public static void contagemNotasMoedas(float valor)
    {
        int notasCem = 0;
        int notasCinquenta = 0;
        int notasVinte = 0;
        int notasDez = 0;
        int notasCinco = 0;
        int notasDois = 0;
        int moedaUm = 0;
        int moedaCinquenta = 0;
        int moedaVinteCinco = 0;
        int moedaDez = 0;
        int moedaCinco = 0;
        int moedaZeroUm = 0;

        if(valor < 0)
        {
            System.out.println("Valor inválido.");
        } 
        else
        {   

            while((100000 >= valor && valor >= 100)){

                valor = valor - 100;
                notasCem++;
            }
            
            while(100 >= valor && valor >= 2)
            {
                while(valor >= 50){
                    valor = valor - 50;
                    notasCinquenta++;
                } 
                while(valor >= 20){
                    valor = valor - 20;
                    notasVinte++;
                } 
                while(valor >= 10){
                    valor = valor - 10;
                    notasDez++;
                }
                while(valor >= 5){
                    valor = valor - 5;
                    notasCinco++;
                }
                while(valor >= 2){
                    valor = valor - 2;
                    notasDois++;
                }
            } 
            while(2 > valor && valor >= 0.05)
            {
                while(valor >= 1)
                {
                    valor = valor - 1;
                    moedaUm++;
                } 
                while(1 > valor && valor >= 0.50)
                {
                    valor = (float) (valor - 0.50);
                    moedaCinquenta++;
                } 
                while(0.50 > valor && valor >= 0.25)
                {
                    valor = (float) (valor - 0.25);
                    moedaVinteCinco++;
                }
                while(0.25 > valor && valor >= 0.10)
                {
                    valor = (float) (valor - 0.10);
                    moedaDez++;
                }
                while(0.10 > valor && valor >= 0.05)
                {
                    valor = (float) (valor - 0.05);
                    moedaCinco++;
                }
                while(0.5 > valor && valor >= 0.01)
                {
                    valor = (float) (valor - 0.01);
                    moedaZeroUm++;
                }
            }
        }

        System.out.println("NOTAS:");
        System.out.println(notasCem + " nota(s) de R$ 100.00");
        System.out.println(notasCinquenta + " nota(s) de R$ 50.00");
        System.out.println(notasVinte + " nota(s) de R$ 20.00");
        System.out.println(notasDez + " nota(s) de R$ 10.00");
        System.out.println(notasCinco + " nota(s) de R$ 5.00");
        System.out.println(notasDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedaUm + " nota(s) de R$ 1.00");
        System.out.println(moedaCinquenta + " nota(s) de R$ 0.50");
        System.out.println(moedaVinteCinco + " nota(s) de R$ 0.25");
        System.out.println(moedaDez + " nota(s) de R$ 0.10");
        System.out.println(moedaCinco + " nota(s) de R$ 0.05");
        System.out.println(moedaZeroUm + " nota(s) de R$ 0.01");
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        float valor = 0;
        boolean erro = false;

        try 
        {
            valor = scan.nextFloat();
            
        } catch (Exception InputMismatchException) 
        {
            erro = true;
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Erro:");
            System.out.println("O formato digitado não é válido. Tente usar vírgula ao invés de ponto, ou o inverso.");
            System.out.println("--------------------------------------------------------------------------");
        }
        
        if(erro == false)
        {
            contagemNotasMoedas(valor);
        }
    }
}