package br.com.incognitous;

public class ContraCheque {
	private double salarioBaseAtual;
	private double horaExtra;
	private double adicionalNoturno;
	private double bonificacao;
	private double inss;
	private double fgts;
	private double irrf;
	private double salarioLiquido;
	
	public ContraCheque(double salarioBaseAtual, double horaExtra, double adicionalNoturno, double bonificacao) {
		super();
		this.salarioBaseAtual = salarioBaseAtual;
		this.horaExtra = horaExtra;
		this.adicionalNoturno = adicionalNoturno;
		this.bonificacao = (this.salarioBaseAtual + this.horaExtra + this.adicionalNoturno) * (bonificacao/100);
		this.inss = calculaInss(this.salarioBaseAtual + this.horaExtra + this.adicionalNoturno + this.bonificacao);
		this.fgts = (this.salarioBaseAtual + this.horaExtra + this.adicionalNoturno + this.bonificacao) * 0.08;
		this.irrf = calculaIrrf((this.salarioBaseAtual + this.horaExtra + this.adicionalNoturno + this.bonificacao) - this.inss);
		this.salarioLiquido = this.salarioBaseAtual + this.horaExtra + this.adicionalNoturno + this.bonificacao - this.inss - this.fgts - this.irrf;
	}
	
	private double calculaInss(double salarioBruto) {
		double percentualInss = 0;
		if(salarioBruto <= 1045) {
			percentualInss = 7.5;
		}else if(salarioBruto >= 1045.01 && salarioBruto <= 2089.60) {
			percentualInss = 9;
		}else if(salarioBruto >= 2089.01 && salarioBruto <= 3134.40) {
			percentualInss = 12;
		}else if(salarioBruto >= 3134.41 && salarioBruto <= 6101.06) {
			percentualInss = 14;
		}
		return salarioBruto * (percentualInss/100);
	}
	
	private double calculaIrrf(double salarioBruto) {
		double percentualIrrf = 0;
		if(salarioBruto >= 1903.88 && salarioBruto <= 2826.65) {
			percentualIrrf = 7.5;
		}else if(salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
			percentualIrrf = 15;
		}else if(salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
			percentualIrrf = 22.5;
		}else if(salarioBruto >= 4664.69) {
			percentualIrrf = 27.5;
		}
		return salarioBruto * (percentualIrrf/100);
	}

	public double getSalarioBaseAtual() {
		return salarioBaseAtual;
	}

	public void setSalarioBaseAtual(double salarioBaseAtual) {
		this.salarioBaseAtual = salarioBaseAtual;
	}

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getFgts() {
		return fgts;
	}

	public void setFgts(double fgts) {
		this.fgts = fgts;
	}

	public double getIrrf() {
		return irrf;
	}

	public void setIrrf(double irrf) {
		this.irrf = irrf;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	@Override
	public String toString() {
		return "ContraCheque [salarioBaseAtual=" + salarioBaseAtual + ", horaExtra=" + horaExtra + ", adicionalNoturno="
				+ adicionalNoturno + ", bonificacao=" + bonificacao + ", inss=" + inss + ", fgts=" + fgts + ", irrf="
				+ irrf + ", salarioLiquido=" + salarioLiquido + "]";
	}
	
	

}
