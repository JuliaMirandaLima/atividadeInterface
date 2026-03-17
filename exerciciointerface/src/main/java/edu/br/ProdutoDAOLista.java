package edu.br;

import java.util.ArrayList;
import java.util.List;

import edu.br.object.Object;
import edu.br.object.ObjectDAO;

public class ProdutoDAOLista implements ObjectDAO{
@Override
    public void inserir(Object object) {
        System.out.println("Simulando: Produto salvo no BANCO DE DADOS MySQL!");
    }

    @Override
    public List<Object> listar() {
        System.out.println("Simulando: Buscando todos do BANCO DE DADOS...");
        return new ArrayList<>();
    }

    @Override
    public Object buscarPorId(int id) {
        System.out.println("Simulando: Buscando ID " + id + " no BANCO DE DADOS...");
        return null; 
    }

    @Override
    public void remover(int id) {
        System.out.println("Simulando: Produto removido do BANCO DE DADOS!");
    }
    
}
