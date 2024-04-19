package Models;

public class Gato extends Animal {

    public Gato(String nombre, Double peso) {
        super(nombre, peso);
    }

    @Override
    public void comer(String comida) {
        System.out.println( this.getNombre() +" esta comiendo: " + comida);
    }

    @Override
    public void dormir() {
        System.out.println(this.getNombre() + " esta haciendo tuto 🤫");
    }

    @Override
    public void emitirSonido(String ruido) {
    	if(ruido == null) {
    		ruido = "Miau!";
    	}
        System.out.println(this.getNombre() + " Hace: ");
        System.out.println(ruido + " 😻 " + ruido);
    }
}