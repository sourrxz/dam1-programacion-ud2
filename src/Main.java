import utilidades.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        // System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        System.out.println(cuenta.saldo);

        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().

        // Tu código aquí ↓
        cuenta.depositar(100);
        cuenta.retirar(30);
        System.out.println(cuenta.getSaldo());

        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        cuenta.registrarOperacion("hackeo", 999);

        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.
    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: Debido a que el atributo esta marcado como privado

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y
// getSaldo()?
// Respuesta: ya que todos esos metodos estan marcados como publicos

// Ejercicio 3: ¿qué significa el error al intentar llamar a
// registrarOperacion()?
// Respuesta: el error significa que el atributo es privado, por lo cual no
// permite su uso

// Ejercicio 4:
// - ¿Qué ventajas tiene que saldo sea private?
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta: al marcar saldo como privado, podemos proteger su
// confidencialidad, haciendo q no cualquiera pueda acceder a el, si saldo fuese
// publico, cualquiera podria acceder a el, ya que se declaro como privado en la
// creacion de la clase