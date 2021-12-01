package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{ 

	                                    // Encapsulamento / modificador / Tipo / Atributos
	private Integer cargaHoraria;
	
	
	@Override
	public double calcularxp() {
		
		return XP_PADRAO * cargaHoraria; 
	}
	
	public Curso() {
		
	}
	
	                                         // Encapsulamento / metodos / modificador de acesso
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	
	
	
}
	
	
	
	
	
	
	
	
	

