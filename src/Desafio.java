import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)

        Cofre cofreFisico = new CofreFisico();
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);
            cofreDigital.imprimirInformacoes();

            int senha2 = scanner.nextInt();
            if (cofreDigital.validarSenha(senha2)){
                System.out.println("Cofre aberto!");
            }else {
                System.out.println("Senha incorreta!");
            }
            return;
        }
        cofreFisico.imprimirInformacoes();
    }
}