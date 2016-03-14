package pis2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class PolinomiosTest {

	@Test
	public void testSumaIguales()
	{
		
		ArrayList<Integer> uno = new ArrayList<Integer>();
		ArrayList<Integer> dos = new ArrayList<Integer>();
		ArrayList<Integer> solucion = new ArrayList<Integer>();
		ArrayList<Integer> solucion1 = new ArrayList<Integer>();
		
		uno.add(1);
		uno.add(2);
		uno.add(3);
		
		dos.add(1);
		dos.add(2);
		dos.add(3);
		
		solucion.add(2);
		solucion.add(4);
		solucion.add(6);
		
		Polinomio poli= new Polinomio();
		solucion1=poli.suma(uno, dos);
		assertEquals(solucion,solucion1);
	}
	
	@Test
	public void testSumaPrimeroMayor()
	{
		ArrayList<Integer> uno = new ArrayList<Integer>();
		ArrayList<Integer> dos = new ArrayList<Integer>();
		ArrayList<Integer> solucion = new ArrayList<Integer>();
		ArrayList<Integer> solucion1 = new ArrayList<Integer>();
		
		uno.add(1);
		uno.add(2);
		uno.add(3);
		
		dos.add(1);
		dos.add(2);
		
		solucion.add(2);
		solucion.add(4);
		solucion.add(3);
		
		Polinomio poli= new Polinomio();
		solucion1=poli.suma(uno, dos);
		assertEquals(solucion,solucion1);
	}
	
	@Test
	public void testSumaSegundoMayor()
	{
		ArrayList<Integer> uno = new ArrayList<Integer>();
		ArrayList<Integer> dos = new ArrayList<Integer>();
		ArrayList<Integer> solucion = new ArrayList<Integer>();
		ArrayList<Integer> solucion1 = new ArrayList<Integer>();
				
		uno.add(1);
		uno.add(2);
				
		dos.add(1);
		dos.add(2);
		uno.add(3);
		
		solucion.add(2);
		solucion.add(4);
		solucion.add(3);
		
		Polinomio poli= new Polinomio();
		solucion1=poli.suma(uno, dos);
		assertEquals(solucion,solucion1);
	}
	
	@Test
	public void testProductoIguales(){
		
		ArrayList<Integer> uno = new ArrayList<>();
		ArrayList<Integer> dos = new ArrayList<Integer>();
		ArrayList<Integer> solucion = new ArrayList<Integer>();
		ArrayList<Integer> solucion1 = new ArrayList<Integer>();
		
		uno.add(1);
		uno.add(2);
		uno.add(3);
		
		dos.add(1);
		dos.add(2);
		dos.add(3);
		
		solucion.add(1);
		solucion.add(4);
		solucion.add(10);
		solucion.add(12);
		solucion.add(9);
		
		Polinomio poli = new Polinomio();
		solucion1 = poli.product(uno, dos);
		assertEquals(solucion, solucion1);
	}
}
