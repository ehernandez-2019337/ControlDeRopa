package org.emersonhernandez.controlador;
import java.util.ArrayList;
import org.emersonhernandez.modelo.Ropa;
/**
*aca inicia la clase 
*
*/
/**
 *
 * @author emerson
 * @version 1.0
*/
public class ControlDeRopa{
	
	//declaración de variables
	private ArrayList<Ropa> listaDeRopa;
	private static ControlDeRopa instancia; 
	
	//fase de declaracion y definicion de metodos 
	public ControlDeRopa(){
		listaDeRopa = new ArrayList<Ropa>();
	}
	public int cantidadDeElementos(){
		return listaDeRopa.size();
	}
	public static ControlDeRopa getInstancia(){
		if(instancia == null){
			instancia = new ControlDeRopa();
		}return instancia; 
	}
	public void crearRopa(Ropa ropa){
		listaDeRopa.add(ropa);
	}
	
	public ArrayList<Ropa> getListaDeRopa(){
		return listaDeRopa;
	}
	
	public void eliminarRopa(Ropa ropa){
		listaDeRopa.remove(ropa);
	}
	public void eliminarRopa(int id){
		Ropa posicion = new Ropa();
		for(Ropa ropa : listaDeRopa	){
			if(ropa.getId()== id){
				posicion = ropa;
				listaDeRopa.remove(posicion);
				break;
			}
		}
	}

	public Ropa buscarRopa(int idRopa){
		Ropa ropa = null; 
		for (Ropa elemento : listaDeRopa){
			if (elemento.getId()==idRopa){
				ropa = elemento;
			break;
			}
		}return ropa;
	}

	public void actualizarRopa(Ropa ropaAntigua, Ropa ropaActualizada){
		int indice =  listaDeRopa.indexOf(ropaAntigua);
		listaDeRopa.set(indice, ropaActualizada);

	}

}