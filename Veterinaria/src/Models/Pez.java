package Models;

public class Pez extends Animal{

    private String especie;

    public Pez(String nombre, Double peso) {
        super(nombre, peso);
    }

    public Pez(String nombre, Double peso, String especie) {
        super(nombre, peso);
        this.especie = especie;
    }

    @Override
    public void hacerRuido(String ruido) {
        if (this.especie == null) {
            System.out.println(" 🐠 Este pez no hace ruido o es desconocido");
            return;
        }
        System.out.println(this.getEspecie() + " 🐠  hace el siguiente ruido: " + ruido);
    }

    @Override
    public void moverse(String movimiento) {
        System.out.println(" 🐠 Este pez se está moviendo así: " + movimiento);
    }

    @Override
    public void comer(String comida) {
        System.out.println("Es pez está comiendo: " + comida);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
