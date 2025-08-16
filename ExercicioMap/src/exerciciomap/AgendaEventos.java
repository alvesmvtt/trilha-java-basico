package exerciciomap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map <LocalDate, Evento> eventosMap;
    
    public AgendaEventos(){
        this.eventosMap = new HashMap <>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        eventosMap.values();*/
        
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
                break;
            }
        }
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MARCH, 15), "Lollapaloza", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 16), "Lollapaloza", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.JULY, 17), "Lollapaloza", "Atracao 3");
        
        agendaEventos.exibirAgenda();
        
        agendaEventos.obterProximoEvento();
    }
    
}
