import java.util.Scanner;

public class ManejoConsola {
    public ManejoConsola() {
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}