package edu.br.object;

import edu.br.ProdutoDAOLista;

public class Main {
    public static void main(String[] args) {
        
        ObjectDAO dao = new ProdutoDAOLista(); 
    
        Object p1 = new Object(1, "Notebook", 3500.00);
        Object p2 = new Object(2, "Mouse", 120.00);

        dao.inserir(p1);
        dao.inserir(p2);

        System.out.println("\nlistando");
        for (Object p : dao.listar()) {
            System.out.println(p.toString());
        }

        System.out.println("\nremovendo prond 1");
        Object encontrado = dao.buscarPorId(1);
        System.out.println(encontrado);

    
        System.out.println("\nremovendo prod 2");
        dao.remover(2);
        
        System.out.println("Todos " + dao.listar().size());
    }
}
//nao precisa colocar abstract pq é redundante, não está errado, mas não precisa, pq orientado a objketos é sempre abstrato