/**
 * 
 */
package Models;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 15 feb. 2021
 *
 *
 */
public class Electrodomestico {
	private double precioBase;
	private String color;
	private char cEnergetico;
	private double peso;
	
	final double PRECIOBASE=100;
	final String COLOR="blanco";
	final char CENERGETICO='F';
	final double PESO=5;
	
	
//CONTRUCTORES
	
	public Electrodomestico() {
	}


	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.cEnergetico = CENERGETICO;
		this.peso = peso;
	}


	public Electrodomestico(double precioBase, String color, char cEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.cEnergetico = cEnergetico;
		this.peso = peso;
	}
	
	
	
}
