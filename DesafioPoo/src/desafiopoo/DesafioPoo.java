
package desafiopoo;

import java.time.LocalDate;

public class DesafioPoo {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descricao curso javaScript");
        curso2.setCargaHoraria(9);
         
        Conteudo conteudo = new Curso();
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMatheus.getConteudosIncritos());
        devMatheus.progredir();
        System.out.println("Conteudos Inscritos" + devMatheus.getConteudosIncritos());
        System.out.println("Conteudos Concluidos" + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularXp());
        
        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMarcos.getConteudosIncritos());
        devMarcos.progredir();
        System.out.println("Conteudos Inscritos" + devMarcos.getConteudosIncritos());
        System.out.println("Conteudos Concluidos" + devMarcos.getConteudosConcluidos());
        System.out.println("XP: " + devMarcos.calcularXp());
        
    }
    
}
