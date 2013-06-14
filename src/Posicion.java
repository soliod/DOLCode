public class Posicion{
	private static int ocupados;
	private Posicion arDer, der, abDer, abIzq, izq, arIzq;
	private boolean ocupado;

	public void setOcupado(boolean o){
		if(o != ocupado){
			if(o == true)
				ocupados++;
			else
				ocupados--;
			ocupado = o;
		}
	}

	public boolean isOcupado(){
		return ocupado;
	}

	public void setAbajoALaDerechaDe(Posicion a){
		arIzq = a;
	}

	public void setAbajoALaIzquierdaDe(Posicion b){
		arDer = b;
	}

	public void setArribaALaDerechaDe(Posicion a){
		abIzq = a;
	}

	public void setArribaALaIzquierdaDe(Posicion b){
		abDer = a;
	}

	public void setALaDerechaDe(Posicion a){
		izq = a;
	}
	
	public void setALaIzquieraDe(Posicion a){
		der = a;
	}

	public boolean isAbajoALaDerechaDe(Posicion a){
		return a.equal(arIzq);
	}

	public boolean isAbajoALaIzquierdaDe(Posicion a){
		return a.equal(arDer);
	}

	public boolean isArribaALaDerechaDe(Posicion a){
		return a.equal(abIzq);
	}

	public boolean isArribaALaIzquierdaDe(Posicion a){
		return a.equal(abDer);
	}

	public boolean isALaDerechaDe(Posicion a){
		return a.equal(izq);
	}

	public boolean isALaIzquieraDe(Posicion a){
		return a.equal(der);
	}

	public static int numOcupados(){
		return ocupados;
	}

	public Posicion(Posicion ade, Posicion de, Posicion abde, Posicion abiz, Posicion iz, Posicion aiz){
		setOcupado(true);
		setAbajoALaIzquierdaDe(ade);
		setALaIzquierdaDe(de);
		setArribaALaIzquierdaDe(abde);
		setArribaALaDerechaDe(abiz);
		setALaDerechaDe(iz);
		setAbajoALaDerechaDe(aiz);
	}

	public Posicion(){
		Posicion(null, null, null, null, null, null);	
	}
}
