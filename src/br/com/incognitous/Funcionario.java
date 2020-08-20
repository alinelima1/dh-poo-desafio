package br.com.incognitous;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
	private int id;
	private String endereco;
	private String nome;
	private String email;
	private String setor;
	private LocalDate dataAdmissao;
	private LocalDate dataDemissao;
	private double salarioBase;
	private LocalDate inicioFerias;
	private LocalDate fimFerias;
	private ContraCheque contraCheques;
	private LocalDate previsaoInicioFerias;
	private LocalDate previsaoFimFerias;
	private String status; // Contratado ou Demitido
	
	public Funcionario(int id, String endereco, String nome, String email, String setor, LocalDate dataAdmissao,
			double salarioBase, LocalDate inicioFerias, LocalDate fimFerias, ContraCheque contraCheque) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.nome = nome;
		this.email = email;
		this.setor = setor;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.salarioBase = salarioBase;
		this.inicioFerias = inicioFerias;
		this.fimFerias = fimFerias;
		this.contraCheques = contraCheque;
		this.status = "Contratado";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public LocalDate getDataDemissao() {
		return dataDemissao;
	}
	
	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public LocalDate getInicioFerias() {
		return inicioFerias;
	}

	public void setInicioFerias(LocalDate inicioFerias) {
		this.inicioFerias = inicioFerias;
	}

	public LocalDate getFimFerias() {
		return fimFerias;
	}

	public void setFimFerias(LocalDate fimFerias) {
		this.fimFerias = fimFerias;
	}

	public ContraCheque getContraCheques() {
		return contraCheques;
	}

	public void setContraCheques(ContraCheque contraCheques) {
		this.contraCheques = contraCheques;
	}

	public LocalDate getPrevisaoInicioFerias() {
		return previsaoInicioFerias;
	}

	public void setPrevisaoInicioFerias(LocalDate previsaoInicioFerias) {
		this.previsaoInicioFerias = previsaoInicioFerias;
	}

	public LocalDate getPrevisaoFimFerias() {
		return previsaoFimFerias;
	}

	public void setPrevisaoFimFerias(LocalDate previsaoFimFerias) {
		this.previsaoFimFerias = previsaoFimFerias;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
