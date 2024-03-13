package br.com.senac.farmacia.service;

import br.com.senac.farmacia.dao.ConnectionFactory;
import br.com.senac.farmacia.dao.ProdutoDao;
import br.com.senac.farmacia.modelos.Produto;

public class ProdutoService {
    private ConnectionFactory connection;
    public ProdutoService (){
        this.connection + new ConnectionFactory();

    }
    public void cadastrar(Produto produto){
       Conection conn = connection.recuperarConexao();
        new ProdutoDao(conn).salvar(produto);

    }
    public List<Produto> listar(){
        Connection conn = connection.recuperarConexao();
        return new ProdutoDao((conn).listar();

    }
}
