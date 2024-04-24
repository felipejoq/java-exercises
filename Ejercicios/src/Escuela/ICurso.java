package Escuela;

public interface ICurso {
    void inscribir(Alumno alumno);
    void mostrarInfoCurso();
    void expulsar(Alumno alumno);
    void calificar(Alumno alumno, int calificacion);
}
