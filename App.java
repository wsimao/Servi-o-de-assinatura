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
    System.out.println("*[2] Gerenciar assinatura*");
    System.out.println("*[3] Sair*");
    System.out.println("Digite uma opção: ");
    String opcao = scanner.nextLine();


    switch (opcao){
        case "1": {
            System.out.print("=====PACOTES DISPONÍVEIS=====");
            System.out.println("");
            System.out.println("Qual pacote você deseja assinar: (Múltipla escolha)");
            System.out.println("*[4] Plano Básico: Assistir vídeos num único dispositivo* (R$9.99)");
            System.out.println("*[5] Pacote 1: Plano Básico + Assistir vídeos num único dispositivo* (R$29,98)");
            System.out.println("*[6] Pacote 2: Plano Básico + Frete Grátis em produtos* (R$19.98)");
            System.out.println("*[7] Pacote 3: Plano Básico + Caixa surpresa com produtos relacionados a filmes e séries* (R$39.98)");
            System.out.println("*[8] Pacote 4: Plano Básico + Cartão de crédito Platinum* (R$59.98)");
            System.out.println("*[9] Pacote 5: Plano Básico + Compra com Cash Back (R$29.98)*");
            System.out.println("*[10] Sair*");
            
            String opcoesAssinaturas = scanner.nextLine();

            switch (opcoesAssinaturas){
                case "4": {
                    pacote.getName();
                    pacote.getPrice();
                    System.out.println("Você escolheu " +pacote.getName());
                    System.out.println("Valor " +df.format(pacote.getPrice()));
                    break;
                }
                case "5": {
                    pacote1.getName();
                    pacote1.getPrice();
                    System.out.println("Você escolheu " +pacote1.getName());
                    System.out.println("Valor " +df.format(pacote1.getPrice()));
                    break;
                }
                case "6":{
                    pacote2.getName();
                    pacote2.getPrice();
                    System.out.println("Você escolheu " +pacote2.getName());
                    System.out.println("Valor " +df.format(pacote2.getPrice()));
                    break;
                }
                case "7":{
                    pacote3.getName();
                    pacote3.getPrice();
                    System.out.println("Você escolheu " +pacote3.getName());
                    System.out.println("Valor " +df.format(pacote3.getPrice()));
                    break;
                }
                case "8":{
                    pacote4.getName();
                    pacote4.getPrice();
                    System.out.println("Você escolheu " +pacote4.getName());
                    System.out.println("Valor " +df.format(pacote4.getPrice()));
                    break;
                }
                case "9":{
                    pacote5.getName();
                    pacote5.getPrice();
                    System.out.println("Você escolheu " +pacote5.getName());
                    System.out.println("Valor " +df.format(pacote5.getPrice()));
                    break;
                }
                case "10":{
                    executando = false;
                    System.out.println("=====(VOCÊ ESCOLHEU SAIR. ADESÃO DE ASSINATURA NÃO REALIZADA)=====");
                    break;
                }
                
            }
            //PacoteBase pacotes1 = new PacoteBase(pacotes1.getName());
            //discentes.add(alunos);
            break;
        }
        case "3": {
            executando = false;
            System.out.println("=====(VOCÊ ESCOLHEU SAIR. SISTEMA ENCERRADO)=====");
            break;
        }
    }
}
}


}
