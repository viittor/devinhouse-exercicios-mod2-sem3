package aula02;

public class Carro {
	String cor;
	String modelo;
	boolean ligado;
	int velocidadeAtual;
	int velocidadeMaxima;
	
	Carro(int velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	void ligar(){
		if(!this.ligado){
			this.ligado = true;
		}
	}
	
	void desligar() {
		if(this.ligado) {
			this.ligado = false;
			this.velocidadeAtual = 0;
		}
	}
	
	void acelerar(int velocidadeAdd) {
		if(this.ligado) {
			if(this.velocidadeAtual + velocidadeAdd >= this.velocidadeMaxima) {
				this.velocidadeAtual = this.velocidadeMaxima;
			}else {
				this.velocidadeAtual += velocidadeAdd;
			}
		}
	}
	
	void frear(int velocidadeDecremental) {
		if(this.ligado) {
			if(this.velocidadeAtual - velocidadeDecremental <= 0) {
				this.velocidadeAtual = 0;
			}else {
				this.velocidadeAtual -= velocidadeDecremental;
			}
		}
	}
	
	void buzinar() {
		System.out.println("fon fon");
	}

}
