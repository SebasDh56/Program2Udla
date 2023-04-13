import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Propietario propietario =new Propietario("Sebastian",172886321, "Cayambe");
        Motor motor=new Motor(3,"Diesel",1000 ) ;
        Auto auto=new Auto("Rojo",5,"TAA 1142");

        Propietario propietario2 =new Propietario("Jose",100486321, "Quito");
        Auto auto2=new Auto("Azul",4,"PAA 4722");
        Motor motor2=new Motor(12,"Gasolina",1600 ) ;

        Propietario propietario3 =new Propietario("Sebastian",2117224321, "Ibarra");
        Auto auto3=new Auto("Negro",3,"CAH 0510");
        Motor motor3=new Motor(16,"Diesel",2000 ) ;

        //Ralizar cambios
        auto.setColor("Blanco");
        String coloraux=auto2.getColor(); // cambiar el valor color en el auto 2

        Propietario propietario4 =new Propietario("Luis",2147104713,"Latacunga" );
        Motor motor4 =new Motor(34244243);
        Auto auto4 =new Auto(motor4,propietario4);

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese la marcA del AUTO ");
        String marca= sc.next();
        System.out.println("Ingrese año ");
        int modelo = sc.nextInt();
        System.out.println("Ingrese que combustible usa el AUTO ");
        String combustible= sc.next();
        System.out.println("ingrese el cilindreje ");
        int cilindraje= sc.nextInt();
        System.out.println("ingrese la placa ");
        String placa= sc.next();
        System.out.println("ingrese el Propiestario ");
        String Propietario= sc.next();


        System.out.println("***************************** ");



       }
    }