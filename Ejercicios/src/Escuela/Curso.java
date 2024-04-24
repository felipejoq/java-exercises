package Escuela;

import java.util.ArrayList;

public class Curso implements ICurso{
    private String materia;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;

    public Curso(String materia, Profesor profesor) {
        this.materia = materia;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }

    @Override
    public void inscribir(Alumno alumno) {
        alumnos.add(alumno);
    }

    @Override
    public void mostrarInfoCurso() {
        System.out.println("--------------------------");
        System.out.println("Información del curso");
        System.out.println("Materia: " + materia);
        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println("--- Alumnos ---");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre());
        }
        System.out.println("--------------------------");
    }

    @Override
    public void expulsar(Alumno alumno) {
        alumnos.remove(alumno);
        System.out.println("Alumno expulsado: " + alumno.getNombre());
    }

    @Override
    public void calificar(Alumno alumno, int calificacion) {
        System.out.println("Calificación de " + alumno.getNombre() + ": " + calificacion);
    }

    // Aquí pueden ir los getters y setters
    public String getMateria() {
        return materia;
    }
}
