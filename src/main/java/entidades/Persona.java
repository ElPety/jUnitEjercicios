package entidades;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(int id, String nombre, String apellido, String dni){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        System.out.println("Persona Creada Correctamente");
    }

    public void leerDatos(){
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Apellido: " + this.apellido);
            System.out.println("DNI: " + this.dni);
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }



}
