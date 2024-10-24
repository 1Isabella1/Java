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
    }
}
