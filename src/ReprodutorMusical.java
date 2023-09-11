public class ReprodutorMusical {
    private boolean tocando = false;
    private String musicaSelecionada = "Nenhuma";

    public ReprodutorMusical() {
        // Construtor vazio por enquanto, mas pode ser expandido conforme necessário
    }

    public void tocar() {
        if (musicaSelecionada.equalsIgnoreCase("Nenhuma")) {
            System.out.println("Por favor, selecione uma música para tocar.");
        } else if (tocando) {
            System.out.println("A música já está tocando.");
        } else {
            tocando = true;
            System.out.println("Tocando: " + musicaSelecionada);
        }
    }

    public void pausar() {
        if (!tocando) {
            System.out.println("Não há música tocando para pausar.");
        } else {
            tocando = false;
            System.out.println("Pausado");
        }
    }

    public void selecionarMusica(String musica) {
        if (musica != null && !musica.isEmpty()) {
            musicaSelecionada = musica;
            System.out.println("Música selecionada: " + musicaSelecionada);
        } else {
            System.out.println("Nome de música inválido");
        }
    }

    public boolean estaTocando() {
        return tocando;
    }

    public String getMusicaTocando() {
        return musicaSelecionada;
    }
}
