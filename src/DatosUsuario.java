
import java.util.Scanner;

import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce tu correo electronico: ");
        String correo = sc.nextLine();
        boolean emailValido = ProcesadorTexto.esEmailValido(correo);

        String nombreNormalizado = String.valueOf(nombre.charAt(0)).toUpperCase() + (nombre.substring(1)).toLowerCase();

        if (emailValido) {
            Usuario usuario = new Usuario(nombreNormalizado, edad, correo);
            usuario.mostrarInformacion();
            if (edad > 18) {
                System.out.println("Tienes edad para conducir");
            } else {
                System.out.println("No tienes edad para conducir");
            }
        } else {
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido");

        }
        if (edad < 0 && edad > 120) {
            System.out.println("error");
        }
        int NOMBRE_LONGITUD = nombre.length();
        if (NOMBRE_LONGITUD < 2 || NOMBRE_LONGITUD > 20) {
            System.out.println("error");
        }
        sc.close();
    }
}
