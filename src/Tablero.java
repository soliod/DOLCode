public class Tablero{
	Posicion l11, l12, l13, l14, l15,
		    l21, l22, l23, l24,
		       l31, l32, l33,
		         l41, l42,
		            l51;
	
	public Tablero(){
		l11 = new Posicion(null, l12, l21, null, null, null);
		l12 = new Posicion(null, l13, l22, l21, l11, null);
		l13 = new Posicion(null, l14, l23, l22, l12, null);
		l14 = new Posicion(null, l15, l24, l23, l13, null);
		l15 = new Posicion(null, null, null, l24, l14, null);
		l21 = new Posicion(l12, l22, l31, null, null, l11);
		l22 = new Posicion(l13, l23, l32, l31, l21, l12);
		l23 = new Posicion(l14, l24, l33, l32, l22, l13);
		l24 = new Posicion(l15, null, null, l33, l23, l14);
		l31 = new Posicion(l22, l32, l41, null, null, l21);
		l32 = new Posicion(l23, l33, l42, l41, l31, l22);
		l33 = new Posicion(l24, null, null, l42, l32, l23);
		l41 = new Posicion(l32, l42, l51, null, null, l31);
		l42 = new Posicion(l33, null, null, l51, l41, l32);
		l51 = new Posicion(l42, null, null, null, null, l41);
	}

}
