package ejercicio4;
import java.util.Iterator;


public class MainPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionCustom<Persona> personas = new CollectionCustom<>();

        personas.add(new Persona("Abi", 22));
        personas.addLast(new Persona("Meli", 29));
        personas.add(new Persona("Tito", 44));
        
        System.out.println("Size: " + personas.size());

        personas.remove(new Persona("Tito", 44));

        System.out.println("Tamaño antes de sacar a la ultima persona: " + personas.size());

        System.out.println("La colección está vacía? " + personas.isEmpty());
        
        System.out.println("---------------------------");
       
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

	

}
