import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NavegadorInternet {
    private List<String> abas = new ArrayList<>();
    private Random random = new Random();

    private String telaNavegador1 = "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos.\nO Lorem Ipsum tem vindo a ser o texto padrão usado por estas indústrias desde o ano de 1500, quando uma misturada do tipo de letra tomou a decisão de misturar.";
    private String telaNavegador2 = "É um facto estabelecido de que um leitor é distraído pelo conteúdo legível de uma página quando analisa a sua mancha gráfica.\nLogo, o uso de Lorem Ipsum leva a uma distribuição mais ou menos normal de letras, ao contrário do uso de 'Conteúdo aqui, conteúdo aqui', tornando-o texto legível.";
    private String telaNavegador3 = "Existem muitas variações das passagens de Lorem Ipsum disponíveis, mas a maior parte sofreu alterações de alguma forma,\n seja por inserção de passagens com humor, ou palavras aleatórias que não parecem nem um pouco credíveis.";

    public NavegadorInternet() {
        // Inicialize com uma aba padrão
        abas.add(telaNavegador1);
    }

    public void exibirPagina() {
        // Mostre a aba atual (última na lista de abas)
        String abaAtual = abas.get(abas.size() - 1);
        System.out.println(abaAtual);
    }

    public void adicionarNovaAba() {
        // Adicione uma nova aba com conteúdo aleatório
        int numeroAleatorio = random.nextInt(3) + 1;
        switch (numeroAleatorio) {
            case 1:
                abas.add(telaNavegador1);
                break;
            case 2:
                abas.add(telaNavegador2);
                break;
            case 3:
                abas.add(telaNavegador3);
                break;
            default:
                abas.add("Tela padrão de erro");
                break;
        }
    }

    public void atualizarPagina() {
        // Atualize a página atual (a última na lista de abas) com conteúdo aleatório
        int numeroAleatorio = random.nextInt(3) + 1;
        switch (numeroAleatorio) {
            case 1:
                abas.set(abas.size() - 1, telaNavegador1);
                break;
            case 2:
                abas.set(abas.size() - 1, telaNavegador2);
                break;
            case 3:
                abas.set(abas.size() - 1, telaNavegador3);
                break;
            default:
                abas.set(abas.size() - 1, "Tela padrão de erro");
                break;
        }
    }
}
