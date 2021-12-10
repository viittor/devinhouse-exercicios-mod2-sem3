package exercicios.exercicio02;

public class Fatura {
	private String numero;
	private String descricao;
	private int quantComp;
	private double precoUnit;

	public Fatura() {
		this.numero = "15";
		this.descricao = "Fatura do Cartão XYZ";
		this.quantComp = 5;
		this.precoUnit = 2.5;

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantComp() {
		return quantComp;
	}

	public void setQuantComp(int quantComp) {
		this.quantComp = quantComp;
	}

	public double getPrecoUnit() {
		return precoUnit;
	}

	public void setPrecoUnit(double precoUnit) {
		this.precoUnit = precoUnit;
	}

	double getValorFatura() {
		if (this.quantComp < 0) {
			this.quantComp = 0;
		}
		if (this.precoUnit < 0) {
			this.precoUnit = 0;
		}
		double total = this.quantComp * this.precoUnit;

		return total;
	}

}
