package br.com.incognitous;

import java.time.LocalDate;

public class Gerente extends PessoaFisica {
	private double percentualBonificacao;

	public Gerente(int id, String endereco, String nome, String email, String setor, LocalDate dataAdmissao,
			double salarioBase, LocalDate inicioFerias, LocalDate fimFerias, ContraCheque contraCheque, String nit) {
		super(id, endereco, nome, email, setor, dataAdmissao, salarioBase, inicioFerias, fimFerias, contraCheque, nit);
		this.percentualBonificacao = 12;
	}

	public double getPercentualBonificacao() {
		return percentualBonificacao;
	}

	public void setPercentualBonificacao(double percentualBonificacao) {
		this.percentualBonificacao = percentualBonificacao;
	}

	@Override
	public String toString() {
		return "Funcionario PessoaFisica Gerente [id=" + this.getId() + ", endereco=" + this.getEndereco() + ", nome=" + this.getNome() + ", email=" + this.getEmail() + ", setor=" + this.getSetor()
				+ ", dataAdmissao=" + this.getDataAdmissao() + ", dataDemissao=" + this.getDataDemissao() + ", salarioBase=" + this.getSalarioBase()
				+ ", inicioFerias=" + this.getInicioFerias() + ", fimFerias=" + this.getFimFerias() + ", contraCheques=" + this.getContraCheques() + ", nit=" + this.getNit() + ", percentualBonificacao=" + percentualBonificacao 
				+ ", previsaoInicioFerias=" + this.getPrevisaoInicioFerias() + ", previsaoFimFerias=" + this.getPrevisaoFimFerias() +", status=" + this.getStatus() + "]";
	}
	
}
