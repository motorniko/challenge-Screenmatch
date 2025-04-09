public class Principal {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        Pelicula pelicula1 = new Pelicula();

        pelicula1.setNombre("MAD-MAX");
        pelicula1.setFechaEstreno(2025);
        pelicula1.setDuracionEnMinutos(120);
        pelicula1.setIncluidoEnElPlan(true);

        pelicula1.muestraFichaTecnica();

        pelicula1.evaluaPelicula (8.5);
        pelicula1.evaluaPelicula(9.0);
        pelicula1.evaluaPelicula (8.5);
        System.out.println("Total de evaluaciones: " + pelicula1.getTotalEvaluaciones());
        System.out.println("Promedio de evaluaciones: " + pelicula1.promedioEvaluaciones());

        System.out.println("---------------------------------------");

        Pelicula pelicula2 = new Pelicula();

        pelicula2.setNombre("DEADPOOL");
        pelicula2.setFechaEstreno(1956);
        pelicula2.setDuracionEnMinutos(60);
        pelicula2.setIncluidoEnElPlan(false);

        pelicula2.muestraFichaTecnica();

        pelicula2.evaluaPelicula (10);
        pelicula2.evaluaPelicula(10);
        pelicula2.evaluaPelicula (10);
        pelicula2.evaluaPelicula(10);
        pelicula2.evaluaPelicula (10);
        pelicula2.evaluaPelicula(10);

        System.out.println("Total de evaluaciones: " + pelicula2.getTotalEvaluaciones());
        System.out.println("Promedio de evaluaciones: " + pelicula2.promedioEvaluaciones());

        System.out.println("---------------------------------------");

        Pelicula pelicula3 = new Pelicula();
        pelicula3.setNombre("AVENGERS");
        pelicula3.setFechaEstreno(2022);
        pelicula3.setDuracionEnMinutos(120);
        pelicula3.setIncluidoEnElPlan(true);

       pelicula3.muestraFichaTecnica();

        pelicula3.evaluaPelicula (7.5);
        pelicula3.evaluaPelicula(5.0);
        pelicula3.evaluaPelicula(8.0);
        pelicula3.evaluaPelicula(9.0);
        System.out.println("Total de evaluaciones: " + pelicula3.getTotalEvaluaciones());
        System.out.println("Promedio de evaluaciones: " + pelicula3.promedioEvaluaciones());

        System.out.println("---------------------------------------");

    }
}
