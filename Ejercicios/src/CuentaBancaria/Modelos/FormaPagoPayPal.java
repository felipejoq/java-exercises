package CuentaBancaria.Modelos;

import CuentaBancaria.Interfaces.FormaPago;

public class FormaPagoPayPal implements FormaPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal por $" + monto);
    }
}
