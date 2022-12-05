package Ordenacao;

import Menu.Menu;
import NomesNotas.NomesNotas;

/**
 *
 * @author Douglas
 */
public class OrdenacaoSelecao {

    public void ordenacao() {
        NomesNotas NomesNotas = new NomesNotas();
        String[][] matriz = NomesNotas.Matriz();
        String nome;
        
        for (int fixo = 0; fixo < 30 - 1;
                fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < 30; i++) {
                if (Float.parseFloat(matriz[1][i]) < Float.parseFloat(matriz[1][menor])) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                String t = matriz[1][fixo];
                nome = matriz[0][fixo];
                matriz[1][fixo] = matriz[1][menor];
                matriz[0][fixo] = matriz[0][menor];
                matriz[1][menor] = t;
                matriz[0][menor] = nome;
            }
        }
        for (int z = 0; z < 30; z++) {
            System.out.println(matriz[0][z] + ": " + matriz[1][z]);
        }
        Menu menu = new Menu();
        menu.opcoes();
    }
}
