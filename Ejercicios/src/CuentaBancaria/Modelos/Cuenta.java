package CuentaBancaria.Modelos;

public class Cuenta {
    // Atributos
    private int numCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(int numCuenta, String titular, double saldoInicial) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para mostrar los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }

}

