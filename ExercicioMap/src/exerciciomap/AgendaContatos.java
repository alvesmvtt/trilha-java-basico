package exerciciomap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
   private Map<String, Integer> agendaContatoMap;
       public AgendaContatos(){
       this.agendaContatoMap = new HashMap<>();
   }
   public void adicionarContato(String nome, Integer telefone){
       agendaContatoMap.put(nome, telefone);
   }
   public void removerContato(String nome){
       if(!agendaContatoMap.isEmpty()){
           agendaContatoMap.remove(nome);
       }
   }
   public void exibirContatos(){
       System.out.println(agendaContatoMap);
   }
   public Integer pesquisarPorNome (String nome){
       Integer numeroPorNome = null;
       if(!agendaContatoMap.isEmpty()){
           agendaContatoMap.get(nome);
       }
       return numeroPorNome;
   }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.exibirContatos();
        
        agendaContatos.adicionarContato("Matheus", 98884561);
        agendaContatos.adicionarContato("Jefferon", 95496363);
        agendaContatos.adicionarContato("Adrian", 97912541);
        agendaContatos.adicionarContato("Gustavo", 92315464);
        
        agendaContatos.exibirContatos();
        
        System.out.println(agendaContatos.pesquisarPorNome("Adrian"));
        
        
    }
}
 