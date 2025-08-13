//analisis
/* descripcion: la calculadora debera pedir descripcion al usuario 2 numeros
*  y con esos 2 numeros realizar suma,division,multiplicacion,division y modulo
*  entradas: 2, nunmero 1 y numero 2, ambos ingresados por el usuario
*salida : 5, una [pr cada resultado de la operacion aritmetica. 
*/

import java.util.Scanner;

public class ActividadDesarrollo {
        public static void main(String[] args) {

              final double PRECIO_MANZANA = 800;

              final double PRECIO_BANANO = 1000;



            

            Scanner entrada = new Scanner(System.in);

            double bolsillo, Cantidad, subtotal, descuento, PrecioFinal, dinero, Cantidad1, subtotal1, subtotal3;
                

            

            System.out.println("----- bienvenidos el precio es: banano 1000 -----");
            System.out.println(" el precio  es: manzana: 800");


            System.out.println("----- elija la cantidad del banano -----");
            Cantidad = entrada.nextDouble();
            subtotal = subtotalizar(PRECIO_BANANO, Cantidad);
            System.out.println("----- precio final del banano -----: " + subtotal);


            System.out.println("-----elija la cantidad de la manzana -----");
            Cantidad1 = entrada.nextDouble();
            subtotal1 = subtotalizarM(PRECIO_MANZANA, Cantidad1);
            System.out.println("----- precio final del la manzana es -----: " + subtotal1);

            System.out.println("----- cuanto tienes?-----: ");

            
            bolsillo = entrada.nextDouble();
            System.out.println("----- el dinero que ingresaste es ------: " + bolsillo);
            

            
            descuento = descontar(subtotal, subtotal1);
            subtotal3 = descuento*0.10;// descuento
            System.out.println("----- el iva del subtotal menos el 10% es ----- : " + subtotal3);
            


            System.out.println(" ----- el precio normal de los productos es----- : " + descuento);
            PrecioFinal = Precio_final(subtotal, subtotal3, subtotal1);
            System.out.println(" ----- el precio del subtotal mas el descuento  del 10%  ----- : " + PrecioFinal);

            dinero = dinero_final(bolsillo, PrecioFinal);
            if (bolsillo<PrecioFinal){
                System.out.println("----- el dinero es insuficiente debes -------"+ dinero);
            } else {
                System.out.println("----- gracias por su compra, te sobro -----: " + dinero);

            }



        

    }

   //clases relacionadas a operaciones  matematicas  
    public static double subtotalizar (double PRECIO_BANANO, double Cantidad){
        double subtotal = PRECIO_BANANO * Cantidad;
        return subtotal;
    }

    public static double subtotalizarM (double PRECIO_MANZANA, double Cantidad1){
        double subtotal1 = PRECIO_MANZANA * Cantidad1;
        return subtotal1;
    }

    public static double  Precio_final( double subtotal, double descuento, double subtotal1){
        double PrecioFinal = subtotal - descuento + subtotal1;
        return PrecioFinal;
    }

    public static double dinero_final( double bolsillo, double PrecioFinal){
        double dinero = bolsillo - PrecioFinal;
        return dinero;

    }
    public static double descontar(double subtotal, double subtotal1){
        double descuento = subtotal + subtotal1;
        return descuento;
    }


}