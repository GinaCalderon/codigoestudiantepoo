/**
 * ============================================================================
 * UNIVERSIDAD ESPAM MFL - CARRERA DE COMPUTACION / SOFTWARE
 * Asignatura: Programacion Orientada a Objetos (CDS-0201)
 * Docente: Luiggi Alexander Jalca Saltos
 * Clase 02: Taller Practico - Encapsulamiento, Invariantes y Modificadores
 * ============================================================================
 * PROGRAMA PRINCIPAL DE PRUEBA (Main.java) - CODIGO PARA ESTUDIANTES
 *
 * Como ejecutar en VS Code:
 *   1. Abre la carpeta 'codigoestudiante' en Visual Studio Code.
 *   2. Abre este archivo 'Main.java'.
 *   3. Presiona el boton 'Run Java' (triangulo de play) arriba a la derecha.
 *   4. O ejecuta en la terminal integrada:
 *        javac src/*.java
 *        java -cp src Main
 */
public class Main {

    public static void main(String[] args){
        Empleado oEmpleado = new Empleado("123456", "Luis", 38, 850, "Jefe");
        System.out.println("El nombre del empleado es: "+oEmpleado.getNombre());
        System.out.println("El sueldo del empleado es: "+oEmpleado.getSueldo());
        System.out.println("El cargo del empleado es: "+oEmpleado.getCargo());

        System.out.println("=======================================================================");
    }
}
