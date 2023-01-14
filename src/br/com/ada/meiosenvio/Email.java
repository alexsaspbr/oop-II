package br.com.ada.meiosenvio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Email implements MeioEnvio {

    private ClienteDAO clienteDAO;

    public Email(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public void enviarAnexo(String anexo) {
        System.out.println("Via e-mail");
    }

    public static void enviarEmail(Cliente cliente){
        System.out.printf("Enviando e-mail para cliente %s", cliente.getNome());
    }

    public void enviarEmailLote(List<Cliente> clientes){
        List<Cliente> clientesAtivos = clientesAtivos(clientes);
        clientesAtivos.forEach(Email::enviarEmail);
    }

    private List<Cliente> clientesAtivos(List<Cliente> clientes) {
        //sem stream
/*        List<Cliente> clientesAtivos = new ArrayList<>();
        clientes.forEach(cliente -> {
            Cliente clienteBancoDados = this.clienteDAO.buscarCliente(cliente);
            if(isClienteAtivo(clienteBancoDados)){
                clientesAtivos.add(clienteBancoDados);
            };
        });
        return clientesAtivos;*/


        //com stream
        return clientes.stream()
                .map(cliente -> this.clienteDAO.buscarCliente(cliente))
                .filter(Email::isClienteAtivo)
                .collect(Collectors.toList());
    }

    private static Boolean isClienteAtivo(Cliente clienteBancoDados) {
        return clienteBancoDados.isAtivo();
    }

    class Cliente {
        private Boolean ativo;
        private String nome;

        public Boolean isAtivo() {
            return ativo;
        }

        public String getNome() {
            return nome;
        }
    }

    class ClienteDAO {
        public Cliente buscarCliente(Cliente cliente){
            return cliente;
        }
    }

}
