package br.edu.ifs.academico;

import br.edu.ifs.util.CalculosSalariais;

public class Professor extends Pessoa {
	
	private String formacao;
	
	public Professor(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public String lerDadosAbertos() {
		return super.lerDadosAbertos() + " formacao: " + formacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	@Override
	public double calcularDecimoTerceiro() {
		return super.getSalarioBolsa();
	}

	@Override
	public String toString() {
		return "Professor [Salario Liquido: " + CalculosSalariais.calculoSalario(super.getSalarioBolsa()) + ", Formacao: " + formacao + ", " + super.toString() + "]";
	}
	
	

}
