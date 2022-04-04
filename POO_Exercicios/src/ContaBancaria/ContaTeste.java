package ContaBancaria;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Conta conta_daniel = new Conta();
		
		conta_daniel.cliente = "Daniel Oliveira";
		conta_daniel.saldo = 4035.44;
		conta_daniel.exibeSaldo();
		
		//CHAMANDO A FUNÇÃO DE SAQUE
		conta_daniel.saque(2132.03);
		conta_daniel.exibeSaldo();
		
		
		//CHAMANDO A FUNÇÃO DE DEPOSITO
		conta_daniel.deposito(8560.56);
		conta_daniel.exibeSaldo();
		
		
		//OBSERVAÇÃO:
		//METODO “this.”, serve para fazer a REFERENCIA do OBJETO (conta1).
		
		
		
		Conta conta_lucas = new Conta();
		
		conta_lucas.cliente = "Lucas de Paula";
		conta_lucas.saldo	= 1052.88;
		conta_lucas.exibeSaldo();
		
		
		
		
		//REALIZANDO A TRANFERENCIA DE VALORES DA CONTA DE DANIEL PARA LUCAS
		
		conta_daniel.tranferenciaValor(conta_lucas, 535.00);
		conta_daniel.exibeSaldo();
		
		
		conta_lucas.exibeSaldo();
		
		
		
		
		
		
		
		
		

	}

}
