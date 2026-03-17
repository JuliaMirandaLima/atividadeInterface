package edu.br.generics;

import java.util.ArrayList;
import java.util.List;

public class DAOList<T> implements GenericsDAO<T> {
    private List<T> lista;
        public DAOList() {
            this.lista = new ArrayList<>();

    }

    @Override
    public void inserir(T object) {
        lista.add(object);
    }

    @Override
    public List<T> listar() {
        return lista;
    }

    @Override
    public T buscarPorId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public void remover(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

}
