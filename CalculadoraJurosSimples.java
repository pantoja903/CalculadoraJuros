import java.util.Scanner;

public class CalculadoraJurosSimples {

    public static void main(String[] args) {
        
        // Declaração de variáveis
        double capital, taxa, tempo, juros;
        int escolha;

         //Criação e instância do objeto de entrada
        Scanner scanner = new Scanner(System.in);

        //Apresentação
          System.out.println("\n=== Calculadora de Juros Simples ===");
        
        //Entradas
        while(true) {
            
            System.out.println("1. Calcular Juros");
            System.out.println("2. Calcular Capital Inicial");
            System.out.println("3. Calcular Taxa de Juros");
            System.out.println("4. Calcular Tempo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            escolha = scanner.nextInt();
            
            if(escolha == 0) {
                System.out.println("Até logo!");
                break; // Sai do loop
            }
            
            if(escolha == 1) {
                
                // Calcula os juros
                System.out.print("Digite o capital inicial: ");
                capital = scanner.nextDouble();
                
                System.out.print("Digite a taxa de juros (%): ");
                taxa = scanner.nextDouble();
                
                System.out.print("Digite o tempo (em meses): ");
                tempo = scanner.nextDouble();
                
                juros = (capital * taxa * tempo) / 100;
                System.out.println("Os juros são: " + juros);
            }
            else if(escolha == 2) {

                // Calcula o capital inicial
                System.out.print("Digite os juros: ");
                juros = scanner.nextDouble();
                
                System.out.print("Digite a taxa de juros (%): ");
                taxa = scanner.nextDouble();
                
                System.out.print("Digite o tempo: ");
                tempo = scanner.nextDouble();
                
                capital = (juros * 100) / (taxa * tempo);
                System.out.println("O capital inicial é: " + capital);
            }
            else if(escolha == 3) {

                // Calcula a taxa de juros
                System.out.print("Digite os juros: ");
                juros = scanner.nextDouble();
                
                System.out.print("Digite o capital inicial: ");
                capital = scanner.nextDouble();
                
                System.out.print("Digite o tempo: ");
                tempo = scanner.nextDouble();
                
                taxa = (juros * 100) / (capital * tempo);
                System.out.println("A taxa de juros é: " + taxa + "%");
            }
            else if(escolha == 4) {

                // Calcula o tempo
                System.out.print("Digite os juros: ");
                juros = scanner.nextDouble();
                
                System.out.print("Digite o capital inicial: ");
                capital = scanner.nextDouble();
                
                System.out.print("Digite a taxa de juros (%): ");
                taxa = scanner.nextDouble();
                
                tempo = juros / (capital * taxa / 100);
                System.out.println("O tempo necessário é: " + tempo);
            }
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        
        }

        //Saída 
        System.out.println("\n\t\t\t === Tenha um ótimo dia ===\n");
        
        scanner.close();
    }
}