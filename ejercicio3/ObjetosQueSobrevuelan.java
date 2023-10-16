package ejercicio3;

public class ObjetosQueSobrevuelan implements IVolador{

	 String nombre;
	 boolean cumpleContrato;


	public ObjetosQueSobrevuelan(String nombre, boolean cumpleContrato) {
		
		this.nombre =nombre;
		this.cumpleContrato = cumpleContrato;
	}
	
	
	





	public void aterrizar() {
		System.out.println( nombre + "puede aterrizar en la Pista 1.");
		
	}




	public void setCumpleContrato(boolean cumpleContrato) {
		this.cumpleContrato = cumpleContrato;
	}
	public boolean autorizacion() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean cumpleContrato() {
		// TODO Auto-generated method stub
		return cumpleContrato;
	}

}
