package br.com.senac.farmacia.modelos;

public class Produto {
    private int id;
    private String nome;
    private String fabricante;
    private double preco;

    public Produto(String nome, String fabricante, double preco) {

    }

    {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPreco() {
        return preco;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome=" + nome +
                ", fabricante=" + fabricante +
                ", preco=" + preco +
                '}';
    }
}
}
