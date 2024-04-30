package Olimpiadas;

public class Persona {

    protected String nombre;
    protected String pais;
    protected int edad;

    public Persona(String nombre, String pais, int edad) {
        this.nombre = nombre;
        this.pais = pais.toUpperCase();
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0){
            System.out.println("La edad debe ser positiva.");
        } else {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        return this.nombre + " ("+ this.pais + ") - " + this.edad + " años";
    }

}
