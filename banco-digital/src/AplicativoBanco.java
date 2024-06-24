public class AplicativoBanco {
    public static void main(String[] args) throws Exception {

        Cliente alexandre = new Cliente();
        alexandre.setNome("Alexandre");

        Contas cc = new ContaCorrente(alexandre);
        Contas cp = new ContaPoupanca(alexandre);
        
        cc.depositar(1000);
        cc.transferir(150, cp);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
