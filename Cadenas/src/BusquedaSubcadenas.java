public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        //index of - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        //subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        //subcadena a buscar "Mundo" - devuelve la ultima aparicion de la cadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

    }
}
