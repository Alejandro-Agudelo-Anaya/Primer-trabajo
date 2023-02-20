import java.util.*;
import java.math.*;
public class PUNTO_DOS {

	public static void main(String[] args) {
		double A,B,p;
		System.out.println("Ingrese el radio: ");
		Scanner entrada=new Scanner(System.in);
		A=entrada.nextDouble();
		B=Math.PI*Math.pow(A, 2);
		p=2*Math.PI*A;
	
		
		
		System.out.println("El area del circulo es: "+String.format("%.2f",B)+" y su longitud es: "+String.format("%.2f",p));
		
	}

}
