package br.edu.ifs.academico;

public abstract class Menu {
	
	public static String getMenu() {
		String menu = """
				\s
				********** Sistema Academico **********\s
				=======================================\s
				Menu, digite uma opcao: \s
				1 - Cadastrar Aluno\s
				2 - Listar Alunos\s
				3 - Cadastrar Professor\s
				4 - Listar Professores\s
				5 - Cadastrar Coordenador\s
				6 - Listar Coordenadores\s
				7 - Cadastrar Estagiario\s
				8 - Listar Estagiarios\s
				9 - Cadastrar Pesquisador\s
				10 - Listar Pesquisadores\s
				11 - Cadastrar Psicologo\s
				12 - Listar Psicologos\s
				13 - Cadastrar Tecnico\s
				14 - Listar Tecnicos\s
				15 - Casatrar Bolsista\s
				16 - Listar Bolsistas\s
				17 - Cadastrar Fornecedor\s
				18 - Listar Fornecedores\s
				
				0 - Sair\s
				""";
		return menu;
	}

}
