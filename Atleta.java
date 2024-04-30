package Olimpiadas;

public class Atleta extends Persona implements Competidor {

    private String disciplinas;
    private Medalla[] medallas;
    private int contadorMedallas;

    public Atleta(String nombre, String pais, int edad, String disciplinas) {
        super(nombre, pais, edad);
        medallas = new Medalla[MAXMEDALLAS];
        this.disciplinas = disciplinas.toUpperCase();
        this.contadorMedallas = 0;
    }

    public void añadirMedalla(Medalla m) {
        if (contadorMedallas < MAXMEDALLAS) {
            medallas[contadorMedallas] = m;
            contadorMedallas++;

        } else {
            System.out.println("El atleta no puede recibir mas medallas.");
        }
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        String cad = "";
        int cbronce = 0, cplata = 0, coro = 0;

        for(int i = 0; i < this.contadorMedallas; i++) {
            String tipo = this.medallas[i].getTipoString();

            switch (tipo) {
                case "BRONCE" -> cbronce++;
                case "PLATA" -> cplata++;
                case "ORO" -> coro++;
            }

            cad += "   ---" + medallas[i].toString();
        }

        return "- ATLETA: " + super.toString() + "\n" + "  -- Disciplinas: " + this.getDisciplinas() + "\n" + "  -- Medallas:\n" + cad + "   --*Total Medallas: " + coro + " oro, " + cplata + " plata y " + cbronce + " bronce\n";
    }



}
