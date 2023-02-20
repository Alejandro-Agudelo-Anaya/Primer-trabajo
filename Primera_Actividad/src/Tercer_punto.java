import java.util.*;

public class Tercer_punto {

	public static void main(String[] args) {
		System.out.println("Ingrese el numero que quieres elevar: ");
		Scanner entrada= new Scanner(System.in);
		double A=entrada.nextDouble();
		double b=Math.pow(A, 2);
		double c=Math.pow(A, 3);
		System.out.println("el numero al cuadrado es :"+b+" y al cubo es "+c);
		
		

	}

}
