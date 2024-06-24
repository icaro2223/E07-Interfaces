/**
 * Operacao.java
 *
 * @author João Eduardo Montandon
 */

import java.util.Date;
public abstract class Operacao implements ITaxas{

    /* Data de realização da operação */
    private Date data;

    /* Tipo da operação */
    private char tipo;

    /* Valor da operação */
    private double valor;

    private static int totalOperacoes = 0;

    /**
     * Construtor. Inicializa uma nova instância da classe Operacao onde a data da operação é exatamente a data
     * da criação da classe.
     *
     * Exemplos de uso:
     *
     * > Operacao op1 = new Operacao('d', 2500); // Operação de depósito de 2500 reais
     * > Operacao op2 = new Operacao('s', 1000); // Operação de saque de 1000 reais
     *
     * @param tipo Tipo da operação, podendo ser 'd' ou 's'
     * @param valor Valor da operação
     */
    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date();

        Operacao.totalOperacoes++;
    }

    public void imprimir() {
        System.out.println(getData() + "\t" +  getTipo() + "\t" + getValor());
    }

    public void setTipo(char tipo) {
        if(tipo == 's' || tipo == 'd') {
            this.tipo = tipo;
        }
    }

    public char getTipo() {
        return tipo;
    }

    public Date getData() {

        return data;
    }

    public double getValor() {

        return valor;
    }

    public static int getTotalOperacoes() {
        return Operacao.totalOperacoes;
    }




}