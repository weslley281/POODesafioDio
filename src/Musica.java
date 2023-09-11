public class Musica {
    private final String nome;
    private final String artista;

    public Musica(String nome, String artista) {
        if (nome == null || nome.isEmpty() || artista == null || artista.isEmpty()) {
            throw new IllegalArgumentException("Nome e artista não podem ser nulos ou vazios.");
        }
        this.nome = nome;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Música: " + nome + " | Artista: " + artista;
    }
}
