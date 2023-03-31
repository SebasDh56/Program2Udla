public class Motor {
    int numValvulas; // variables//
    String combustible; // Variables global //
    int cilindraje;

    double fuerza(){
      double fuerzaNm=0; //vaibles dentro del metodo es una varible local //
       if (combustible.equals("gasolina")) {
           fuerzaNm=cilindraje*numValvulas;
    }else if (combustible.equals("diesel")){
           fuerzaNm=cilindraje*numValvulas*1.5;


       }
}}