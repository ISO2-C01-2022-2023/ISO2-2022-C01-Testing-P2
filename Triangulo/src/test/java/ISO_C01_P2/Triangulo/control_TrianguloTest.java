package ISO_C01_P2.Triangulo;

import static org.junit.Assert.*;
import org.junit.*;

public class control_TrianguloTest {

	@Test
	public void testSaberTipo1() {
		String lados[]={"-150000","-1","0"};
		String angulos[]={"-150000","-1","0"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNull(t);
	}
	@Test
	public void testSaberTipo2() {
		String lados[]={"-150000","-1","0"};
		String angulos[]={"179","0.7","0.3"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNull(t);
	}
	@Test
	public void testSaberTipo3() {
		String lados[]={"1","2","200"};
		String angulos[]={"-150000","-1","0"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNull(t);
	}
	@Test
	public void testSaberTipo4() {
		String lados[]={"1","1","1"};
		String angulos[]={"179","180","181"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNull(t);
	}
	@Test
	public void testSaberTipo5() {
		String lados[]={"1","2","1"};
		String angulos[]={"180","181","150000"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNull(t);
	}
	@Test
	public void testSaberTipo6() {
		String lados[]={"2","1","2.5"};
		String angulos[]={"60","60","60"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNull(t);
	}
	@Test
	public void testSaberTipo7() {
		String lados[]={"2","1","2.5"};
		String angulos[]={"0.3","0.7","179"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNotNull(t);
	}
	@Test
	public void testSaberTipo8() {
		String lados[]={"2","2","2.5"};
		String angulos[]={"0.5","0.5","179"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNotNull(t);
	}
	@Test
	public void testSaberTipo9() {
		String lados[]={"1","2","2.5"};
		String angulos[]={"179","0.7","0.3"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNotNull(t);
	}
	@Test
	public void testSaberTipo10() {
		String lados[]={"1","1","1"};
		String angulos[]={"60","60","60"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNotNull(t);
	}
	@Test
	public void testSaberTipo11() {
		String lados[]={"2","2","2.5"};
		String angulos[]={"90","45","45"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNotNull(t);
	}
	@Test
	public void testSaberTipo12() {
		String lados[]={"a","-1","0"};
		String angulos[]={"-150000","-1","0"};
		Triangulo t=null;
		t = control_Triangulo.saberTipo(lados,angulos);
		assertNull(t);
	}
}
