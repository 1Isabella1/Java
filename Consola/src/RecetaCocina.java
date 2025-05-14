import java.util.Scanner;

public class RecetaCocina {
    public RecetaCocina() {
    }

    public static void main(String[] args) {
        System.out.println("** Recetas de cocina **");
        Scanner consola = new Scanner(System.in);
        System.out.print("Nombre de la receta: ");
        String nombreReceta = consola.nextLine();
        System.out.print("Ingredientes: ");
        String ingredientes = consola.nextLine();
        System.out.print("Tiempo de Preparación: ");
        int tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Nivel de dificultad (fácil, medio alto): ");
        String dificultad = consola.nextLine();
        System.out.println("Nombre Receta = " + nombreReceta);
        System.out.println("Ingredientes = " + ingredientes);
        System.out.println("Tiempo de Preparacion = " + tiempoPreparacion);
        System.out.println("Dificultad = " + dificultad);
    }
}