package Ordenacao;

import Menu.Menu;
import NomesNotas.NomesNotas;

/**
 *
 * @author Douglas
 */
public class OdenacaoInsercao {

    public void ordenacao() {
        NomesNotas NomesNotas = new NomesNotas();
        String[][] matriz = NomesNotas.Matriz();

        int vAux;
        int vTemp;
        String vTroca;
        String nome;
        for (vAux = 1; vAux < 30; vAux++) 
        {
            vTemp = vAux; 
            
        while (Float.parseFloat((matriz[1][vTemp])) > (Float.parseFloat((matriz[1][vTemp - 1])))){ 
                vTroca = matriz[1][vTemp];
                nome = matriz[0][vTemp];
                matriz[1][vTemp] = matriz[1][vTemp - 1];
                matriz[0][vTemp] = matriz[0][vTemp - 1];
                matriz[1][vTemp - 1] = vTroca;
                matriz[0][vTemp - 1] = nome;
                vTemp--; 
                if (vTemp == 0) 
                {
                    break;
                }
            }
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(matriz[0][i] + ": " + matriz[1][i]);
        }
        Menu menu = new Menu();
        menu.opcoes();
    }
}
