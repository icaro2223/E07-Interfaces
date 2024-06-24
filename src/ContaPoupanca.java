public class ContaPoupanca extends Conta implements ITaxas{

    public ContaPoupanca(int numero, Cliente dono, double saldo) {
        super(numero, dono, saldo);
    }
    @Override
    public void setLimite(double limite){
        if (limite < 100) {
            this.limite = 1000;
            System.out.println("O limite nao poder ser inferior a 100R$!");
        }
        else if (limite > 1000) {
            this.limite = 1000;
            System.out.println("O limite nao pode ser superior a 1000R$!");
        }
        else {
            this.limite = limite;
            System.out.println("Limite dentro das regras do banco! :)");
        }

    }

    @Override
    public double calculaTaxas() {
        return 0;
    }
}

