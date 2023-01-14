import br.com.ada.meiosenvio.EnvioDocumento;
import br.com.ada.meiosenvio.Zap;

public class Main {
    public static void main(String[] args) {

        EnvioDocumento envioDocumento = new EnvioDocumento(new Zap());
        envioDocumento.enviarDocumento();

    }


}