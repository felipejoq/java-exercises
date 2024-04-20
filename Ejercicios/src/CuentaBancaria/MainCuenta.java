package CuentaBancaria;

import CuentaBancaria.Interfaces.FormaPago;
import CuentaBancaria.Modelos.*;

public class MainCuenta {
    public static void main(String[] args) {
        // Crear un objeto de cuenta
        Cuenta cuentaJohn = new Cuenta(35974, "John Doe", 2000.0);
        // Mostrar los datos de la cuenta de John Doe
        cuentaJohn.mostrarDatos();

        double montoCompra = 150.0;

        // Diferentes formas de pago
        FormaPago tarjeta = new FormaPagoTarjetACredito();
        FormaPago paypal = new FormaPagoPayPal();
        FormaPago efectivo = new FormaPagoEfectivo();

        // Realizar pagos utilizando polimorfismo
        tarjeta.procesarPago(montoCompra);
        paypal.procesarPago(montoCompra);
        efectivo.procesarPago(montoCompra);
    }
}
