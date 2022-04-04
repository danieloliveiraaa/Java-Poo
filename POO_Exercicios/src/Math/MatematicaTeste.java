package Math;

public class MatematicaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matematica mat = new Matematica();
		int v_maior = mat.maior(20, 7);
		System.out.println(v_maior);
		
		
		System.out.print("A soma dos dois valores é: ");
		
		double s = mat.soma(30,23);
		System.out.print(s);

	}

}
