public class TiposDatos {
    public static void main(String[] args) {
        //Enteros (valor default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        int tipoInt = 1234567890;
        System.out.println("tipoInt = " + tipoInt);
        short tipoShort = 12345;
        System.out.println("tipoShort = " + tipoShort);
        long tipoLong = 1234567890123456789L;
        System.out.println("tipoLong = " + tipoLong);

        //Tipo flotante (valor default es 0.0)
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1215;
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter (valor default '\u0000')
        char tipoChar = 'A'; // Caracter del juego Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);

        //Booleano (valor default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean= false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos object (valor default null)
        String nombre = null;
        System.out.println("nombre = " + nombre);
    }
}
