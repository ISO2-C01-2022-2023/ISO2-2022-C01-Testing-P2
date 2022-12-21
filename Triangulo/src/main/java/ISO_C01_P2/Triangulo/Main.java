package ISO_C01_P2.Triangulo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String cadena="";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba los lados de los lados separados por comas");
		cadena=teclado.nextLine();
		String[] lados=cadena.split(",");
		System.out.println("Escriba los �ngulos de los lados separados por comas");
		cadena=teclado.nextLine();
		String[] angulos=cadena.split(",");
		Triangulo t=control_Triangulo.saberTipo(lados,angulos);
		if(t==null) {
			System.out.println("No se ha podido crear el triangulo.");
		}else {
			System.out.println("Se ha podido crear el triangulo correctamente.");
		}

	}
	
}
