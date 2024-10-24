public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";

        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recupera el caracter 'H'
        System.out.println("primerCaracter = " + primerCaracter);

        //Recueprar ultimo caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        //Recuperar 'M'
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);

    }

}
