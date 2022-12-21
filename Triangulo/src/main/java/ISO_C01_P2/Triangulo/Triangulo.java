package ISO_C01_P2.Triangulo;

public class Triangulo {
	public double lado1, lado2,lado3;
	public double angulo1, angulo2, angulo3;
	public Triangulo(double lado1, double lado2, double lado3, double angulo1, double angulo2, double angulo3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.angulo1 = angulo1;
		this.angulo2 = angulo2;
		this.angulo3 = angulo3;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getAngulo1() {
		return angulo1;
	}
	public void setAngulo1(double angulo1) {
		this.angulo1 = angulo1;
	}
	public double getAngulo2() {
		return angulo2;
	}
	public void setAngulo2(double angulo2) {
		this.angulo2 = angulo2;
	}
	public double getAngulo3() {
		return angulo3;
	}
	public void setAngulo3(double angulo3) {
		this.angulo3 = angulo3;
	}
	
}
