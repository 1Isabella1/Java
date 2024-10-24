public class DetalleProducto {
    public static void main(String[] args) {

        String nombreProducto = "Chocolate";
        float precio = 2.5f;
        int cantidadDisponible = 12;
        boolean isDisponible = true;

        //imprimir
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);

        //cambiar valores
        nombreProducto = "Chocolatina";
        precio = 2.2f;
        cantidadDisponible = 1;
        isDisponible = false;

        //imprimir
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);
    }


}
