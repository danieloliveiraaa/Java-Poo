package ContaBancaria;

public class Conta {
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente + " seu saldo é "+ saldo);
	}
	
	//metodo de saque 
	void saque(double valor) {
		saldo -= valor;
		//OU
		//saldo = saldo - valor;
	}
	
	//metodo de deposito
	void deposito(double valor) {
		saldo += valor;
	}
	
	
	//OBSERVAÇÃO:
	//METODO “this.”, serve para fazer 
	//A REFERENCIA do OBJETO (conta1).
	
	
	
	void tranferenciaValor(Conta destino, double valor) {
		this.saque(valor);
		destino.deposito(valor);
	}

}
