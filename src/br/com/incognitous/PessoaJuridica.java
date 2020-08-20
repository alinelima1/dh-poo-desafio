package br.com.incognitous;

import java.time.LocalDate;

public class PessoaJuridica extends Funcionario {
	private String cnpj;

	public PessoaJuridica(int id, String endereco, String nome, String email, String setor, LocalDate dataAdmissao,
			double salarioBase, LocalDate inicioFerias, LocalDate fimFerias, ContraCheque contraCheque, String cnpj) {
		super(id, endereco, nome, email, setor, dataAdmissao, salarioBase, inicioFerias, fimFerias, contraCheque);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Funcionario PessoaFisica [id=" + this.getId() + ", endereco=" + this.getEndereco() + ", nome=" + this.getNome() + ", email=" + this.getEmail() + ", setor=" + this.getSetor()
				+ ", dataAdmissao=" + this.getDataAdmissao() + ", dataDemissao=" + this.getDataDemissao() + ", salarioBase=" + this.getSalarioBase()
				+ ", inicioFerias=" + this.getInicioFerias() + ", fimFerias=" + this.getFimFerias() + ", contraCheques=" + this.getContraCheques() + ", cnpj=" + cnpj 
				+ ", previsaoInicioFerias=" + this.getPrevisaoInicioFerias() + ", previsaoFimFerias=" + this.getPrevisaoFimFerias() + ", status=" + this.getStatus() + "]";
	}
}
