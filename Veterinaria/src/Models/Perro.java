package Models;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, Double peso, String raza) {
        super(nombre, peso);
        this.raza = raza;
    }

    @Override
    public void hacerRuido(String ruido) {
        if(ruido == null) {
            ruido = "Guau!";
        }
        System.out.println(this.getNombre() + " Hace: ");
        System.out.println(ruido + " 🐶 " + ruido);
    }

    @Override
    public void comer(String comida) {
        System.out.println(this.getNombre() + "🐶 esta comiendo: " + comida);
    }

    @Override
    public void moverse(String movimiento) {
        System.out.println(this.getNombre() + " 🐶 " + movimiento);
    }

    @Override
    public void dormir() {
        System.out.println(this.getNombre() + " 🐶 esta haciendo tuto 🤫");
    }

    public void mostrarDatos() {
        System.out.println("---------------------");
        System.out.println("El perro se llama: " + this.getNombre());
        System.out.println("El perro pesa: " + this.getPeso() + " kg");
        System.out.println("El perro es de raza: " + this.getRaza());
        System.out.println("---------------------");
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}