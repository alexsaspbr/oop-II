package br.com.ada;

public class Email  implements MeioEnvio{
    @Override
    public void enviarAnexo(String anexo) {
        System.out.println("Via e-mail");
    }
}
