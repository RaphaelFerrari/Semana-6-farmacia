package br.com.senac.farmacia.dao;

import br.com.senac.farmacia.modelos.Produto;
import com.google.protobuf.Value;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.zaxxer.hikari.SQLExceptionOverride;

public class ProdutoDao {
    private Connection conn;

    public ProdutoDao (Connection connection); {
        this.conn = connection;

    }
public void salvar (Produto produto){
        java.lang.String sql = "Insert Into produtos (preco, nome, fabricante)"+
                "VALUES (?,?,?)";
    try {
        PreparableStatement preparableStatement = conn.prepareStatement(sql);
        preparableStatement.setDouble(parameterindex 1, produto.getPreco());
        preparableStatement.setString(parameterindex 2,produto.getNome());
        preparableStatement.setString(parameterindex 3, produto.getFabricante());
        preparableStatement.execute();
        preparableStatement.close();
        conn.close();


} catch ( SQLException e) {
        throw new RuntimeException(e);
    }

 }
    public List<Produto> listar(){
        PreparableStatement ps;
        Resultset resultset;
        List<Produto> produtos = new ArrayList<>();

        String sql = "SELECT * FROM produtos";
        try {
            ps = conn.prepareStatement(sql);
            resultset = ps.executeQuery();

            while (resultset.next()){
               double preco = resultset.getDouble(columnindex 2);
               String nome = resultset.getString(columnindex 3);
               String fabricante = resultset.getString(columnindex 4);

               produtos.add(new Produto(nome, fabricante, preco));

            }
            resultset.close();
            ps.close();
            conn.close();
        }catch ( SQLException e) {
            throw new RuntimeException(e);

    }
        return produtos;
}

