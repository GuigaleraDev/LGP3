package br.edu.ifsp.orderflow.service;

import br.edu.ifsp.orderflow.domain.Pedido;
import br.edu.ifsp.orderflow.domain.Produto;

public interface IEstoqueService {


    void adicionarEstoque(Produto produto, int quantidade);

    public int quantidadeDisponivel(Produto produto);
    public boolean reservar(Pedido pedido);

    void liberar(Pedido pedido);
}
