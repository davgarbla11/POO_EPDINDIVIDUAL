package Olimpiadas;

public class ClaseDebug {

    private String nombreClase;
    private boolean deseaImprimir;
    private String nombreObjeto;

    boolean isDeseaImprimir;

    public ClaseDebug(String nombreClase, boolean deseaImprimir) {
        this.nombreClase = nombreClase;
        this.deseaImprimir = deseaImprimir;
    }

    public void comprobarImprimir() {
        isDeseaImprimir = deseaImprimir;
    }

    public void imprimirCreacionObjeto() {
        System.out.println("DEBUG: Clase " + nombreClase + " esta intentando crear un objeto.");
    }

    public void imprimirExitoObjeto() {
        System.out.println("DEBUG: Clase " + nombreClase + " ha creado un objeto exitosamente.");
    }

    public void imprimirErrorObjeto() {
        System.out.println("DEBUG: Clase " + nombreClase + " no ha podido crear un objeto.");
        System.out.println("DEBUG: Error: " + Exception.class);
        

    }

}
