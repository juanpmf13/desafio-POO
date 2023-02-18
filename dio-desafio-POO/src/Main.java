import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso  = new Curso();

        curso.setTitulo("curso java");
        curso.setDescricao("descricao curso java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso("curso js","descricao curso js",4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria("curso js","descricao curso js",LocalDate.now());

        Conteudo conteudo = new Curso();

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        //devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteúdo Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXp());

        System.out.println("-------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteúdo Inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXp());
    }
}
