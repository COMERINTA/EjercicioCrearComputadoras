package tocahuevosCarlos.MundoPC.mundopc;

public class Teclado extends DispositivoEntrada{

    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca){

        super(tipoEntrada,marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Con número de Teclado " +
                " " + idTeclado + " " + super.toString()  ;
    }
}
