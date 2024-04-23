package Models;

public class Ave extends Animal {

    public Ave(String nombre, Double peso) {
        super(nombre, peso);
    }

    @Override
    public void hacerRuido(String ruido) {
        System.out.println(this.getNombre() + " 🐓 hace el siguiente ruido: " + ruido);
    }

    @Override
    public void comer(String comida) {
        System.out.println(this.getNombre() + " 🐓 está comiendo: " + comida);
    }

    @Override
    public void moverse(String movimiento) {
        System.out.println(this.getNombre() + " 🐓 se está moviendo así: " + movimiento);
    }
}
