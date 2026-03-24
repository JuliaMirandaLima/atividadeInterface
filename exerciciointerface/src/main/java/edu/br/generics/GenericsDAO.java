package edu.br.generics;
import java.util.List;

public interface GenericsDAO<T> {
    void inserir(T object);
    List<T> listar();
    T buscarPorId(int id);
    void remover(int id);
}

