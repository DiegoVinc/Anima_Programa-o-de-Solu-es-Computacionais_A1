import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite Seu nome: ");
         String nome = input.next();
        System.out.print("Digite seu peso atual: ");
         double peso = input.nextDouble();
        System.out.print("Digite a quantidade de água já ingerida em L: ");
         double aguaIngerida = input.nextDouble();
         input.close();
         double valorMlPorKg = 0.035;
         double quantidadeIdeal = (valorMlPorKg * peso);
         double quantidadeAIngerir = (quantidadeIdeal - aguaIngerida);
         


         System.out.println("Nome: " + nome);
         System.out.println("Seu peso Atual é: " + peso);
         System.out.printf("Você já ingeriu %fL de água hoje.", aguaIngerida);
         System.out.printf("\nA quantidade ideal de água a ingerir é: %fL", quantidadeIdeal);
         if (quantidadeAIngerir < 0) {
            System.out.println("\nParabéns, você atingiu a meta de hidratação diária");
         }
         else {
            System.out.printf("\nContinue focado em se hidratar por hoje, ainda faltam [%f] litros! Você consegue!", quantidadeAIngerir);
         }
         
         
    }
}
