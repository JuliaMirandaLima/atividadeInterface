package edu.br.generics;
// TEM QUE EXPLICFAR PRA INTERFAXCE QUE ESTAMOS USANDO O GENERICS, ONDE A INTERFACE RECEBIA UM OBJETO ELE VAI RECEBER UM TEXTO
import java.util.List;

public interface GenericsDAO<T extends Tipo> {
    void inserir(T object);
    List<T> listar();
    T buscarPorId(int id);
    void remover(int id);
}

