package com.aluracursos.screenmatch.modelos;

public class Titulo {

    private String nombre;
    private int fechaEstreno;
    private boolean incluidoEnElPlan;
    private double evaluacion;
    private int cantidadEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getFechaEstreno() {
        return fechaEstreno;
    }

    public int getcantidadEvaluaciones() {
        return cantidadEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Estreno: " + getFechaEstreno());
        System.out.println("Incluido en el plan: " + incluidoEnElPlan);
    }

    public void evaluaPelicula(double nota) {
        evaluacion = evaluacion + nota;
        cantidadEvaluaciones++;
    }

    public double cantidadEvaluaciones() {
        if (cantidadEvaluaciones == 0) {
            return 0;
        }
        return evaluacion / cantidadEvaluaciones;
    }

}
