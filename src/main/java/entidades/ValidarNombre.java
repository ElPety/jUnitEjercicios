package entidades;

public class ValidarNombre {

    public void validarNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }

        if (nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }

        System.out.println("Nombre valido: " + nombre);
    }
}
