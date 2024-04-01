import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args){

        Scanner scan =  new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        System.out.println("Por favor, digite o número da Conta!");
        numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia =  scan.nextLine();
        System.out.println("Por favor, digite seu nome!");
        nomeCliente =  scan.nextLine();
        System.out.println("Por favor, digite o saldo da sua conta!");
        saldo = scan.nextBigDecimal();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        scan.close();
    }
}
