package edu.br.object;

import java.util.ArrayList;
import java.util.List;

import edu.br.Produto;

public class ObjectLista implements ObjectDAO {

    // 1. Declare and initialize the list to store the objects
    private List<Object> objects = new ArrayList<>();

    @Override
    public void inserir(Object object) {
        // Simply add the object to the list
        objects.add(object);
    }

    @Override
    public List<Object> listar() {
        // Return the current list of objects
        return objects;
    }

    @Override
    public Object buscarPorId(int id) {
       for (Object o : objects) {
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
        Object objectToRemove = buscarPorId(id);
        if (objectToRemove != null) {
            objects.remove(objectToRemove);
        }
    }
}