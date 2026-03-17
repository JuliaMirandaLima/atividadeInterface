package edu.br.generics;

import edu.br.Cliente;
import edu.br.Produto;

public class Main {
    public static void main(String[] args) {
        // Produto
        DAOList<Produto> produtoDAO = new DAOList<>();
        produtoDAO.inserir(new Produto(1, "Notebook", 3500.00)); ;
        produtoDAO.inserir(new Produto(2, "Mouse", 120.00));

        for (Produto p : produtoDAO.listar()) {
            System.out.println(p);
            
        }
        //cliente
        DAOList<Cliente> clienteDAO = new DAOList<>();
        clienteDAO.inserir(new Cliente(1, "Julia", "julia.miranda.192021@gmail.com")); ;
        clienteDAO.inserir(new Cliente(2, "Emanuella", "zanioloemanuella@gmail.com"));

        for (Cliente c : clienteDAO.listar()) {
            System.out.println(c);
            
        }

    }
}
