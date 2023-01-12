package br.com.ada;

public class Zap implements MeioEnvio {
    @Override
    public void enviarAnexo(String anexo) {
        System.out.println("Via Zap");
    }
}
