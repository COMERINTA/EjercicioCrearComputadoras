package tocahuevosCarlos.MundoPC.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor(){

        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor (String marca,double tamaño){

        this();                     // hace referencia al constructor vacio.
        this.marca = marca;
        this.tamaño = tamaño;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    @Override
    public String toString() {
        return "Con el Monitor número " +
                " " + idMonitor +
                ", de la marca '" + marca + '\'' +
                ", con tamaño " + tamaño ;
    }
}
