package meuBanco.entidades;

public class ContaCorrente {

	private String codigo;
	private double saldo;
	
	public ContaCorrente(String codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getSaldo() {
		return saldo;
	}


}
