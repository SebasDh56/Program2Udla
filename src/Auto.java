public class Auto {
    String color;
    int puerta;
    String placa;
    int numLlantas;
    Motor motor;

    double velocidad (){
        double velocidadKh=0;
        velocidadKh=motor.fuerza()*numLlantas;
        return velocidadKh;
    }

}

