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
public class Serie {
	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	final int NTEMPORADAS=3;
	final boolean ENTREGADO=false;
	
	
//CONTRUCTORES
	
	public Serie() {
	}


	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.nTemporadas = NTEMPORADAS;
		this.entregado = ENTREGADO;
		this.creador = creador;
	}


	public Serie(String titulo, int nTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	
	
	
}
