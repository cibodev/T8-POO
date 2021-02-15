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
public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	final String DNI="00000000A";
	final char SEXO='h';
	
	
//CONSTRUCTORES
	
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}


	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = DNI;
		this.sexo = sexo;
	}


	public Persona() {
	}

}
