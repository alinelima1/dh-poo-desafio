package br.com.incognitous;

import java.time.LocalDate;

public class PessoaFisica extends Funcionario {
	private String nit;

	public PessoaFisica(int id, String endereco, String nome, String email, String setor, LocalDate dataAdmissao,
			double salarioBase, LocalDate inicioFerias, LocalDate fimFerias, ContraCheque contraCheque, String nit) {
		super(id, endereco, nome, email, setor, dataAdmissao, salarioBase, inicioFerias, fimFerias, contraCheque);
		this.nit = nit;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}
	
	@Override
	public String toString() {
		return "Funcionario PessoaFisica [id=" + this.getId() + ", endereco=" + this.getEndereco() + ", nome=" + this.getNome() + ", email=" + this.getEmail() + ", setor=" + this.getSetor()
				+ ", dataAdmissao=" + this.getDataAdmissao() + ", dataDemissao=" + this.getDataDemissao() + ", salarioBase=" + this.getSalarioBase()
				+ ", inicioFerias=" + this.getInicioFerias() + ", fimFerias=" + this.getFimFerias() + ", contraCheques=" + this.getContraCheques() + ", nit=" + nit 
				+ ", previsaoInicioFerias=" + this.getPrevisaoInicioFerias() + ", previsaoFimFerias=" + this.getPrevisaoFimFerias() + ", status=" + this.getStatus() + "]";
	}

}
