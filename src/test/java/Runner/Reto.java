package Runner;

public class Reto {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Leyder", 100); //Objeto con nueva cuenta, saldo inicial $100
        cuenta.depositar(50); //Deposito $50
        cuenta.retirar(30); //Retirar 30
        System.out.println("Saldo actual de la cuenta: $" + cuenta.getSaldo());
    }
}
class CuentaBancaria {
    private String titular;
    private double saldo;
    public CuentaBancaria(String t, double s) {
        titular = t;
        saldo = s;
    }
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}




