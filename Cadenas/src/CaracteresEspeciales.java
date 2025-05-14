public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres Especiales
        // \n imprime un salto de linea
        var cadena1 = "Hola \nMundo";
        System.out.println("cadena1 = " + cadena1);

        // \t agrega tabulacion
        var cadena2 = "\tHola \tMundo";
        System.out.println("cadena2 = " + cadena2);
        
        var cadena3 = "Hola \\ Mundo";
        System.out.println("cadena3 = " + cadena3);
    }
}
