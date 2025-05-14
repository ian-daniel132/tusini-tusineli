public class variables
{
    public static void main (String[]args){
        int numero1 = 10;
        double numero2;
        numero2 = 3.14;
        float numero3;
        numero3 = 3.14168F;
        char caracter1 = 'A', caracter2 = 66;
        boolean opcion =true;
        long numero4;
        numero4 = 987654321L;
        byte numero5 =126;
        short numero6 =130;
         System.out.println(numero1);
         System.out.println(numero2);
         System.out.println(numero3);
         System.out.println(numero4);
         System.out.println(numero5);
         System.out.println(numero6);
         System.out.println(caracter1);
         System.out.println(caracter2);
         System.out.println(opcion);

        //variables de referencia 
        
        String mensaje, mensaje2;
        mensaje = "Esto es un mensaje";
        mensaje2 = """
                Este
                es
                un
                mensaje
                multilinea                
                """;
        System.out.println(mensaje);
        System.out.println(mensaje2);
        System.out.println(mensaje+" "+numero1);
        System.out.println(mensaje.toUpperCase());
        String numero1_String=Integer.toString(numero1);
        System.out.println(mensaje.concat(numero1_String));

        //variable  general

        var variable1=15;
        var variable2='F';
        var variable3=2.8754F;

        final var PI=3.14159;
        //PI 3.1416 no funciona

        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(PI);

    }


    @Override
    public String toString() {
        return "variables []";
    }}