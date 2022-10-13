package question09;

import java.lang.Math;

public class ThreadLoteria extends Thread {
	private double premio, saldo, premioInicial;
	
	public ThreadLoteria(double premio) {
		this.premio = premio;
		this.premioInicial = premio;
		
		Thread threadLoteria = new Thread(this);
		threadLoteria.start();
	}
	
	public void run() {
		do {
			try {
				premio -= premio * (Math.random());
				saldo = premio;
			
				Thread.sleep(10000);
			
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			
		} while(saldo > 0.01);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getPercentualPremiacao() {
		return (saldo / premioInicial * 100);
	}
}
