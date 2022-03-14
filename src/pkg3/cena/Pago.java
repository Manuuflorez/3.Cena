/*Leer el valor de la cena y luego imprimir el valor neto a pagar sabiendo
que la propina es voluntaria y si se paga es del 10% sobre el valor básico
y que además se debe pagar el IVA. Se debe leer además la cantidad de personas.
Utilizar clases y funciones para (utilizar para cada uno un método)
 */
package pkg3.cena;

public class Pago {

    int CantPersonas;

    public Pago(int CantPersonas) {
        this.CantPersonas = CantPersonas;
    }

    public int ValorMenu() {
        int valorMenu = 15000 * this.CantPersonas;
        return valorMenu;
    }

    public int Propina(int OpcionPropina) {
        int propina = 0;

        if (OpcionPropina == 1) {
            propina = (ValorMenu() * 10) / 100;
        } else if (OpcionPropina == 2) {
            propina = 0;
        }
        return propina;
    }

    public int IVA() {
        int masIva = (ValorMenu() * 10) / 100;
        return masIva;
    }

    public int ValorNeto(int OpcionPropina) {
        int valorNeto = ValorMenu() + Propina(OpcionPropina) + IVA();
        return valorNeto;
    }
}
