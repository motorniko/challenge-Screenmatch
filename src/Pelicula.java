public class Pelicula {
    String nombre;
    int frchaEstreno;
    int duracionEnMinutos;
    boolean includoEnElPlan;
   private double evaluacion;
   private int totalEvaluaciones;

   int getTotalEvaluaciones(){
       return totalEvaluaciones;
   }

    void muestraFichaTecnica() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Estreno: " + frchaEstreno);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
        System.out.println("Incluido en el plan: " + includoEnElPlan);
    }

    void evaluaPelicula(double nota) {
        evaluacion = evaluacion + nota;
        totalEvaluaciones++;
    }

    double promedioEvaluaciones() {
        return evaluacion / totalEvaluaciones;
    }
}
