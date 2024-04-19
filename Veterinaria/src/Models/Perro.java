package Models;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, Double peso, String raza) {
        super(nombre, peso);
        this.raza = raza;
    }

    @Override
    public void comer(String comida) {
        System.out.println(this.getNombre() + " esta comiendo: " + comida);
    }

    @Override
    public void dormir() {
        System.out.println(this.getNombre() + " esta haciendo tuto 🤫");
    }

    @Override
    public void emitirSonido(String ruido) {
    	if(ruido == null) {
    		ruido = "Guau!";
    	}
        System.out.println(this.getNombre() + " Hace: ");
        System.out.println(ruido + " 🐶 " + ruido);
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