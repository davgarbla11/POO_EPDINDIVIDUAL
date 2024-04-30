package Olimpiadas;

public class SistemaOlimpiadas {

    private Atleta[] atletas;
    private Deporte[] deportes;
    private int contadorAtletas;
    private int contadorDeportes;

    public SistemaOlimpiadas(int maxAtletas, int maxDeportes) {
        this.contadorAtletas = 0;
        this.contadorDeportes = 0;

        atletas = new Atleta[maxAtletas];
        deportes = new Deporte[maxDeportes];
    }

    public void registrarAtleta(Atleta atleta) {
        if(contadorAtletas < atletas.length) {
            atletas[contadorAtletas] = atleta;
            contadorAtletas++;
        } else {
            System.out.println("No se pueden registrar mas atletas.");
        }
    }

    public void añadirDeporte(Deporte deporte) {
        if(contadorDeportes < deportes.length) {
            deportes[contadorDeportes] = deporte;
            contadorDeportes++;
        } else {
            System.out.println("No se puede añadir mas deportes.");
        }
    }

    public void mostrarSistema() {
        String cadenaAtletas = "";
        String cadenaDeportes = "";

        for(int i = 0; i < contadorAtletas; i++) {
            cadenaAtletas += atletas[i].toString() + "\n";
        }
        for( int i = 0; i < contadorDeportes; i++) {
            cadenaDeportes += deportes[i].toString() + "\n";
        }

        System.out.println("## SISTEMA OLIMPIADAS ##\n");
        System.out.println("** ATLETAS REGISTRADOS **\n");
        System.out.println(cadenaAtletas);
        System.out.println("** DEPORTES Y EVENTOS **\n");
        System.out.println(cadenaDeportes);
    }


}
