import br.com.ada.Email;
import br.com.ada.Zap;
import br.com.ada.impressora.Impressora;
import br.com.ada.veiculo.Carro;
import br.com.ada.veiculo.Locadora;
import br.com.ada.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EnvioDocumento envioDocumento = new EnvioDocumento(new Zap());
        envioDocumento.enviarDocumento();

    }


}