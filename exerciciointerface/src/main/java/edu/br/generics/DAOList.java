package edu.br.generics;

import java.util.ArrayList;
import java.util.List;

public abstract class DAOList<T> implements GenericsDAO<T> {
    protected List<T> lista;

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
    public void remover(int id) {
        T objeto = buscarPorId(id);
        if (objeto != null) {
            lista.remove(objeto);
        }
    }

    @Override
    public abstract T buscarPorId(int id);
     
}