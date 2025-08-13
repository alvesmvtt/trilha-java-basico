package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;
    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
       List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
       Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
       return pessoasPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Emily", 22, 1.56);
        ordenacaoPessoas.adicionarPessoa("Matheus", 24, 1.70);
        ordenacaoPessoas.adicionarPessoa("Rivaldo", 54, 1.72);
        ordenacaoPessoas.adicionarPessoa("Luiza", 44, 1.56);
        
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        
    }
}
