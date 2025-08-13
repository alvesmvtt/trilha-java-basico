package exercicioset;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
 private Set<Produto> produtoSet;
 
 public CadastroProdutos(){
     this.produtoSet = new HashSet<>();
     
 }
 public void adicionarProduto(long cod, String nome, double preco, int quantidade){
     produtoSet.add(new Produto(cod, nome, preco, quantidade));
 }
 public Set<Produto> exibirProdutosPorNome(){
     Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
     return produtosPorNome;
 }
 public Set<Produto> exibitProdutosPorPreco(){
     Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
     produtoPorPreco.addAll(produtoSet);
     return produtoPorPreco;
 }
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Leite", 15d, 12);
        cadastroProdutos.adicionarProduto(2L, "Refrigerante", 11d, 5);
        cadastroProdutos.adicionarProduto(1L, "pao", 2d, 13);
        cadastroProdutos.adicionarProduto(4L, "carne", 28d, 3);
        cadastroProdutos.adicionarProduto(9L, "doritos", 8d, 2);
        
        System.out.println(cadastroProdutos.produtoSet);
        
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}
