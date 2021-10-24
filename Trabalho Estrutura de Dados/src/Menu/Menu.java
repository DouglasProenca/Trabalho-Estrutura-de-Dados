package Menu;

import Ordenacao.OdenacaoInsercao;
import Ordenacao.OrdenacaoSelecao;
import Ordenacao.OrdenacaoTrocas;
import Ordenacao.PesquisaBinaria;
import Ordenacao.PesquisaSequencial;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Menu {

    public Menu() {

    }

    void escolha(String dados) {
        switch (dados) {
            case "1":
                OrdenacaoTrocas ordenacaoTrocas = new OrdenacaoTrocas();
                ordenacaoTrocas.ordenacao();
                break;
            case "2":
                OrdenacaoSelecao ordenacaoSelecao = new OrdenacaoSelecao();
                ordenacaoSelecao.ordenacao();
                break;
            case "3":
                OdenacaoInsercao odenacaoInsercao = new OdenacaoInsercao();
                odenacaoInsercao.ordenacao();
                break;
            case "4":
                PesquisaSequencial pesquisaSequencial = new PesquisaSequencial();
                pesquisaSequencial.pesquisa();
                break;
            case "5":
                PesquisaBinaria pesquisaBinaria = new PesquisaBinaria();
                pesquisaBinaria.menu();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("Digitação Incorreta!");
                System.out.println("");
        }

    }

    public void opcoes() {
        int i = 0;
        while (i < 2) {
            System.out.println("ESCOLHA UM METODO");
            System.out.println("");
            System.out.println("1)Ordenação por trocas");
            System.out.println("2)Ordenação por selecão");
            System.out.println("3)Ordenação por Inserção");
            System.out.println("4)Pesquisa Sequencial");
            System.out.println("5)Pesquisa Binaria");
            System.out.println("0)Sair");
            System.out.println("");
            System.out.println("Opção =>");
            Scanner dados = new Scanner(System.in);
            String dado = dados.next();
            escolha(dado);
            if ((dado.equals("1")) || (dado.equals("2")) || (dado.equals("3"))
                    || (dado.equals("4")) || (dado.equals("5"))) {
                i = 3;
            }
        }
    }
}
