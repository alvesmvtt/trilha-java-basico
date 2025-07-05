package contabanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       int conta = 0 ;
       String agencia = "";
       String cliente = "";
       double saldo = 0;
       
       Scanner scanner = new Scanner (System.in);
       
        System.out.println("Por favor, Digite seu nome completo: ");
        cliente = scanner.nextLine();
       
        System.out.println("Por favor, digite o numero da agencia: ");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero da conta: ");
        conta = scanner.nextInt();
        
        
        System.out.println("Por favor, Digite o valor a ser depositado: ");
        saldo = scanner.nextDouble();
        
        
        System.out.println("Ola " + cliente + ", obrigado por criar uma conta em nosso banco, sua agencia e  " 
                + agencia + " conta " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque!");
        
        
    }
    
}
