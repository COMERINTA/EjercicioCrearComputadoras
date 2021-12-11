package tocahuevosCarlos.MundoPC.mundopc;

public class Raton extends DispositivoEntrada{

    private final int idRaton;
    private static int contadorRatones;

    public Raton (String tipoEntrada, String marca){

        super(tipoEntrada,marca);  //SE ESTA LLAMANDO AL PADRE
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Con número de Raton " +
                " " + idRaton + " " + super.toString()  ;
    }
}
