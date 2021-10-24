package Ordenacao;

import Menu.Menu;
import NomesNotas.NomesNotas;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class PesquisaBinaria {

    public void menu() {
        System.out.println("1)Pesquisar por nome");
        System.out.println("2)Listar nome e notas");
        System.out.println("Opcão =>");
        Scanner dados = new Scanner(System.in);
        String dado = dados.next();
        if (dado.equals("1")) {
            System.out.println("Digite o nome:");
            String nome = dados.next();
            pesquisapornome(nome);
        } else if (dado.equals("2")) {
            pesquisa();
        } else {
            System.out.println("Opção Incorreta");
        }
    }

    void pesquisa() {
        NomesNotas NomesNotas = new NomesNotas();
        String[][] matriz = NomesNotas.Matriz();

        String aux;
        String aux_nome;
        for (int i = 0; i < 30 - 1; i++) {
            for (int j = i + 1; j < 30; j++) {
                if (Float.parseFloat((matriz[1][i])) > (Float.parseFloat((matriz[1][j])))) {
                    aux = matriz[1][i];
                    aux_nome = matriz[0][i];
                    matriz[1][i] = matriz[1][j];
                    matriz[0][i] = matriz[0][j];
                    matriz[1][j] = aux;
                    matriz[0][j] = aux_nome;
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(matriz[0][i] + ": " + matriz[1][i]);
        }
    }

    void pesquisapornome(String nome) {
        NomesNotas NomesNotas = new NomesNotas();
        String[][] matriz = NomesNotas.Matriz();

        int inicio = 0;
        int meio = 0;
        int fim = 31 - 1;

        while (inicio <= fim) {
            meio = (fim + inicio) / 2;

            if (matriz[0][meio].equals(nome)) {
                System.out.println(matriz[0][meio] + ": " + matriz[1][meio]);
            }

            if (matriz[0][meio].charAt(0) < nome.charAt(0)) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        Menu menu = new Menu();
        menu.opcoes();
    }
}
