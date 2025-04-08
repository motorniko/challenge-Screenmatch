public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula();
        pelicula1.nombre="Mad Max";
        pelicula1.frchaEstreno=2015;
        pelicula1.duracionEnMinutos=120;
        pelicula1.includoEnElPlan = true;

        System.out.println("Nombre: " + pelicula1.nombre);
        System.out.println("Fecha de Estreno: " + pelicula1.frchaEstreno);
        System.out.println("Duracion en minutos: " + pelicula1.duracionEnMinutos);
        System.out.println("Incluido en el plan: " + pelicula1.includoEnElPlan);

        Pelicula pelicula2 = new Pelicula();
        pelicula2.nombre="Deadpool";
        pelicula2.frchaEstreno=2016;
        pelicula2.duracionEnMinutos=120;
        pelicula2.includoEnElPlan = false;
        System.out.println("Nombre: " + pelicula2.nombre);
        System.out.println("Fecha de Estreno: " + pelicula2.frchaEstreno);
        System.out.println("Duracion en minutos: " + pelicula2.duracionEnMinutos);
        System.out.println("Incluido en el plan: " + pelicula2.includoEnElPlan);

        Pelicula pelicula3 = new Pelicula();
        pelicula3.nombre="Avengers";
        pelicula3.frchaEstreno=2018;
        pelicula3.duracionEnMinutos=120;
        pelicula3.includoEnElPlan = true;
        System.out.println("Nombre: " + pelicula3.nombre);
        System.out.println("Fecha de Estreno: " + pelicula3.frchaEstreno);
        System.out.println("Duracion en minutos: " + pelicula3.duracionEnMinutos);
        System.out.println("Incluido en el plan: " + pelicula3.includoEnElPlan);
    }
}
