package exerciciomap;
import java.util.HashMap;
import java.util.Map;
public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;
    
    
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome,int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque =0d;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() + p.getPreco();
            }
        }
         return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
       Produto produtoMaisCaro = null;
       double maiorPreco = Double.MIN_VALUE;
       if(!estoqueProdutosMap.isEmpty()){
           for(Produto p : estoqueProdutosMap.values()){
               if(p.getPreco() > maiorPreco){
                   produtoMaisCaro = p;
               }
           }
       } return produtoMaisCaro;
    } 
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProduto();
        
        estoque.adicionarProduto(1L, "Refrigerante", 10, 9.89);
        estoque.adicionarProduto(2L, "Katchup", 5, 6.99);
        estoque.adicionarProduto(3L, "Arroz", 3, 10.99);
        
        estoque.exibirProduto();
        
        System.out.println("Valor total do estoque: R$ " + String.format("%.2f", estoque.calcularValorTotalEstoque()));
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        
    }
}
