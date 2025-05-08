import java.util.Scanner;

public class CalculadoraJuros {
    public static void main(String[] args) {
        // Declaração de variáveis
        double c, i, t, j;
        int op;

        // Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        // Loop principal
        while (true) {
            // Apresentação
            System.out.println("\n\t\t\t -- Calculadora de Juros --\n");

            // Menu
            System.out.println("1. Descobrir juros");
            System.out.println("2. Descobrir capital");
            System.out.println("3. Descobrir a taxa");
            System.out.println("4. Descobrir o tempo");
            System.out.println("0. Sair");

            // Opção do usuário
            System.out.print("Opção: ");
            op = entrada.nextInt();

            if (op == 0) {
                System.out.println("Encerrando o programa. Até mais!");
                
            }

                //Entrada
            if (op == 1) {
                System.out.print("Informe o capital: ");
                c = entrada.nextDouble();
                System.out.print("Informe a taxa (%): ");
                i = entrada.nextDouble();
                System.out.print("Informe o tempo: ");
                t = entrada.nextDouble();

                //Processamento
                j = (c * i * t) / 100;

                //Saída
                System.out.println("Juros calculados: " + j);

                //Entrada
            } else if (op == 2) {
                System.out.print("Informe o juros: ");
                j = entrada.nextDouble();
                System.out.print("Informe a taxa (%): ");
                i = entrada.nextDouble();
                System.out.print("Informe o tempo: ");
                t = entrada.nextDouble();

                    //Processamento
                c = (j * 100) / (i * t);

                    //Saída
                System.out.println("Capital calculado: " + c);

                //Entrada
            } else if (op == 3) {
                System.out.print("Informe o juros: ");
                j = entrada.nextDouble();
                System.out.print("Informe o capital: ");
                c = entrada.nextDouble();
                System.out.print("Informe o tempo: ");
                t = entrada.nextDouble();

                //Processamento
                i = j / (c * t) * 100;

                //Saída
                System.out.println("Taxa calculada: " + i);

                //Entrada
            } else if (op == 4) {
                System.out.print("Informe o juros: ");
                j = entrada.nextDouble();
                System.out.print("Informe o capital: ");
                c = entrada.nextDouble();
                System.out.print("Informe a taxa (%): ");
                i = entrada.nextDouble();

                //Processamento
                t = j / (c * i / 100);
                
                //Saída
                System.out.println("Tempo calculado: " + t);


            } else {
                System.out.println("Opção incorreta. Por favor, escolha uma opção de 0 a 4.");
            }
        }

       
}}