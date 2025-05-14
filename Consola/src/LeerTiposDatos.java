import java.util.Scanner;

public class LeerTiposDatos {
    public LeerTiposDatos() {
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = consola.nextInt();
        System.out.println("edad = " + edad);
        System.out.print("Ingresa tu altura: ");
        double altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        consola.nextLine();
        System.out.print("Ingresa tu nombre: ");
        String nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        System.out.print("Proporciona un valor entero: ");
        int entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        System.out.print("Proporciona un valor flotante: ");
        float flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
    }
}