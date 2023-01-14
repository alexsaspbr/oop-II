package br.com.ada.meiosenvio;

import br.com.ada.meiosenvio.MeioEnvio;
import br.com.ada.impressora.Impressora;

public class EnvioDocumento {

    private Impressora impressora;

    private MeioEnvio meioEnvio;

    public EnvioDocumento(MeioEnvio meioEnvio) {
        this.impressora = new Impressora(null);
        this.meioEnvio = meioEnvio;
    }

    public void enviarDocumento() {
        String anexo = this.impressora.imprimirPDF();
        this.meioEnvio.enviarAnexo(anexo);
    }


}
