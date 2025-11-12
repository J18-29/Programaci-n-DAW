package Prueba;

public class Cuenta {
    String numeroCuenta;
    double saldo;
    Persona cliente;

    public Cuenta(){

    }
    public Cuenta(String numeroCuenta,double saldo,Persona p){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
        this.cliente=p;
    }

    //get set

    public void imprimeCuenta(){
        
    }
}
