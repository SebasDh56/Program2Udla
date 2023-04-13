public class Motor {
    private int numValvulas; // variables//
    private String combustible; // Variables global //
    private int cilindraje;
    private int serie;


    public Motor() {

    }

    public Motor(int numValvulas, String combustible, int cilindraje) {
        this.numValvulas = numValvulas;
        this.combustible = combustible;
        this.cilindraje = cilindraje;
    }

    public Motor(int serie) {
        this.serie = serie;
    }


    double fuerza() {
        double fuerzaNm = 0;                           //variables dentro del metodo es una varible local //
        if (combustible.equals("gasolina")) {
            fuerzaNm = cilindraje * numValvulas;
        } else // ASIAFA
            if (combustible.equals("diesel")) fuerzaNm = cilindraje * numValvulas * 1.5;

        return fuerzaNm;
    }

    public int getNumValvulas() {
        return numValvulas;
    }

    public void setNumValvulas(int numValvulas) {
        this.numValvulas = numValvulas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;

    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}



