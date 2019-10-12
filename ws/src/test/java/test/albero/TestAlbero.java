package test.albero;

import test.ramo.foglia.Foglia;

public class TestAlbero {
	public static void main(String[] args) {
		Albero albero = new Albero();
		Ramo ramo = new Ramo();
		Foglia foglia = new Foglia();
		
		int [] a = new int[3];
		
		
//		System.out.println("Radici dell'albero: "+albero.radici);
		System.out.println("Radici dell'albero: "+ramo.radici);
		System.out.println("Radici dell'albero: "+foglia.radici);
		System.out.println("Internodo: "+ramo.internodo);
		
		Albero[] alberos = new Albero[10];
		Ramo[] ramos = new Ramo[20];
		
		alberos = ramos;
		albero = ramo;
		
		ramo = (Ramo) albero;
		
		ramos = (Ramo[]) alberos;
		
	}
}
