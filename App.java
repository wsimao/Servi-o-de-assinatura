import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    DecimalFormat df = new DecimalFormat();
    df.applyPattern("R$#,##0.00");
    Scanner scanner = new Scanner(System.in);

    iPacotes pacote = new PacoteBase();
    iPacotes pacote1 = new Pacote1();
    iPacotes pacote2 = new Pacote2();
    iPacotes pacote3 = new Pacote3();
    iPacotes pacote4 = new Pacote4();
    iPacotes pacote5 = new Pacote5();



    boolean executando = true;
    while(executando) {
    System.out.println("*[1] Realizar assinatura*");
    System.out.println("*[2] Sair*");
    System.out.println("Digite uma opção: ");
    String opcao = scanner.nextLine();


    switch (opcao){
        case "1": {
            System.out.print("===================================PACOTES DISPONÍVEIS===================================");
            System.out.println("");
            System.out.println("Qual pacote você deseja assinar para complementar a sua assinatura?");
            System.out.println("Por padrão você já está aderindo o Plano Básico - Assistir vídeos num único dispositivo (R$9,99)");
            System.out.println("");
            System.out.println("");
            System.out.println("*[5] Pacote 1: Assistir vídeos em vários dispositivo* (R$19,99)");
            System.out.println("*[6] Pacote 2: Frete Grátis em produtos* (R$9,99)");
            System.out.println("*[7] Pacote 3: Caixa surpresa com produtos relacionados a filmes e séries* (R$29,99)");
            System.out.println("*[8] Pacote 4: Cartão de crédito Platinum* (R$49,99)");
            System.out.println("*[9] Pacote 5: Compra com Cash Back (R$19,99)*");
            System.out.println("*[10] Não desejo adicionar pacotes extras.*");
            
            String opcoesAssinaturas = scanner.nextLine();

            switch (opcoesAssinaturas){
                case "4": {
                    pacote.getName();
                    pacote.getPrice();
                    System.out.println("");
                    System.out.println("Você escolheu " +pacote.getName());
                    System.out.println("Valor " +df.format(pacote.getPrice()));
                    System.out.println("");
                    break;
                }
                case "5": {
                    pacote1.getName();
                    pacote1.getPrice();
                    System.out.println("");
                    System.out.println("Você escolheu " +pacote1.getName());
                    System.out.println("Valor " +df.format(pacote1.getPrice()));
                    System.out.println("");
                    break;
                }
                case "6":{
                    pacote2.getName();
                    pacote2.getPrice();
                    System.out.println("");
                    System.out.println("Você escolheu " +pacote2.getName());
                    System.out.println("Valor " +df.format(pacote2.getPrice()));
                    System.out.println("");
                    break;
                }
                case "7":{
                    pacote3.getName();
                    pacote3.getPrice();
                    System.out.println("");
                    System.out.println("Você escolheu " +pacote3.getName());
                    System.out.println("Valor " +df.format(pacote3.getPrice()));
                    System.out.println("");
                    break;
                }
                case "8":{
                    pacote4.getName();
                    pacote4.getPrice();
                    System.out.println("");
                    System.out.println("Você escolheu " +pacote4.getName());
                    System.out.println("Valor " +df.format(pacote4.getPrice()));
                    System.out.println("");
                    break;
                }
                case "9":{
                    pacote5.getName();
                    pacote5.getPrice();
                    System.out.println("");
                    System.out.println("Você escolheu " +pacote5.getName());
                    System.out.println("Valor " +df.format(pacote5.getPrice()));
                    System.out.println("");
                    break;
                }
                case "10":{
                    pacote.getName();
                    pacote.getPrice();
                    System.out.println("");
                    System.out.println("Você escolheu " +pacote.getName());
                    System.out.println("Valor " +df.format(pacote.getPrice()));
                    System.out.println("");
                    executando = false;
                    System.out.println("");
                    break;
                }
            }
            executando = false;
            System.out.println("=============================================================");
            System.out.println("PARABÉNS PELA ADESÃO NA ASSINATURA, SEJA MUITO BEM VINDO :D");
            System.out.println("=============================================================");
            break;
        }
        case "2": {
            executando = false;
            System.out.println("=====(VOCÊ ESCOLHEU SAIR. SISTEMA ENCERRADO)=====");
            break;
        }
    }
}
}
}
