package ISO_C01_P2.Triangulo;

import java.util.Arrays;

public class control_Triangulo {
	public static Triangulo saberTipo(String[] ladosString,String[] angulosString){
		double[] lados=new double[3];
		double[]angulos=new double[3];
		boolean esRectangulo=false;
		boolean esObtuso=false;
		Triangulo t= null;
		for(int i=0;i<3;i++) {
			try {
				lados[i]=Double.parseDouble(ladosString[i]);
				angulos[i]=Double.parseDouble(angulosString[i]);
			}catch(NumberFormatException e) {
				return null;
			}
				if (lados[i]<=0 || angulos[i]<=0) {
					return null;
				}
		}
		double[] ladosAux =lados;
		Arrays.sort(ladosAux);
		if(ladosAux[2]>=(ladosAux[0]+ladosAux[1])) {
			System.out.println("Dados los lados no puede ser un triángulo");
		}else {
			double sumaAngulos = angulos[0]+angulos[1]+angulos[2];
			
			if(sumaAngulos!=180) {
				System.out.println("Dados los ángulos no puede ser un triángulo");
			}else {	
				int ladoscoinciden=0;
				int anguloscoinciden=0;
				for (int i=0;i<2;i++) {
					
					if(lados[i]==lados[i+1])
						++ladoscoinciden;
					
					if(angulos[i]==angulos[i+1])
						++anguloscoinciden;
				}
				if (ladoscoinciden != anguloscoinciden) {
					System.out.println("Dados los lados y �ngulos no es un tri�ngulo posible");
				}else {
					t = new Triangulo(lados[0], lados[1], lados[2], angulos[0], angulos[1], angulos[2]);
					switch(ladoscoinciden) {
					case 0: 
						System.out.print("El tri�ngulo es escaleno y");
						break;
					case 1: 
						System.out.print("El tri�ngulo es is�sceles y");
						break;
					case 2: 
						System.out.print("El tri�ngulo es equil�tero y");
						break;
					}
					for (int i=0;i<3;i++) {
						
						if(angulos[i]==90) {
							esRectangulo=true;
						}
						if(angulos[i]>90) {
							esObtuso=true;
						}
					}
					if(esRectangulo) {
						System.out.println(" rect�ngulo");
						
					}else if(esObtuso){
						System.out.println(" obtus�ngulo");
					}else
						System.out.println(" acut�ngulo");
				}
			}
		}
		return t;
	}
}
