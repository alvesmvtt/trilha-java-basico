package desafiobanco;
public class DesafioBanco {
    public static void main(String[] args) {
     Cliente Matheus = new Cliente();   
     
     Conta cc = new ContaCorrente(Matheus);
     cc.depositar(100);
     
     Conta poupanca = new ContaPoupanca(Matheus);
     cc.transferir(100, poupanca);
     
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
