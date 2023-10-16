package ejercicio3;
	
import java.util.ArrayList;
import java.util.List;

public class MainTorreDeControl{
		
	public static void main(String[] args) {
		List<IVolador> listaVoladores = new ArrayList<>();
				
	    listaVoladores.add(new ObjetosQueSobrevuelan("Avion",true));
	    listaVoladores.add(new ObjetosQueSobrevuelan("Barrilete",false));
	    
	    Operario operario = new Operario();
	    
	    for (IVolador volador : listaVoladores) {
			if (volador.cumpleContrato()) {
				volador.aterrizar();
			} else {
				System.out.println("Requiere autorizacion para aterrizar");
				boolean autorizacion = operario.autorizarAterrizaje(volador);
				if (autorizacion) {
					System.out
							.println(volador.getClass().getSimpleName() + " autorizado para aterrizar en la Pista 2.");
				} else {
					System.out.println("No es posible aterrizar " + volador.getClass().getSimpleName());
				}
			}

		}
			
		}
	
		
		
		
		
	}