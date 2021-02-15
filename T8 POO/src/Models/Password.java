/**
 * 
 */
package Models;

import java.util.Random;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 15 feb. 2021
 *
 *
 */
public class Password {
	private int longitud;
	private String contrasena;
	
	final int LONGITUD=8;

	public Password() {
		Random rand=new Random();
		this.longitud = LONGITUD;
		this.contrasena = Integer.toString(rand.nextInt(longitud));
	}

	public Password(int longitud, String contrasena) {
		Random rand=new Random();
		this.longitud = longitud;
		this.contrasena = Integer.toString(rand.nextInt(longitud));
	}
	
	
}
