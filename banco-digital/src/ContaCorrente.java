public class ContaCorrente extends Contas {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ==="); 
        super.imprimirInfoContas();
    }
}
