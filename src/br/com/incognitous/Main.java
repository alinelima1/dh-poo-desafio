package br.com.incognitous;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Random rand = new Random();
		int option = 0;
		int aux = 0;
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		// Inserções para testes
		funcionarios.add(new PessoaJuridica(1, "Avenida Floriano Peixoto, 38", "Beatriz Xavier", "beatriz@gmail.com", "Financeiro", LocalDate.parse("10/04/2011",formatter), 2500, LocalDate.parse("10/05/2020",formatter), LocalDate.parse("10/06/2020",formatter), new ContraCheque(2500, 400, 58, 0), "12008913000112"));
		funcionarios.add(new PessoaFisica(2, "Rua das ruas, 123", "Paulo Peixoto", "paulo@gmail.com", "Contábil", LocalDate.parse("04/07/2017",formatter), 3000, LocalDate.parse("04/07/2018",formatter), LocalDate.parse("04/08/2018",formatter), new ContraCheque(3000, 0, 180, 0), "83485981036"));
		funcionarios.add(new Supervisor(3, "Avenida do Supervisor, 840", "Luciane Silva", "luciane@gmail.com", "Departamento Pessoal", LocalDate.parse("02/01/2019",formatter), 5000, LocalDate.parse("15/08/2020",formatter), LocalDate.parse("15/09/2020",formatter), new ContraCheque(5000, 380, 0, 8), "96437402008"));
		funcionarios.add(new Gerente(4, "Rua do Gerente, 54", "Jéssica Valentim", "jessica@gmail.com", "TI", LocalDate.parse("15/04/2020",formatter), 6000, LocalDate.parse("15/04/2020",formatter), LocalDate.parse("15/04/2020",formatter), new ContraCheque(6000, 0, 830, 12), "10054556007"));
		funcionarios.add(new PessoaJuridica(5, "Avenida Afonso Pena, 100", "Julia Roberts", "julia@gmail.com", "Financeiro", LocalDate.parse("10/04/2011",formatter), 2500, LocalDate.parse("10/05/2020",formatter), LocalDate.parse("10/06/2020",formatter), new ContraCheque(2500, 400, 58, 0), "12008913000112"));
		funcionarios.add(new PessoaFisica(6, "Rua das orquídeas, 987", "Tom Hanks", "tom@gmail.com", "Contábil", LocalDate.parse("04/07/2017",formatter), 3000, LocalDate.parse("04/07/2018",formatter), LocalDate.parse("04/08/2018",formatter), new ContraCheque(3000, 0, 180, 0), "83485981036"));
		funcionarios.add(new Supervisor(7, "Avenida das avenidas, 9", "Sheila Amaral", "sheila@gmail.com", "Departamento Pessoal", LocalDate.parse("02/01/2019",formatter), 5000, LocalDate.parse("15/08/2020",formatter), LocalDate.parse("15/09/2020",formatter), new ContraCheque(5000, 380, 0, 8), "96437402008"));
		funcionarios.add(new Gerente(8, "Rua Jacaranda, 20", "Guilherme Reis", "gui@gmail.com", "TI", LocalDate.parse("15/04/2020",formatter), 6000, LocalDate.parse("15/04/2020",formatter), LocalDate.parse("15/04/2020",formatter), new ContraCheque(6000, 0, 830, 12), "10054556007"));		
		//Fim inserções para testes			
		
		do {
			System.out.println(
				"*************************\n" + 
				"1) Cadastrar novo Funcionário\n" +
				"2) Listar Funcionários\n" +
				"3) Solicitar Férias\n" +
				"4) Demitir Funcionário\n" +
				"5) Reajustar Salário\n" +
				"6) Pedir demissão\n" +
				"7) Solicitar aumento\n" +
				"8) Consultar Contra Cheque\n" +
				"9) Trabalhar\n" +
				"10) Sair\n" +
				"*************************\n"
			);
			option = input.nextInt();
			input.nextLine();
			
			switch(option) {
			case 1:
				Funcionario func;
				String endereco; String nome; String email; String setor; LocalDate dataAdmissao;
				double salarioBase; String documento;
				
				System.out.println("Informe o endereço do funcionário: ");
				endereco = input.nextLine();
				System.out.println("Informe o nome do funcionário:");
				nome = input.nextLine();
				System.out.println("Informe o email do funcionário:");
				email = input.nextLine();
				System.out.println("Informe o setor do funcionário:");
				setor = input.nextLine();
				System.out.println("Informe a data de admissão (dd/MM/aaaa):");
				dataAdmissao = LocalDate.parse(input.nextLine(),formatter);
				System.out.println("Informe o salário do funcionário:");
				salarioBase = input.nextDouble();
				
				System.out.println("Informe o regime de contratação: \n1)CLT\n2)PJ");
				aux = input.nextInt();
				input.nextLine();
				if(aux == 1) {
					System.out.println("Informe o número do NIT:");
					documento = input.nextLine();
					System.out.println("Informe o tipo de funcionário: \n1) Colaborador\n2) Supervisor\n3) Gerente\n");
					aux = input.nextInt();
					
					if(aux == 1) {
						func = new PessoaFisica(funcionarios.size() + 1, endereco, nome, email, setor, dataAdmissao, salarioBase, dataAdmissao, dataAdmissao, new ContraCheque(salarioBase, 0, 0, 0), documento);
						funcionarios.add(func);
					}else if(aux == 2) {
						func = new Supervisor(funcionarios.size() + 1, endereco, nome, email, setor, dataAdmissao, salarioBase, dataAdmissao, dataAdmissao, new ContraCheque(salarioBase, 0, 0, 8), documento);
						funcionarios.add(func);
					}else if(aux == 3) {
						func = new Gerente(funcionarios.size() + 1, endereco, nome, email, setor, dataAdmissao, salarioBase, dataAdmissao, dataAdmissao, new ContraCheque(salarioBase, 0, 0, 12), documento);
						funcionarios.add(func);
					}else {
						System.out.println("Opção inválida!");
					}
				}else if(aux == 2) {
					System.out.println("Informe o número do CNPJ: ");
					documento = input.nextLine();
					func = new PessoaJuridica(funcionarios.size() + 1, endereco, nome, email, setor, dataAdmissao, salarioBase, dataAdmissao, dataAdmissao,new ContraCheque(salarioBase, 0, 0, 0),documento);
					funcionarios.add(func);
				}else {
					System.out.println("Opção inválida!");
				}
				break;
			case 2:
				funcionarios.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Informe o id do funcionário: ");
				aux = input.nextInt();
				input.nextLine();
				if(aux > 0 && aux <= funcionarios.size()) {
					long periodoAdmissao = Period.between(funcionarios.get(aux - 1).getDataAdmissao(), LocalDate.now()).toTotalMonths();
					if(periodoAdmissao > 11) {
						if(funcionarios.get(aux - 1).getInicioFerias().isBefore(LocalDate.now()) && funcionarios.get(aux - 1).getFimFerias().isAfter(LocalDate.now())) {
							System.out.println("Este funcionário está de férias, é necessário aguardar 4 meses após seu retorno para agendar novas férias.");
						}else {
							long retornoFerias = Period.between(funcionarios.get(aux - 1).getFimFerias(), LocalDate.now()).toTotalMonths();
							if(retornoFerias > 4) {
								System.out.println("Informe a data que deseja sair de férias: ");
								LocalDate inicio = LocalDate.parse(input.nextLine(),formatter); 
								funcionarios.get(aux - 1).setPrevisaoInicioFerias(inicio);
								System.out.println("Quantos dias irá ficar de férias? (10 a 30 dias)");
								funcionarios.get(aux - 1).setPrevisaoFimFerias(inicio.plusDays(input.nextLong()));
								System.out.println("Férias programadas de " + funcionarios.get(aux - 1).getPrevisaoInicioFerias() + " até " + funcionarios.get(aux - 1).getPrevisaoFimFerias());
							}else {
								System.out.println("Funcionário ainda não está apto para solicitar férias, pois possui apenas " + retornoFerias + " meses que ele retornou das últimas férias.");
							}
						}
					}else {
						System.out.println("Funcionário ainda não está apto para solicitar férias, pois possui apenas " + periodoAdmissao + " meses de contrato ativo.");
					}
				}else {
					System.out.println("Funcionário não encontrado.");
				}
				break;
			case 4:
				System.out.println("Quem é o demandante da demissão? (informe o id)");
				aux = input.nextInt();
				if(aux > 0 && aux <= funcionarios.size()) {
					String demandante = funcionarios.get(aux - 1).getClass().getSimpleName(); 
					if(demandante.equals("Supervisor") || demandante.equals("Gerente")) {
						System.out.println("Qual funcionário está sendo demitido? (informe o id)");
						int idx = input.nextInt();
						if(idx > 0 && idx <= funcionarios.size()) {
							String demitido = funcionarios.get(idx - 1).getClass().getSimpleName(); 
							if(demandante.equals("Gerente") && (demitido.equals("Supervisor") || demitido.equals("PessoaFisica") || demitido.equals("PessoaJuridica"))) {
								funcionarios.get(idx - 1).setStatus("Demitido");
								System.out.println("Funcionário " + funcionarios.get(idx - 1).getNome() + " demitido.");
							}else if(demandante.equals("Supervisor") && (demitido.equals("PessoaFisica") || demitido.equals("PessoaJuridica"))) {
								funcionarios.get(idx - 1).setStatus("Demitido");
								System.out.println("Funcionário " + funcionarios.get(idx - 1).getNome() + " demitido.");
							}else {
								System.out.println("Funcionário " + demandante + " não pode demitir funcionário " + demitido + "!");
							}
						}else {
							System.out.println("Funcionário a ser demitido não encontrado.");
						}
					}else {
						System.out.println("Este funcionário não pode realizar demissões.");
					}
				}else {
					System.out.println("Funcionário demandante da demissão não encontrado.");
				}
				break;
			case 5:
				System.out.println("Quem é o demandante do reajuste? (informe o id)");
				aux = input.nextInt();
				if(aux > 0 && aux <= funcionarios.size()) {
					String demandante = funcionarios.get(aux - 1).getClass().getSimpleName(); 
					if(demandante.equals("Gerente")) {
						System.out.println("Qual funcionário terá reajuste? (informe o id)");
						int idx = input.nextInt();
						if(idx > 0 && idx <= funcionarios.size()) {
							String reajustado = funcionarios.get(idx - 1).getClass().getSimpleName(); 
							if(demandante.equals("Gerente") && (reajustado.equals("Supervisor") || reajustado.equals("PessoaFisica") || reajustado.equals("PessoaJuridica"))) {
								System.out.println("Informe o novo salário");
								double novoSal = input.nextDouble();
								if(novoSal > funcionarios.get(idx - 1).getSalarioBase()) {
									funcionarios.get(idx - 1).setSalarioBase(novoSal);
									System.out.println("Funcionário " + funcionarios.get(idx - 1).getNome() + " teve seu salário reajustado.");
								}else {
									System.out.println("Novo salário deve ser maior que o anterior.");
								}								
							}else {
								System.out.println("Funcionário " + demandante + " não pode reajustar salário de funcionário " + reajustado + "!");
							}
						}else {
							System.out.println("Funcionário que terá reajuste não encontrado.");
						}
					}else {
						System.out.println("Este funcionário não pode realizar reajustes.");
					}
				}else {
					System.out.println("Funcionário demandante do reajuste não encontrado.");
				}
				break;
			case 6:
				System.out.println("Quem está pedindo demissão? (informe o id)");
				aux = input.nextInt();
				if(aux > 0 && aux <= funcionarios.size()) {
					funcionarios.get(aux - 1).setStatus("Demitido");
					System.out.println("O funcionário " + funcionarios.get(aux - 1).getNome() + " foi desligado, conforme solicitado.");
				}else {
					System.out.println("Funcionário não encontrado.");
				}
				break;
			case 7:
				System.out.println("Quem está pedindo aumento? (informe o id)");
				aux = input.nextInt();
				if(aux > 0 && aux <= funcionarios.size()) {
					System.out.println("Qual salário solicitado?");
					double novoSalario = input.nextDouble();
					if(novoSalario > funcionarios.get(aux - 1).getSalarioBase()) {
						int num = rand.nextInt(2);
						if(num == 0) {
							funcionarios.get(aux - 1).setSalarioBase(novoSalario);
							System.out.println("O funcionário " + funcionarios.get(aux - 1).getNome() + " recebeu um aumento, conforme solicitado.");
						}else {
							System.out.println("Aumento salarial não aprovado.");
						}			
						
					}else {
						System.out.println("Novo salário deve ser maior que o anterior.");
					}
					
				}else {
					System.out.println("Funcionário não encontrado.");
				}
				break;
			case 8:
				System.out.println("Informe o id do funcionário: ");
				aux = input.nextInt();
				if(aux > 0 && aux <= funcionarios.size()) {
					System.out.println(funcionarios.get(aux - 1).getContraCheques());
				}else {
					System.out.println("Funcionário não encontrado.");
				}
				break;
			case 9:
				System.out.println("Qual funcionário deve trabahar agora? (Digite seu id)");
				aux = input.nextInt();
				if(aux > 0 && aux <= funcionarios.size()) {
					if(funcionarios.get(aux - 1).getInicioFerias().isBefore(LocalDate.now()) && funcionarios.get(aux - 1).getFimFerias().isAfter(LocalDate.now())) {
						System.out.println("Este funcionário está de férias, não pode trabalhar.");
					}else {
						System.out.println(funcionarios.get(aux - 1).getNome() + " está trabalhando!");
					}
				}else {
					System.out.println("Funcionário não encontrado.");
				}
				break;
			case 10:
				System.out.println("Até logo!");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(option != 10);
	}

}
