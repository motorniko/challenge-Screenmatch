public class Principal {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        Pelicula pelicula1 = new Pelicula();
        pelicula1.nombre="Mad Max";
        pelicula1.frchaEstreno=2015;
        pelicula1.duracionEnMinutos=120;
        pelicula1.includoEnElPlan = true;

        pelicula1.muestraFichaTecnica();

        pelicula1.evaluaPelicula (8.5);
        pelicula1.evaluaPelicula(9.0);
        pelicula1.evaluaPelicula (8.5);
        System.out.println("Total de evaluaciones: " + pelicula1.getTotalEvaluaciones());
        System.out.println("Promedio de evaluaciones: " + pelicula1.promedioEvaluaciones());

        System.out.println("---------------------------------------");

        Pelicula pelicula2 = new Pelicula();
        pelicula2.nombre="Deadpool";
        pelicula2.frchaEstreno=2016;
        pelicula2.duracionEnMinutos=120;
        pelicula2.includoEnElPlan = false;

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
        pelicula3.nombre="Avengers";
        pelicula3.frchaEstreno=2018;
        pelicula3.duracionEnMinutos=120;
        pelicula3.includoEnElPlan = true;

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
