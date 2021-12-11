package tocahuevosCarlos.MundoPC;

import tocahuevosCarlos.MundoPC.mundopc.*;


public class MundoPc {
    public static void main(String[] args) {

        Raton raton1 = new Raton("usb","razer");
        Teclado teclado1 = new Teclado("usb", "razer");
        Monitor monitor1 = new Monitor ("sony", 27);
        Computadora computadora1 = new Computadora("Clonico",monitor1,raton1,teclado1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();



    }
}
