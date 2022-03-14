/*Leer el valor de la cena y luego imprimir el valor neto a pagar sabiendo
que la propina es voluntaria y si se paga es del 10% sobre el valor básico
y que además se debe pagar el IVA. Se debe leer además la cantidad de personas.
Utilizar clases y funciones para (utilizar para cada uno un método)
 */
package pkg3.cena;

import java.util.Scanner;

public class Cena {

    public static void main(String[] args) {
        int OpcionPropina = 0;
        System.out.println("El costo del menu ejecutivo es de 15.000");
        System.out.println("Cuantas personas van a cenar?");
        int CantPersonas = new Scanner(System.in).nextInt();
        Pago objPago = new Pago(CantPersonas);
        System.out.println("El costo total mas iva es de: " + (objPago.ValorMenu() + objPago.IVA()));
        System.out.println("Deseas añadir la propina?");
        System.out.println("1.Si");
        System.out.println("2.No");
        OpcionPropina = new Scanner(System.in).nextInt();
        objPago.Propina(OpcionPropina);
        System.out.println("El pago total es de: " + objPago.ValorNeto(OpcionPropina));
    }

}
