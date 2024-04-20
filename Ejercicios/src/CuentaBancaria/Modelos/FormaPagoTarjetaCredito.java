package CuentaBancaria.Modelos;

import CuentaBancaria.Interfaces.FormaPago;

public class FormaPagoTarjetACredito implements FormaPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de crédito por $" + monto);
    }
}
