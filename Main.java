import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        respostaQuestao1();
        respostaQuestao2();
        respostaQuestao3();
        respostaQuestao4();
        respostaQuestao5();
    }


    public static void respostaQuestao1(){
        System.out.printf("Resposta da Questão 1: %d%n", 91);
    }


    public static void respostaQuestao2() {

        Random rd = new Random();
        int numero = rd.nextInt(100);
        System.out.printf("%nQuestão 2 - Número gerado aleatoriamente: %d%n", numero);

        int inicio = 0;
        int atual = 1;
        int proximo;

        String mensagem = String.format("Número %d NÃO pertence a sequência Fibonacci", numero);

        for (int i=0; i <= numero; i++) {
            proximo = inicio + atual;
            inicio = atual;
            atual = proximo;

            if (atual == numero) {
                mensagem = String.format("Número: %d pertence a sequência Fibonacci", numero);
                break;
            }
        }
        System.out.println(mensagem + "\n");
    }


    public static void respostaQuestao3() {
        double[] vetor = new double[30];
        Random rd = new Random();
        double vlrFat;

        for (int i=0; i < vetor.length; i++){
            vlrFat = rd.nextDouble(100000);
            vetor[i] = Math.round(vlrFat * 100.0) / 100.0;
        }

        double soma = 0;
        int diasContados = 0;
        double menorValor = -1;
        double maiorValor = -1;

        for (double valor : vetor) {
            if (valor > 0) {
                soma += valor;
                diasContados++;
                if (menorValor == -1 || valor < menorValor) {
                    menorValor = valor;
                }
                if (maiorValor == -1 || valor > maiorValor) {
                    maiorValor = valor;
                }
            }
        }

        double media = (diasContados > 0) ? soma / diasContados : 0;

        int diasAcimaDaMedia = 0;
        for (double valor : vetor) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Resposta da Questão 3 que consegui fazer:");
        System.out.println("Faturamento Diário: \n" + Arrays.toString(vetor));
        System.out.printf("Menor valor de faturamento: %.2f %n", menorValor);
        System.out.printf("Maior valor de faturamento: %.2f %n", maiorValor);
        System.out.printf("Número de dias com faturamento acima da média: %d %n", diasAcimaDaMedia);
        System.out.println();
    }


    public static void respostaQuestao4() {

        final double SP = 67836.43;
        final double RJ = 36678.66;
        final double MG = 29229.88;
        final double ES = 27165.48;
        final double OUTROS = 19849.53;

        final double TOTAL = SP + RJ + MG + ES + OUTROS;

        System.out.println("Resposta Questão 4:");
        System.out.printf("Percentual de SP: %.2f%% %n", (SP / TOTAL) * 100);
        System.out.printf("Percentual de RJ: %.2f%% %n", (RJ / TOTAL) * 100);
        System.out.printf("Percentual de MG: %.2f%% %n", (MG / TOTAL) * 100);
        System.out.printf("Percentual de ES: %.2f%% %n", (ES / TOTAL) * 100);
        System.out.printf("Percentual de OUTROS: %.2f%% %n%n", (OUTROS / TOTAL) * 100);
    }


    public static void respostaQuestao5() {

        /*
        System.out.println("Questão 5 - Digite a STRING: ");
        String string = sc.next();
         */

        System.out.println("Questão 5 - a STRING: 'BANANA' ");
        String string = "BANANA";

        System.out.print("Resposta da Questão 5: ");
        int tamanhoString = string.length();
        for (int i = tamanhoString-1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }

    }

}