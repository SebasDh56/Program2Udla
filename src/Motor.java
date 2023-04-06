public class Motor {
    int numValvulas; // variables//
    String combustible; // Variables global //
    int cilindraje;


    public Motor() {

    }

    public Motor(int numValvulas, String combustible, int cilindraje) {
        this.numValvulas = numValvulas;
        this.combustible = combustible;
        this.cilindraje = cilindraje;
    }

    double fuerza(){
      double fuerzaNm=0;                           //variables dentro del metodo es una varible local //
       if (combustible.equals("gasolina")) {
           fuerzaNm=cilindraje*numValvulas;
    }else if (combustible.equals("diesel")){
           fuerzaNm=cilindraje*numValvulas*1.5;


       }
    }}