package Escuela;

public class MainEscuela {
    public static void main(String[] args) {

        Profesor profesor = new Profesor("Cesar");

        Alumno pedro = new Alumno("Pedro", 20);
        Alumno leo = new Alumno("Leo", 20);
        Alumno alejandra = new Alumno("Alejandra", 20);
        Curso cursoJava = new Curso("Java", profesor);
        Curso cursoScript = new Curso("JavaScript", profesor);

        // Inscribiendo alumnos al curso de matemáticas
        cursoJava.inscribir(pedro);
        cursoJava.inscribir(leo);
        cursoJava.inscribir(alejandra);

        // Asignando curso al profesor
        profesor.agregarCurso(cursoJava);
        profesor.agregarCurso(cursoScript);
        profesor.mostrarCursos();

        // Entregando feedback a Pedro
        profesor.entregarFeedback(pedro, "Muy bien");

        // Mostrando información del curso de matemáticas
        cursoJava.mostrarInfoCurso();
    }
}
