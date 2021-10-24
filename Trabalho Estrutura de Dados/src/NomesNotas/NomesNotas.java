package NomesNotas;

/**
 *
 * @author Douglas
 */
public class NomesNotas {

    public static String[][] Matriz() {
        String[][] dados = {{"Elisangela", "Nair", "Mariana", "Rafael", "Carlos", "Nilton",
            "Marcos", "Neide", "Pamela", "Flavio", "Fabricio", "Julio", "Jose", "Everton",
            "Emerson", "Laura", "Valeria", "Diego", "Paula", "Elisa", "Jonas", "Fernando",
            "Claudio", "Lucas", "Mateus", "Teodoro", "Felipe", "Jean", "Denise", "Rosana"},
        {"9.5", "7.5", "5.5", "9.5", "7.0", "6.5", "5.0", "6.5", "6.0", "8.0", "9.5", "8.5",
            "8.5", "6.0", "5.0", "8.0", "9.5", "7.5", "7.5", "9.5", "6.0", "8.0", "9.5", "6.0",
            "6.5", "9.5", "5.5", "6.0", "8.5", "7.0"}};

        String notas;
        for (int i = 0; i < 30 - 1; i++) {
            for (int j = 0; j < 30 - 1 - i; j++) {
                if (dados[0][j].compareToIgnoreCase(dados[0][j + 1]) > 0) {
                    String aux = dados[0][j];
                    notas = dados[1][j];
                    dados[0][j] = dados[0][j + 1];
                    dados[1][j] = dados[1][j + 1];
                    dados[0][j + 1] = aux;
                    dados[1][j + 1] = notas;
                }
            }
        }
                    return dados;
    }
}
