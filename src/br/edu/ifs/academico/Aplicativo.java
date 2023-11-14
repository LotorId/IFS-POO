package br.edu.ifs.academico;

import java.util.Scanner;

import java.util.ArrayList;

public class Aplicativo {

	public final static void limpar() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nome;
		String dataNascimento;
		String localNascimento;
		char sexo;
		double salarioBolsa;
		
		// ArraysLists

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		ArrayList<Professor> professores = new ArrayList<Professor>();

		ArrayList<Coordenador> coordenadores = new ArrayList<Coordenador>();

		ArrayList<Estagiario> estagiarios = new ArrayList<Estagiario>();

		ArrayList<Pesquisador> pesquisadores = new ArrayList<Pesquisador>();

		ArrayList<Psicologo> psicologos = new ArrayList<Psicologo>();

		ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
		
		ArrayList<Bolsista> bolsistas = new ArrayList<Bolsista>();
		
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

		// Inicio

		System.out.println(Menu.getMenu());
		int opcao = scan.nextInt();

		while (opcao != 0) {

			switch (opcao) {
			case 1: {
				double nota1;
				double nota2;
				double nota3;

				limpar();

				System.out.println("Qual seu nome? ");
				nome = scan.next();

				Aluno aluno = new Aluno(nome);

				System.out.println("Qual seu sexo? ");
				sexo = scan.next().toLowerCase().charAt(0);
				aluno.setSexo(sexo);

				System.out.println("Qual a sua data de nascimento? Ex: 25/06/20");
				dataNascimento = scan.next();
				aluno.setDataNascimento(dataNascimento);

				System.out.println("Qual seu local de nascimento? Ex: Lagarto/SE");
				localNascimento = scan.next();
				aluno.setLocalNascimento(localNascimento);
				
				System.out.println("Qual valor do seu salario/bolsa?");
				salarioBolsa = scan.nextDouble();
				aluno.setSalarioBolsa(salarioBolsa);

				System.out.println("Informe sua 1º nota: ");
				nota1 = scan.nextDouble();
				aluno.setNota1(nota1);

				System.out.println("Informe sua 2º nota: ");
				nota2 = scan.nextDouble();
				aluno.setNota2(nota2);

				System.out.println("Informe sua 3º nota: ");
				nota3 = scan.nextDouble();
				aluno.setNota3(nota3);

				alunos.add(aluno);

				break;
			}
			case 2: {
				System.out.println(alunos);
				break;
			}
			case 3: {

				String formacao;

				limpar();

				System.out.println("Qual seu nome? ");
				nome = scan.next();

				Professor professor = new Professor(nome);

				System.out.println("Qual seu sexo? ");
				sexo = scan.next().toLowerCase().charAt(0);
				professor.setSexo(sexo);

				System.out.println("Qual a sua data de nascimento? Ex: 25/06/20");
				dataNascimento = scan.next();
				professor.setDataNascimento(dataNascimento);

				System.out.println("Qual seu local de nascimento? Ex: Lagarto/SE");
				localNascimento = scan.next();
				professor.setLocalNascimento(localNascimento);
				
				System.out.println("Qual valor do seu salario/bolsa?");
				salarioBolsa = scan.nextDouble();
				professor.setSalarioBolsa(salarioBolsa);

				System.out.println("Insira sua formação: ");
				formacao = scan.next();
				professor.setFormacao(formacao);

				professores.add(professor);

				break;
			}
			case 4: {

				System.out.println(professores);

				break;
			}
			case 5: {

				String curso;
				String formacao;

				limpar();

				System.out.println("Qual seu nome? ");
				nome = scan.next();

				Coordenador coordenador = new Coordenador(nome);

				System.out.println("Qual seu sexo? ");
				sexo = scan.next().toLowerCase().charAt(0);
				coordenador.setSexo(sexo);

				System.out.println("Qual a sua data de nascimento? Ex: 25/06/1997");
				dataNascimento = scan.next();
				coordenador.setDataNascimento(dataNascimento);

				System.out.println("Qual seu local de nascimento? Ex: Lagarto/SE");
				localNascimento = scan.next();
				coordenador.setLocalNascimento(localNascimento);
				
				System.out.println("Qual valor do seu salario/bolsa?");
				salarioBolsa = scan.nextDouble();
				coordenador.setSalarioBolsa(salarioBolsa);

				System.out.println("Insira sua formação: ");
				formacao = scan.next();
				coordenador.setFormacao(formacao);

				System.out.println("Insira seu curso: ");
				curso = scan.next();
				coordenador.setCurso(curso);

				coordenadores.add(coordenador);

				break;
			}
			case 6: {

				System.out.println(coordenadores);

				break;

			}
			case 7: {

				String instituicao;
				double periodoAtual;
				String curso;

				limpar();

				System.out.println("Qual seu nome? ");
				nome = scan.next();

				Estagiario estagiario = new Estagiario(nome);

				System.out.println("Qual seu sexo? ");
				sexo = scan.next().toLowerCase().charAt(0);
				estagiario.setSexo(sexo);

				System.out.println("Qual a sua data de nascimento? Ex: 25/06/1997");
				dataNascimento = scan.next();
				estagiario.setDataNascimento(dataNascimento);

				System.out.println("Qual seu local de nascimento? Ex: Lagarto/SE");
				localNascimento = scan.next();
				estagiario.setLocalNascimento(localNascimento);
				
				System.out.println("Qual valor do seu salario/bolsa?");
				salarioBolsa = scan.nextDouble();
				estagiario.setSalarioBolsa(salarioBolsa);

				System.out.println("Insira sua instituição: ");
				instituicao = scan.next();
				estagiario.setInstituicao(instituicao);

				System.out.println("Insira seu período atual: ");
				periodoAtual = scan.nextDouble();
				estagiario.setPeriodoAtual(periodoAtual);

				System.out.println("Insira seu curso: ");
				curso = scan.next();
				estagiario.setCurso(curso);

				estagiarios.add(estagiario);

				break;

			}
			case 8: {

				System.out.println(estagiarios);

				break;

			}
			case 9: {

				int codigoPesquisa;
				String grupoPesquisa;
				String instituicaoVinculada;

				limpar();

				System.out.println("Qual seu nome? ");
				nome = scan.next();

				Pesquisador pesquisador = new Pesquisador(nome);

				System.out.println("Qual seu sexo? ");
				sexo = scan.next().toLowerCase().charAt(0);
				pesquisador.setSexo(sexo);

				System.out.println("Qual a sua data de nascimento? Ex: 25/06/1997");
				dataNascimento = scan.next();
				pesquisador.setDataNascimento(dataNascimento);

				System.out.println("Qual seu local de nascimento? Ex: Lagarto/SE");
				localNascimento = scan.next();
				pesquisador.setLocalNascimento(localNascimento);
				
				System.out.println("Qual valor do seu salario/bolsa?");
				salarioBolsa = scan.nextDouble();
				pesquisador.setSalarioBolsa(salarioBolsa);

				System.out.println("Insira seu código de pesquisa: ");
				codigoPesquisa = scan.nextInt();
				pesquisador.setCodigoPesquisa(codigoPesquisa);

				System.out.println("Insira o seu grupo de pesquisa");
				grupoPesquisa = scan.next();
				pesquisador.setGrupoPesquisa(grupoPesquisa);

				System.out.println("Insira a sua instituição vinculada");
				instituicaoVinculada = scan.next();
				pesquisador.setInstituicaoVinculada(instituicaoVinculada);

				pesquisadores.add(pesquisador);

				break;

			}
			case 10: {

				System.out.println(pesquisadores);

				break;

			}
			case 11: {

				int numeroDoConselho;
				double cargaHoraria;

				limpar();

				System.out.println("Qual seu nome? ");
				nome = scan.next();

				Psicologo psicologo = new Psicologo(nome);

				System.out.println("Qual seu sexo? ");
				sexo = scan.next().toLowerCase().charAt(0);
				psicologo.setSexo(sexo);

				System.out.println("Qual a sua data de nascimento? Ex: 25/06/1997");
				dataNascimento = scan.next();
				psicologo.setDataNascimento(dataNascimento);

				System.out.println("Qual seu local de nascimento? Ex: Lagarto/SE");
				localNascimento = scan.next();
				psicologo.setLocalNascimento(localNascimento);
				
				System.out.println("Qual valor do seu salario/bolsa?");
				salarioBolsa = scan.nextDouble();
				psicologo.setSalarioBolsa(salarioBolsa);

				System.out.println("Insira seu numero do conselho:");
				numeroDoConselho = scan.nextInt();
				psicologo.setNumeroDoConselho(numeroDoConselho);

				System.out.println("Insira sua carga horária");
				cargaHoraria = scan.nextDouble();
				psicologo.setCargaHoraria(cargaHoraria);

				psicologos.add(psicologo);

				break;

			}
			case 12: {

				System.out.println(psicologos);

				break;

			}
			case 13: {

				String especialidade;

				limpar();

				System.out.println("Qual seu nome? ");
				nome = scan.next();

				Tecnico tecnico = new Tecnico(nome);

				System.out.println("Qual seu sexo? ");
				sexo = scan.next().toLowerCase().charAt(0);
				tecnico.setSexo(sexo);

				System.out.println("Qual a sua data de nascimento? Ex: 25/06/1997");
				dataNascimento = scan.next();
				tecnico.setDataNascimento(dataNascimento);

				System.out.println("Qual seu local de nascimento? Ex: Lagarto/SE");
				localNascimento = scan.next();
				tecnico.setLocalNascimento(localNascimento);
				
				System.out.println("Qual valor do seu salario/bolsa?");
				salarioBolsa = scan.nextDouble();
				tecnico.setSalarioBolsa(salarioBolsa);

				System.out.println("Insira sua especialidade: ");
				especialidade = scan.next();
				tecnico.setEspecialidade(especialidade);

				tecnicos.add(tecnico);

				break;

			}
			case 14: {

				System.out.println(tecnicos);

				break;
			}
			case 15: {
				
				double valorBolsa;
				String orientador;
				
				limpar();
				
				System.out.println("Qual seu nome? ");
				nome = scan.next();

				Bolsista bolsista = new Bolsista(nome);

				System.out.println("Qual seu sexo? ");
				sexo = scan.next().toLowerCase().charAt(0);
				bolsista.setSexo(sexo);

				System.out.println("Qual a sua data de nascimento? Ex: 25/06/1997");
				dataNascimento = scan.next();
				bolsista.setDataNascimento(dataNascimento);

				System.out.println("Qual seu local de nascimento? Ex: Lagarto/SE");
				localNascimento = scan.next();
				bolsista.setLocalNascimento(localNascimento);
				
				System.out.println("Qual valor do seu salario/bolsa?");
				salarioBolsa = scan.nextDouble();
				bolsista.setSalarioBolsa(salarioBolsa);

				System.out.println("Insira o valor da bolsa: ");
				valorBolsa = scan.nextDouble();
				bolsista.setValorBolsa(valorBolsa);

				System.out.println("Insira seu orientador: ");
				orientador = scan.next();
				bolsista.setOrientador(orientador);				

				bolsistas.add(bolsista);

				break;
				
			}
			case 16: {

				System.out.println(bolsistas);

				break;

			}
			case 17: {

				String razaoSocial;
				String cnpj;
				String cidade;
				
				limpar();

				Fornecedor fornecedor = new Fornecedor();
				
				System.out.println("Qual razão social? ");
				razaoSocial = scan.next();
				fornecedor.setRazaoSocial(razaoSocial);

				System.out.println("Insira o CNPJ: ");
				cnpj = scan.next();
				fornecedor.setCnpj(cnpj);

				System.out.println("Insira a cidade? ");
				cidade = scan.next();
				fornecedor.setCidade(cidade);

				fornecedores.add(fornecedor);

				break;

			}
			case 18: {

				System.out.println(fornecedores);

				break;

			}
			} // End Switch

			System.out.println(Menu.getMenu());

			opcao = scan.nextInt();

		} // End

	}
}
