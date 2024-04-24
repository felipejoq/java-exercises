package Escuela;

import java.util.ArrayList;

public class Profesor extends Persona{

    private ArrayList<Curso> cursos;

    public Profesor(String nombre) {
        super(nombre);
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }

    public void entregarFeedback(Alumno alumno, String feedback){
        System.out.println("Feedback entregado a " + alumno.getNombre() + ": " + feedback);
    }

    public void mostrarCursos(){
        System.out.println("----------------------");
        System.out.println("Cursos asignados a " + getNombre());
        for (int i = 1; i <= cursos.size(); i++) {
            System.out.println(i + " Curso: " + cursos.get(i - 1).getMateria());
        }
        System.out.println("----------------------");
    }
}
