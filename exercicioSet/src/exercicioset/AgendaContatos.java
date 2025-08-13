package exercicioset;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;
    
    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNummero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNummero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.exibirContato();
        
        agendaContatos.adicionarContato("Matheus", 98884561);
        agendaContatos.adicionarContato("Jefferon", 95496363);
        agendaContatos.adicionarContato("Adrian", 97912541);
        agendaContatos.adicionarContato("Gustavo", 92315464);
        
        agendaContatos.exibirContato();
        
        System.out.println(agendaContatos.pesquisarPorNome("Adrian"));
        
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Gustavo", 9928922));
        
        agendaContatos.exibirContato();
    }
}
