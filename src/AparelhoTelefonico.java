import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AparelhoTelefonico {
    private Integer numero;
    private List<String> caixaCorreioVoz = new ArrayList<>();
    public void ligar(Integer numero){
        this.numero = numero;
        System.out.println("Ligando para o numero: " + numero);
    }

    public void atender(){
        Random random = new Random();
        this.numero = random.nextInt(999999999);
        System.out.println("O numero " + this.numero + " está te ligando");
    }

    public void gravarMensagem(String mensagem) {
        caixaCorreioVoz.add(mensagem);
        System.out.println("Mensagem gravada com sucesso!");
    }

    public void iniciarCorrerioVoz(){
        if (caixaCorreioVoz.isEmpty()) {
            System.out.println("Caixa de correio de voz vazia.");
        } else {
            System.out.println("Mensagens na caixa de correio de voz:");
            for (int i = 0; i < caixaCorreioVoz.size(); i++) {
                System.out.println("Mensagem " + (i + 1) + ": " + caixaCorreioVoz.get(i));
            }
        }
    }
}
