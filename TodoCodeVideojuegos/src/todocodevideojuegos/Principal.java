package todocodevideojuegos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos David Pérez Dóniz
 */
public class Principal {

    public static void main(String[] args) {

        List<Videojuegos> lista = new ArrayList<Videojuegos>();

        Videojuegos juego1 = new Videojuegos(1, "Mario Bros", "Nintendo 64", 1, "Arcade");
        Videojuegos juego2 = new Videojuegos(2, "Mario Karts", "PS4", 4, "Carreras");
        Videojuegos juego3 = new Videojuegos(3, "Fifa", "PS5", 4, "Deportes");
        Videojuegos juego4 = new Videojuegos(4, "PCM", "PC", 1, "Estrategia");
        Videojuegos juego5 = new Videojuegos(5, "F1", "XBOX", 2, "Carreras");

        lista.add(juego1);
        lista.add(juego2);
        lista.add(juego3);
        lista.add(juego4);
        lista.add(juego5);

        for (Videojuegos juego : lista) {

            System.out.println("Titulo: " + juego.getTitulo() + ", Consola: " + juego.getConsola() + ", Numero de jugadores: " + juego.getCantidadJugadores());
        }
        
        juego3.setTitulo("PES");
        juego3.setCantidadJugadores(1);
        juego2.setTitulo("Moto GP");
        juego2.setCantidadJugadores(1);

        System.out.println("\nListado tras los cambios realizados\n");
        for (Videojuegos juego : lista) {

            System.out.println("Titulo: " + juego.getTitulo() + ", Consola: " + juego.getConsola() + ", Numero de jugadores: " + juego.getCantidadJugadores());
        }
        
         for (Videojuegos juego : lista) {
        
            if (juego.getConsola().equals("Nintendo 64")) {
                System.out.println("\nJuegos de la consola Nintendo 64\n");
                System.out.println("Titulo: " + juego.getTitulo() + ", Consola: " + juego.getConsola() + ", Numero de jugadores: " + juego.getCantidadJugadores());
         
            }
        }
    }

}
