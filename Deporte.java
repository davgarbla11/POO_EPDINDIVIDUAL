package Olimpiadas;

public class Deporte {

    private String nombre;
    private Evento[] eventos;
    private int contadorEventos;

    public Deporte(String nombre, int maxEventos) {
        this.nombre = nombre.toUpperCase();
        this.contadorEventos = 0;
        eventos = new Evento[maxEventos];
    }

    public void añadirEvento(Evento evento) {
        if(contadorEventos < eventos.length) {
            eventos[contadorEventos] = evento;
            contadorEventos++;
        } else {
            System.out.println("No se puede añadir mas eventos.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String cad = "";
        for(int i = 0; i < contadorEventos; i++) {
            cad += eventos[i].toString() + "\n";
        }

        return "- DEPORTE: " + getNombre() + " - Lista de Eventos:\n" + cad;
    }
}
