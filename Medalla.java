package Olimpiadas;

public class Medalla {

    public static final int ORO = 1;
    public static final int PLATA = 2;
    public static final int BRONCE = 3;
    private int tipo;
    private String disciplina;

    public Medalla(int tipo, String disciplina) {
        if (tipo < ORO || tipo > BRONCE) {
            this.tipo = BRONCE;
        } else {
            this.tipo = tipo;
        }
        
        this.disciplina = disciplina.toUpperCase();
    }

    public String getTipoString(){
        String cad = "";
        switch (this.tipo) {
            case ORO -> cad = "ORO";
            case PLATA -> cad = "PLATA";
            case BRONCE -> cad = "BRONCE";
        }
        return cad;
    }

    @Override
    public String toString() {
        return getTipoString() + " en " + this.disciplina + "\n";
    }
}
