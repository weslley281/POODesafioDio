import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Musica> musicas = new ArrayList<>();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        Map<String, String > opcoes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos adicionar ao menos 3 músicas ao catálogo");

        for (Integer i = 1; i <= 3; i++){
            System.out.printf("Digite o nome da %dª música: ", i);
            String nome = scanner.next();
            System.out.printf("Digite o artista da %dª música: ", i);
            String artista = scanner.next();

            musicas.add(new Musica(nome, artista));
        }

        String seletor = "s";
        opcoes.put("tocar", "Dá play na música");
        opcoes.put("pausar", "Dá pause na música");
        opcoes.put("selecionar", "Seleciona a música");
        opcoes.put("navegar:exibir", "Exibe a página no navegador");
        opcoes.put("navegar:atualizar", "Atualiza a página no navegador");
        opcoes.put("navegar:adicionar", "Adiciona uma nova aba no navegador");
        opcoes.put("telefonar:ligar", "Faz uma ligação");
        opcoes.put("telefonar:atender", "Atende uma ligação");
        opcoes.put("telefonar:correio", "Inicia o correio de voz");

        do {
            System.out.print("O que você quer fazer?");

            System.out.println("{");
            opcoes.forEach((chave, valor) -> System.out.println(chave + ": " + valor));
            System.out.println("}");

            System.out.print("Escreva: ");

            seletor = scanner.next();

            switch (seletor){
                case "tocar":
                    reprodutorMusical.tocar();
                    break;
                case "pausar":
                    reprodutorMusical.pausar();
                    break;
                case "selecionar":
                    System.out.println("Digite o nome de uma das músicas: \n" + musicas);
                    String musica = scanner.next();
                    reprodutorMusical.selecionarMusica(musica);
                    break;
                case "navegar:exibir":
                    navegadorInternet.exibirPagina();
                    break;
                case "navegar:atualizar":
                    navegadorInternet.atualizarPagina();
                    break;
                case "navegar:adicionar":
                    navegadorInternet.adicionarNovaAba();
                    break;
                case "telefonar:ligar":
                    System.out.print("Digite o número para ligar: ");
                    Integer numero = scanner.nextInt();
                    aparelhoTelefonico.ligar(numero);
                    break;
                case "telefonar:atender":
                    aparelhoTelefonico.atender();
                    break;
                case "telefonar:correio":
                    System.out.print("Digite a mensagem: ");
                    String mensagem = scanner.next();
                    aparelhoTelefonico.gravarMensagem(mensagem);
                    break;
                default:
                    seletor = "s";
                    System.out.println("Opção inválida");
                    break;
            }
        } while (!seletor.equalsIgnoreCase("n"));
    }
}
