package edu.br.generics;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method; // Importante para o Reflection

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
        for (T objeto : lista) {
            try {
                Method metodoGetId = objeto.getClass().getMethod("getId");
                int idDoObjeto = (int) metodoGetId.invoke(objeto);
                if (idDoObjeto == id) {
                    return objeto;
                }
            } catch (Exception e) {  // Se der erro (ex: a classe não tem o método getId), ele simplesmente ignora e tenta o próximo
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