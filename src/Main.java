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
    

//Prueba 1: Intentar asignar una edad invalida
System.out.println("\n[PRUEBA 1] Intento de asignar edad invalida (14 anios):");
oEmpleado.setEdad(14);

//Prueba 2: Intentar asignar un sueldo inferior al salario basico
System.out.println("\n[PRUEBA 2] Intento de asignar sueldo invalido ($200.00):");
oEmpleado.setSueldo(200);

//Prueba 3: Asignar valores validos 
System.out.println("\n[PRUEBA 3] Asignacion de valores validos:");
oEmpleado.setEdad(29);
oEmpleado.setSueldo(950);

//Mostrar la ficha final del empleado 
oEmpleado.imprimirFicha();

    System.out.println("=======================================================================");

    }
}
