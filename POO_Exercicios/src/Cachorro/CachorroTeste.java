package Cachorro;

public class CachorroTeste {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		
		
		cachorro1.nome  = "Agenor Lopes da Silva";
		cachorro1.idade = 2;
		cachorro1.raca	= "Pug";
		
		System.out.println("Nome:  "+cachorro1.nome);
		System.out.println("Idade: "+cachorro1.idade);
		System.out.println("Raça:  "+cachorro1.raca);
		
		
	}

}
