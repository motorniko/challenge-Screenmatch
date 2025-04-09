public class Pelicula {

    private String nombre;
    private int fechaEstreno;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double evaluacion;
    private int totalEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getFechaEstreno() {
        return fechaEstreno;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Estreno: " + getFechaEstreno());
        System.out.println("Duración en minutos: " + duracionEnMinutos);
        System.out.println("Incluido en el plan: " + incluidoEnElPlan);
    }

    public void evaluaPelicula(double nota) {
        evaluacion = evaluacion + nota;
        totalEvaluaciones++;
    }

    public double promedioEvaluaciones() {
        if (totalEvaluaciones == 0) {
            return 0;
        }
        return evaluacion / totalEvaluaciones;
    }
}
