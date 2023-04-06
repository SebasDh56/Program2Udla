public class Auto {
    private String color;
    private int puerta;                  // ATRIBUTO
    private String placa;
    private int numLlantas;
    private Motor motor;
    private String modelo;
    private Propietario propietario;

    public Auto(){   //contructor sin  parametros //
    }
    public Auto(String color, int puerta,String placa,int numLlantas,Motor motor,String modelo,Propietario propietario){
        this.color=color;
        this.puerta=puerta;
        this.placa=placa;
        this.modelo=modelo;
        this.numLlantas=numLlantas;
        this.motor=motor;
        this.propietario=propietario; // contructor con parametros//

    }

    public Auto(String color, int puerta, String placa) {  // contructor con parametros//
        this.color = color;
        this.puerta = puerta;
        this.placa = placa;
    }

    double velocidad (){
        double velocidadKh=0;
        velocidadKh=motor.fuerza()*numLlantas;
        return velocidadKh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}

