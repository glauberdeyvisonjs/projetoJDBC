package model;

public class Conta {
	private Integer numero;
	private Double saldo;
	private Double limite;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta [" + (numero != null ? "numero=" + numero + ", " : "")
				+ (saldo != null ? "saldo=" + saldo + ", " : "") + (limite != null ? "limite=" + limite : "") + "]";
	}
	
}
