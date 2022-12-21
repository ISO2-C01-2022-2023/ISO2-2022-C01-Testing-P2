package ISO_C01_P2.Triangulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testsgetters () {
	    Triangulo t = new Triangulo (1, 2, 2.5,0.3,0.7,179);
	    assertEquals(t.getLado1(), 1,0.001);
	    assertEquals(t.getLado2(), 2,0.001);
	    assertEquals(t.getLado3(), 2.5,0.001);
	    assertEquals(t.getAngulo1(), 0.3,0.001);
	    assertEquals(t.getAngulo2(), 0.7,0.001);
	    assertEquals(t.getAngulo3(), 179,0.001);
	 }
	@Test
	public void testsetter () {
	    Triangulo t = new Triangulo (1, 1, 1,60,60,60);
	    t.setLado1(1);
	    t.setLado2(2);
	    t.setLado3(2.5);
	    t.setAngulo1(0.3);
	    t.setAngulo2(0.7);
	    t.setAngulo3(179);
	    assertEquals(t.getLado1(), 1,0.001);
	    assertEquals(t.getLado2(), 2,0.001);
	    assertEquals(t.getLado3(), 2.5,0.001);
	    assertEquals(t.getAngulo1(), 0.3,0.001);
	    assertEquals(t.getAngulo2(), 0.7,0.001);
	    assertEquals(t.getAngulo3(), 179,0.001);
	 }

}
