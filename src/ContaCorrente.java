public class ContaCorrente extends Conta implements ITaxas{
    public ContaCorrente(int numero, Cliente dono, double saldo) {
        super(numero, dono, saldo);
    }

    @Override
    public void setLimite(double limite) {
        if (limite < -100) {
            this.limite = -100; // Correção aqui para definir o limite mínimo como -100
            System.out.println("Limite não pode ser inferior a -100R$!");
        } else {
            this.limite = limite;
            System.out.println("Limite dentro das regras do banco! :)");
        }
    }

    @Override
    public double calculaTaxas() {
        return 0;
    }
}