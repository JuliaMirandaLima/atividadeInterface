package edu.br.generics;
import edu.br.Produto;

public class ProdutoDAO extends DAOList<Produto> {

    @Override
    public Produto buscarPorId(int id) {
        for (Produto produto : lista) {
            // pega do proprio produto
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null; 
    }
}