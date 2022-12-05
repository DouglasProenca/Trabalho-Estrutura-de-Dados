package Ordenacao;

import Menu.Menu;
import NomesNotas.NomesNotas;

/**
 *
 * @author Douglas
 */
public class OrdenacaoTrocas {

    public void ordenacao() {
        NomesNotas NomesNotas = new NomesNotas();
        String[][] matriz = NomesNotas.Matriz();
        String k;
        String n;
        for (int i = 1; i < /*matriz.length*/30; i++) {
            for (int j = 0; j < 30 - i; j++) {
                if (Float.parseFloat((matriz[1][j])) > (Float.parseFloat((matriz[1][j + 1])))) {
                    k = matriz[1][j];
                    n = matriz[0][j];
                    matriz[1][j] = matriz[1][j + 1];
                    matriz[0][j] = matriz[0][j + 1];
                    matriz[1][j + 1] = k;
                    matriz[0][j + 1] = n;
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(matriz[0][i] +": "+ matriz[1][i]);
        }
        Menu menu = new Menu();
        menu.opcoes();
    }
}
