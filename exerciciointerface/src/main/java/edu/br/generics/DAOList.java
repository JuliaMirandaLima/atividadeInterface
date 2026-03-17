package edu.br.generics;

import java.util.ArrayList;
import java.util.List;

import edu.br.Produto;

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
       for (T o : lista) {
            if (o instanceof Produto) {
                Produto p = (Produto) o;
                if (p.getId() == id) {
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public void remover(int id) {
        T objeto = buscarPorId(id);
        if (objeto != null) {
            lista.remove(objeto);
        }
    }

}
