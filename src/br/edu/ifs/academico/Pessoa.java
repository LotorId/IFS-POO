package br.edu.ifs.academico;

public class Pessoa {
	
	private String nome;
	private char sexo;
	private String localNascimento;
	private String dataNascimento;
	private double salarioBolsa;
	
	public Pessoa (String nome) {
		this.setNome(nome);
	}
	
	public String lerDadosAbertos() {
		return "nome" + nome + " data de nascimento: " + dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getLocalNascimento() {
		return localNascimento;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
	public double getSalarioBolsa() {
		return salarioBolsa;
	}
	public void setSalarioBolsa(double salarioBolsa) {
		this.salarioBolsa = salarioBolsa;
	}
	public double calcularDecimoTerceiro() {
		return salarioBolsa / 3;
	}

	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + ", Sexo: " + sexo + ", Local de Nascimento: " + localNascimento + ", dataNascimento: "
				+ dataNascimento + ", Salario/Bolsa: " + salarioBolsa + "]" + ", Decimo terceiro: " + calcularDecimoTerceiro();
	}
}
