package farmacia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cliente {
    ArrayList<String> listaCpfCliente = new ArrayList<String>();
    ArrayList<String> listaEmailCliente = new ArrayList<String>();
    List<String> listaNomeCliente = Arrays.asList("Stefani", "Amor", "Linda", "Cheirosa");

    public cliente() {
    }

    public boolean buscarNome(String nome) {
        return nome.equals(listaNomeCliente.get(0));
    }

    public boolean buscarCpf(String cpf) {
        return cpf.equals(listaCpfCliente.get(0));
    }

    public boolean buscarEmail(String email) {
        return email.equals(listaEmailCliente.get(0));
    }

}
