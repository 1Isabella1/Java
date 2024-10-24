public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de cadenas
        var cadena1 = "Java"; //cadena 1 será el nombre que apunta auna referencia o espacio en memoria
        var cadena2 = "Java"; //Para optimizar, java agrega a cadena2 la misma referencia
        var cadena3 = new String("Java"); //Por la estructura con la que se crea el objeto, se agrega un nuevo espacio en memoria
        boolean comp1 = cadena1 == cadena2;
        boolean comp2 = cadena1 == cadena3;

        System.out.println("cadena 1 y cadena 2 apuntan a la misma referencia: " + comp1);
        System.out.println("cadena 1 y cadena 3 apuntan a la misma referencia: " + comp2);

        //Comparar contenido de las cadenas
        var comp3 = cadena1.equals(cadena3);
        System.out.println("cadena 1 y cadena 3 tienen el mismo contenido: " + comp3);
    }
}