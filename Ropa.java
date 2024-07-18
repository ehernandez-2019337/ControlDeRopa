package org.emersonhernandez.modelo;
/**
*aca inicia la clase 
*
*/
/**
 *
 * @author emerson
 * @version 1.0
*/
public class Ropa{

	//declarando variables 
	private int idRopa;
	private String tipoRopa;
	private String marcaRopa;
	
	//metodos para los datos
	public Ropa(){}
	public Ropa(int id, String tipo, String marca){
		this.idRopa = id;
		this. tipoRopa = tipo;
		this.marcaRopa = marca;
	}
	public void setId(int id){
		this.idRopa = id;
	}
	public int getId(){
		return idRopa;
	}
	public void setNombre(String tipo){
		this.tipoRopa = tipo;
	}
	public String getNombre(){
		return tipoRopa;
	}
	public void setTelefono(String marca){
		this.marcaRopa = marca;
	}
	public String getTelefono(){
		return marcaRopa;
	}
}