import java.util.*;
public class PrimerPunto {
	

	public static void main(String[] args) {
		int EDJUAN,EDALBER,EDANA,EDMAMA;
		System.out.println("ingrese la edad de Juan:");
		Scanner entrada = new Scanner(System.in);
		EDJUAN=entrada.nextInt();
		EDALBER=2*(EDJUAN/3);
		EDANA=4*(EDJUAN/3);
		EDMAMA=EDJUAN+EDALBER+EDANA;
		System.out.println("la edad de Juan: "+EDJUAN+"");
		System.out.println("la edad de ALberto: "+EDALBER);
		System.out.println("la edad de Ana: "+EDANA);
		System.out.println("la edad de la Mama: "+EDMAMA);
		
		
		

	}

}
