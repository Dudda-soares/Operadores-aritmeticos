public class Operadores {
    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicao();
        operacoesIncremento();
        operacoesRelacionais();
        operacaoesLogicas();
    }

    private static void operacaoesLogicas() {
        System.out.println("**** Operadores Logicos ****");

        int num1 = 19;
        int num2 = 20;

        boolean isDentro10 = num1 >= 20 && num2 <= 30;
        System.out.println("isDentro10: " + isDentro10);

        boolean isDentro_10 = num1 >= 20 || num1 <= 30;
        System.out.println("isDentro_10: " + isDentro_10);
    }

    private static void operacoesRelacionais() {
        System.out.println("**** Operadores Relacionais ****");

        int num1 = 19;
        int num2 = 20;
        boolean isMaior = num1 > num2;
        System.out.println("isMaior: " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("isIgual: " + isIgual);

        boolean isDiferente = num1 != num2;
        System.out.println("isDiferente: " + isDiferente);

        boolean isIgualMaior = num1 >= num2;
        System.out.println("isIgualMaior: " + isIgualMaior);

        boolean isIgualMenor = num1 <= num2;
        System.out.println("isIgualMenor: " + isIgualMenor);



    }

    private static void operacoesIncremento() {
        System.out.println("**** Operadores Incremento ****");

        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);

    }

    private static void operacoesAtribuicao() {
        System.out.println("**** Operadores Atribuicoes ****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        System.out.println(numero3);
        int numero4 = numero3 + 20;
        System.out.println(numero4);
    }

    public static void operacoesAritmeticas(){
        System.out.println("**** Operadoracoes Aritmetica ****");

        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 * num2;
        int num6 = num1 / num2;
        int num7 = (100 + 80)/ 50 ;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}