package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;  // final = constante o atributo / static= permite acessar o atributo por fora
	
	private String titulo;
	private String descricao;
	
	
	public abstract double calcularxp();

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static double getXpPadrao() {
		return XP_PADRAO;
	}
	
	
}
