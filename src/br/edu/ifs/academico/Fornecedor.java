package br.edu.ifs.academico;

public class Fornecedor {
	
	// atributos
	
	private String razaoSocial;
	private String cnpj;
	private String cidade;
	
	// metodos
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Fornecedor [Razao social: " + razaoSocial + ", CNPJ: " + cnpj + ", Cidade: " + cidade + "]";
	}
}
