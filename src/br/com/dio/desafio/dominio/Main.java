package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();

		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();

		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição curso j");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();

		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now()); // serve para imprimir com a data do dia

		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */

		Bootcamp bootcamp = new Bootcamp();

		bootcamp.setNome("Bootcamop Java Developer");
		bootcamp.setDesscricao("Descrição Bootcamp java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosIncritos());

		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosIncritos());
		System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calculartotalXp());

		System.out.println("--------");

		Dev devJoao = new Dev();  
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosIncritos());

		devJoao.progredir();
		devJoao.progredir(); 
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosIncritos());
		System.out.println("Conteúdos Concluidos João" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calculartotalXp());

	}

}
