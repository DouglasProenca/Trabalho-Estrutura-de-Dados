package Ordenacao;

import NomesNotas.NomesNotas;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class PesquisaSequencial {

    public void pesquisa() {
        NomesNotas NomesNotas = new NomesNotas();
        String[][] matriz = NomesNotas.Matriz();
        Scanner dados = new Scanner(System.in);
        String aux = "null";
        int contador = 0;

        while (contador < 2) {
            System.out.println("Informe o nome a ser encontrado: ");
            String nome = dados.next();

            for (int i = 0; i < 30; i++) {
                if (matriz[0][i].equals(nome)) {
                    System.out.println(matriz[0][i] + ": " + matriz[1][i]);
                    aux = nome;
                    contador = 3;
                }
            }
            if (aux.equals("null")) {
                System.out.println("Nome não encotrado");
                System.out.println("");
            }
        }
    }
}
