public abstract class Contas implements IContas {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1000;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public Contas() {
        this.agencia = Contas.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void transferir(double valor, Contas contaDestino) {
        // TODO Auto-generated method stub
        
    }
}
