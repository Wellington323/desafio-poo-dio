package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String desscricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate datafinal = dataInicial.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesscricao() {
		return desscricao;
	}
	public void setDesscricao(String desscricao) {
		this.desscricao = desscricao;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDatafinal() {
		return datafinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataInicial, datafinal, desscricao, devsInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;                                    // equals/ hashCode = serve para ver comparações ou ate mesmo afirma V/F 
		}
		if (!(obj instanceof Bootcamp)) {
			return false;
		}
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataInicial, other.dataInicial)
				&& Objects.equals(datafinal, other.datafinal) && Objects.equals(desscricao, other.desscricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	} 
	
	
	
}
