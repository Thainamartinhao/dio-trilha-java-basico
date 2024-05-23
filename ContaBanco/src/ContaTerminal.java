import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
        public static void main(String[] args) {
       
                try (Scanner Scanner = new Scanner(System.in).useLocale(Locale.US)) {
            
                System.out.println("Por favor, digite seu nome: ");
                String nome = Scanner.next();

                System.out.println("Por favor, digite o número da agência: ");
                String agencia = Scanner.next();

                System.out.println("Por favor, digite o número da conta: ");
                int numero = Scanner.nextInt();

                System.out.println("Por favor, digite o saldo da conta: ");
                double saldo = Scanner.nextDouble();

                System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            }
        }
    }

