package desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Digite o primeiro numero: ");
        num1  = scanner.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextInt();
        
        try {
            contar(num1, num2);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("o segundo numero dever ser maior que o primeiro!");
        }
    }
    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
        throw new ParametrosInvalidosException();
    }
        int contagem = num2 - num1;
        
        for(int i = 1; i < contagem; i++){
                System.out.println("contagem" +i);
               
            }
    }
}
