package desafios;
public class Alumno {
    private String nombre;
    private String apellido;
    private int numeroExamen;
 
    private double promedio;

    // Constructor
    public Alumno(String nombre, String apellido, int numeroExamen, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroExamen = numeroExamen;
        
        this.promedio = promedio;
    }

    
	// Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroExamen() {
        return numeroExamen;
    }

  
    public double getPromedio() {
        return promedio;
    }

    // Método para calcular el promedio (en este caso, es igual a la nota)
   

    // Método para mostrar información del alumno
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        
    }
}
