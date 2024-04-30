package Olimpiadas;

public class Evento {

    private String nombre;
    private String fecha;
    private Atleta[] atletas;
    private int contadorAtletas;

    public Evento(String nombre, String fecha, int maxAtletas) {
        this.nombre = nombre;
        setFecha(fecha);
        this.contadorAtletas = 0;
        atletas = new Atleta[maxAtletas];
    }

    public void añadirAtleta(Atleta atleta) {
        if(contadorAtletas < atletas.length) {
            atletas[contadorAtletas] = atleta;
            contadorAtletas++;
        } else {
            System.out.println("No se pueden añadir mas atletas.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecha(String fecha) {
        char s1 = fecha.charAt(2);
        char s2 = fecha.charAt(5);

        if(fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
            System.out.println("La fecha debe tener el formato: DD/MM/YYYY");
            this.fecha = "01/01/1900";
        } else {
            this.fecha = fecha;
        }
    }

    @Override
    public String toString() {
        String cad = "";

        if(contadorAtletas == 0) {
            cad = "       <Aún no hay atletas registrados en este evento>";
        } else {
            for (int i = 0; i < contadorAtletas; i++) {
                cad += "   ---> " + atletas[i].nombre + " (" + atletas[i].pais + ")\n";
            }
        }
        return "   -> EVENTO: " + this.getNombre() + " <" + this.fecha + ">\n" + cad;
    }
}
