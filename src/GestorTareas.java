import java.util.Scanner;

public class GestorTareas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================================
        // EJERCICIO 1: Bienvenida
        // ================================
        // Crea un método llamado que muestre un mensaje de bienvenida al programa.
        // No necesita devolver nada, solo imprimir por consola.

        // Tu código aquí ↓
        bienvenida("Usuario 1");

        // ================================
        // EJERCICIO 2: Duración total
        // ================================
        // Crea un método que reciba la duración (en minutos) de dos tareas
        // y devuelva el total de minutos.
        // Llama al método con 45 y 30 y muestra el resultado en consola.

        // Tu código aquí ↓
        System.out.println("introduce la duracion en minutos de las tareas");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int resultado = duracion(d1, d2);
        System.out.println(resultado);

        // ================================
        // EJERCICIO 3: Conversión de tiempo
        // ================================
        // Crea un método que reciba una cantidad de minutos
        // y muestre en pantalla cuántas horas y minutos son.
        // Ejemplo: 150 minutos → "Son 2 horas y 30 minutos".
        // No tiene que devolver nada.

        // Tu código aquí ↓
        tiempo(150);

        // ================================
        // EJERCICIO 4: Recordatorios
        // ================================
        // Crea un método que reciba el nombre de una tarea y una prioridad (1–3)
        // y muestre un mensaje como:
        // "📌 [Prioridad 2] Revisar correo".
        // Solo muestra el mensaje, no devuelve nada.

        // Tu código aquí ↓
        tarea(2);
        
        // ================================
        // EJERCICIO 5: Estado de tareas
        // ================================
        // Crea un método que reciba un valor booleano que indique si la tarea está completada.
        // Debe devolver un texto: "✅ Completada" o "⏳ Pendiente".
        // Muestra el resultado de llamar al método con ambos casos.

        // Tu código aquí ↓
        

        // ================================
        // EJERCICIO 6: Productividad
        // ================================
        // Crea un método que reciba el número total de tareas y las completadas
        // y devuelva el porcentaje de avance (por ejemplo, 70.0 si 7/10).
        // Muestra el resultado en consola.

        // Tu código aquí ↓
        

        // ================================
        // EJERCICIO 7: Sobrecarga
        // ================================
        // Crea dos métodos con el mismo nombre:
        // - uno sin parámetros, que muestre un mensaje genérico (ejemplo: "Hola crack";
        // - otro con parámetros (nombre de usuario, número de tareas completadas) "Hola {usuario} completaste {numero} de tareas"
        //   que muestre un resumen personalizado.
        // Llama a ambos desde main.

        // Tu código aquí ↓
        

        // ================================
        // EJERCICIO 8: Bonus - Planificación
        // ================================
        // Crea un método que reciba el nombre de una tarea y su duración en minutos,
        // y devuelva un texto con la planificación:
        // "La tarea [nombre] durará aproximadamente X horas y Y minutos."
        // Muestra el texto en pantalla.

        // Tu código aquí ↓
        
    }

    // Aquí debéis crear los métodos fuera del main ↓↓↓
    //Ejercicio 1:
    public static void bienvenida(String saludo) {
        
        System.out.println("hola " + saludo);
    }
    //Ejercicio 2:
    public static int duracion(int a, int b){

        return a+b;
    }
    //Ejercicio 3:
    public static void tiempo(int minutos){

   
        int horas = minutos/60;
        int resto = minutos%60;
        System.out.println(minutos + " minutos son " + horas + " horas y " + resto + " minutos");
    }
    //Ejercicio 4:
    public static void tarea(int Valor_Tarea) {
        Scanner sc = new Scanner(System.in);

        String prioridad1 = "ir al gym";
        String prioridad2 = "Revisar correo";
        String prioridad3 = "Salir a comprar";
        if (Valor_Tarea == 1) {
            System.out.println("[Prioridad 1] " + prioridad1);
        }
        if (Valor_Tarea == 2) {
            System.out.println("[Prioridad 2] " + prioridad2);
        }
        if (Valor_Tarea == 3) {
            System.out.println("[Prioridad 3] " + prioridad3);
        }
    }
}

