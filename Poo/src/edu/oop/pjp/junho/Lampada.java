package edu.oop.pjp.junho;

public class Lampada {

	private String marca;
	private String modelo;
	private String volts;
	private String bocal;

	public static void main(String[] args) {
		Lampada led = new Lampada();
		led.marca = "Lux Master";
		led.modelo = "10.000 Lumens";
		led.volts = "Bivolt";
		led.bocal = "Default";
		
		System.out.println(led.marca + ", " + led.bocal +  ", " + led.modelo + ", " + led.volts);
		
		
		
		
		
		
		
		

	}

}
