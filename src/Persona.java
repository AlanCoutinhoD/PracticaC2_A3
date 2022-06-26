public class Persona {
    public static int dia;
    public static int mes;
    public static int anio;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Persona(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public static int getAnio() {return anio;}
    public static int getMes() {return mes;}
    public static int getDia() {return dia;}
}
