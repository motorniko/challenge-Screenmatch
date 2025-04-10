import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {


        Pelicula madMax = new Pelicula();
        System.out.println("---------------------------------------");

        madMax.setNombre("MAD-MAX");
        madMax.setFechaEstreno(2025);
        madMax.setDuracionEnMinutos(120);
        madMax.setIncluidoEnElPlan(true);

        madMax.muestraFichaTecnica();

        madMax.evaluaPelicula (8.5);
        madMax.evaluaPelicula(9.0);
        madMax.evaluaPelicula (8.5);
        System.out.println("Total de evaluaciones: " + madMax.getTotalEvaluaciones());
        System.out.println("Promedio de evaluaciones: " + madMax.promedioEvaluaciones());
        System.out.println("---------------------------------------");


        Serie breakingBad = new Serie();
        System.out.println("---------------------------------------");

        breakingBad.setNombre("Breaking Bad");
        breakingBad.setFechaEstreno(2008);
        breakingBad.setTemporadas(5);
        breakingBad.setEspidios(62);
        breakingBad.setMinutosPorEpisodio(50);

        breakingBad.muestraFichaTecnica();

        System.out.println("Temporadas: " + breakingBad.getTemporadas());
        System.out.println("Episodios: " + breakingBad.getEspidios());
        System.out.println("Minutos por episodio: " + breakingBad.getMinutosPorEpisodio());
        breakingBad.evaluaPelicula(9.5);
        breakingBad.evaluaPelicula(9.0);
        breakingBad.evaluaPelicula(9.5);
        System.out.println("Total de evaluaciones: " + breakingBad.getTotalEvaluaciones());
        System.out.println("Promedio de evaluaciones: " + breakingBad.promedioEvaluaciones());
        System.out.println("---------------------------------------");



    }
}
