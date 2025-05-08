import java.util.Scanner;

public class juros {

    public static void main(String[] args) {
        //Declaração de variáveis 
        double Juros, Capital, Taxa, Montante; 
        int Prazo; 
    
    
        //Criação e instância do objeto de entrada 
        Scanner entrada = new Scanner(System.in);

        //Apresentação 
        System.out.println("\n\t\t\t -- Calculadora Juros --\n");

        //Entrada
        System.out.print("Digite o Capital: ");
        Capital = entrada.nextDouble();
        System.out.print("Digite a Taxa: ");
        Taxa = entrada.nextDouble();
        System.out.print("Digite o Prazo: ");
        Prazo = entrada.nextInt();


        //Cálculo do montante
        Montante = Capital * Math.pow((1 + (Taxa / 100)), Prazo);

        //Cálculo dos juros
        Juros = Montante - Capital;

       
        


    }
}