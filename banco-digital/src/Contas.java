public abstract class Contas implements IContas {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1000;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Contas(Cliente cliente) {
        this.agencia = Contas.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
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
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Contas contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);        
    }

    protected void imprimirInfoContas() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));  
        System.out.println(String.format("N° Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
