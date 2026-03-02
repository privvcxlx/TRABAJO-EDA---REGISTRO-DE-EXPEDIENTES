package UTIL;

public class Validacion {
    public static boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().equals("");
    }

    public static boolean esDniValido(String dni) {
        return dni != null && dni.matches("\\d{8}");
    }

    public static boolean esCorreoValido(String correo) {
        return correo != null && correo.contains("@") && correo.contains(".");
    }

    public static boolean esTelefonoValido(String telefono) {
        return telefono != null && telefono.matches("\\d{9}");
    }
}
