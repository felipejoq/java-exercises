package CuentaBancaria.Modelos;

import CuentaBancaria.Interfaces.FormaPago;

public class FormaPagoEfectivo implements FormaPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago en efectivo por $" + monto);
    }
}
