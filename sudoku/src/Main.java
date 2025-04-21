import model.Board;
import model.Space;
import util.Template;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private static Board board;
    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        final var posicoes = Stream.of(args)
                .collect(toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));
        var option = -1;
        while (true) {
            System.out.println("Selecione uma das opções:");
            System.out.println("1 - Novo Jogo");
            System.out.println("2 - Colocar novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Jogo atual");
            System.out.println("5 - Status de jogo");
            System.out.println("6 - Limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> startGame(posicoes);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida, selecione uma das opções do menu");
            }
        }
    }

    private static void removeNumber() {
        if (Objects.isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        System.out.println("Informe a coluna para inserir o numero");
        var col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha para inserir o numero");
        var row = runUntilGetValidNumber(0, 8);
        if (!board.limpaValor(col, row)) {
            System.out.printf("A posição [%s,%s] tem um valor fixo\n", col, row);
        }
    }

    private static void showCurrentGame() {
        if (Objects.isNull(board)) {
            System.out.println("O jogo não foi iniciado");
            return;
        }

        var args = new Object[81];
        var argPos = 0;
        for (int i = 0; i < BOARD_LIMIT; i++) {
            for (var col : board.getSpaces()) {
                args[argPos++] = " " + ((Objects.isNull(col.get(i).getValor())) ? " " : col.get(i).getValor());
            }
        }
        System.out.println("Seu status do jogo atual");
        System.out.printf((Template.BOARD_TEMPLATE) + "\n", args);
    }

    private static void inputNumber() {
        if (Objects.isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        System.out.println("Informe a coluna para inserir o numero");
        var col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha para inserir o numero");
        var row = runUntilGetValidNumber(0, 8);
        System.out.printf("Informe o número que sera na posição [%s,%s]\n", col, row);
        var value = runUntilGetValidNumber(1, 9);
        if (!board.mudaValor(col, row, value)) {
            System.out.printf("A posição [%s,%s] tem um valor fixo\n", col, row);
        }
    }

    private static int runUntilGetValidNumber(final int min, final int max) {
        var current = scanner.nextInt();
        while (current < min || current > max) {
            System.out.printf("Informe um número entre %s e %s\n", min, max);
            current = scanner.nextInt();
        }
        return current;
    }

    private static void startGame(final Map<String, String> posicoes) {
        if (Objects.nonNull(board)) {
            System.out.println("Jogo iniciado");
            return;
        }

        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                var key = "%s,%s".formatted(i, j);
                var configPost = posicoes.get(key);

                int esperado = 0;
                boolean fixo = false;

                if (configPost != null) {
                    try {
                        esperado = Integer.parseInt(configPost.split(",")[0]);
                        fixo = Boolean.parseBoolean(configPost.split(",")[1]);
                    } catch (Exception e) {
                        System.out.printf("Erro ao ler posição [%s]: '%s'. Usando valor padrão 0 e fixo = false\n", key, configPost);
                    }
                }

                var currentSpace = new Space(esperado, fixo);
                spaces.get(i).add(currentSpace);
            }
        }

        board = new Board(spaces);
        System.out.println("O jogo está pronto para começar");
    }

    private static void finishGame() {
        if (Objects.isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        if (board.jogoFinalizado()) {
            System.out.println("Parabéns! Você concluiu o jogo");
            showCurrentGame();
            board = null;
        } else if (board.hasErros()) {
            System.out.println("Seu jogo contém erros, verifique seu board e ajuste");
        } else {
            System.out.println("Você ainda precisa preencher algum espaço");
        }
    }

    private static void showStatus() {
        if (Objects.isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        System.out.printf("O jogo atualmente se encontra no status %s\n", board.getStatus().getLabel());
        if (board.hasErros()) {
            System.out.println("O jogo contém erros");
        } else {
            System.out.println("O jogo não contém erros");
        }
    }

    private static void clearGame() {
        if (Objects.isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        System.out.println("Tem certeza que deseja limpar seu jogo e perder todo seu progresso?");
        var confirm = scanner.next();
        while (!confirm.equalsIgnoreCase("sim") && !confirm.equalsIgnoreCase("não")) {
            System.out.println("Informe 'sim' ou 'não'");
            confirm = scanner.next();
        }

        if (confirm.equalsIgnoreCase("sim")) {
            board.reset();
        }
    }
}
