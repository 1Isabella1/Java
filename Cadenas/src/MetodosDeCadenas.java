public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadena
        var cadena1 = "Hola mundo";

        //Obtener logitud
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //Convertir a minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = " Leo Reyes    ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
    }
}
