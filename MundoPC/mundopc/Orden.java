package tocahuevosCarlos.MundoPC.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 20;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];  // HACE REFERENCIA AL MAXIMO DE LA ORDEN
    }
    public void agregarComputadora (Computadora computadora){

        if (contadorComputadoras < MAX_COMPUTADORAS){

            this.computadoras [this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Máximo excedido, el límite es: " + MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){

        System.out.println("Su orden ha sido generada con el número " + this.idOrden);

        for (int i = 0; i<contadorComputadoras; i++){

            System.out.println(computadoras[i]);    //RECORRER ARRAY
        }
    }
}
