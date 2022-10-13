package question09;

import java.util.Scanner;

public class threadUtil {

	public static void main(String[] args) {
		double premio;
		int op;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Prêmio de R$");
		premio = key.nextDouble();
		ThreadLoteria t1 = new ThreadLoteria(premio);
		
		do {
			System.out.println("");
			System.out.println("*****************MENU*****************");
			System.out.println("* 1 - Saldo restante do prêmio       *");
			System.out.println("* 2 - Percentual restante do prêmio  *");
			System.out.println("* 3 - Sair                           *");
			System.out.println("**************************************");
			System.out.println("");
			op = key.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("SALDO DE R$" + t1.getSaldo());
				break;
			
			case 2:
				System.out.println("RESTA " + t1.getPercentualPremiacao() + "% DO PRÊMIO");
			}
		
		} while(op != 3);
		
		key.close();
	}
}