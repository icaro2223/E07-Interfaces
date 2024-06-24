public class ContaUniversitaria extends Conta implements ITaxas{

    public ContaUniversitaria(int numero, Cliente dono, double saldo){
        super(numero, dono, saldo);
    }

    @Override
    public void setLimite(double limite){
        if (limite < 0) {
            this.limite = 0;
            System.out.println("Limite nao pode ser inferior a 0R$!");
        }
        else if (limite > 500) {
            this.limite = 500;
            System.out.println("Limite nao pode ser superior a 500R$!");
        }
        else {
            this.limite = limite;
            System.out.println("Limite dentro das regras do banco! :)");
        }

    }

    @Override
    public double calculaTaxas() {
        return 0.0;
    }
}
