package one.dio.bootcamp;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 15);
        Mensagem.obterMensagem( 21);


        //Empréstimo
        System.out.println("Exercicio calculadora");
        Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular( 1000, 5);

    }
}
