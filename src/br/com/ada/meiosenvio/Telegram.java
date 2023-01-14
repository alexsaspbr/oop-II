package br.com.ada.meiosenvio;

public class Telegram implements MeioEnvio {
    @Override
    public void enviarAnexo(String anexo) {
        System.out.println("Via Telegram");
    }
}
