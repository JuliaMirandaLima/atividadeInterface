package edu.br.generics;

import edu.br.Cliente;

public class ClienteDAO extends DAOList<Cliente> {

    @Override
    public Cliente buscarPorId(int id) {
        for (Cliente cliente : lista) {
            //pega do cliente
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null; 
    }
}