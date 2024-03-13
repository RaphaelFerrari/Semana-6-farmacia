import br.com.senac.farmacia.modelos.Produto;
import br.com.senac.farmacia.service.ProdutoService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Teste projeto Farmácia Senac");

        Produto produto = new Produto(nome:"Dipirona", fabricante: "Hyperia", preco: 10);
        ProdutoService produtoService = new ProdutoService();
        produtoService.cadastrar(produto);

        }
    }