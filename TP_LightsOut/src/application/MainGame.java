package application;

import java.util.List;

import javax.swing.SwingUtilities;

import model.Solver;
import model.Tablero;
import presenter.Presenter;
import view.View;

public class MainGame
{
    public MainGame()
    {
    	int tamanio = 3;
    	 //el tamanio del view debe ser igual que el tamanio del tablero
        View view = new View(tamanio);
        Tablero tablero = new Tablero(tamanio);
        new Presenter(view, tablero);
        System.out.print(Solver.hasSolution(tablero.getTablero()));
        System.out.println("\n"+tablero.toString());
 
    }
    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainGame();
            }
        });
    }
    
}
