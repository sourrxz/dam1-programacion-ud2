
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
        if (edad>18) {
            System.out.println("Tienes edad para conducir");
        } else{
            System.out.println("No tienes edad para conducir");
        }
        if (emailValido) {
            Usuario usuario = new Usuario(nombre, edad, correo);
            usuario.mostrarInformacion();
        }
        else{
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido");
        }
        sc.close();
    }
}
