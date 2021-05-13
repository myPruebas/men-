/**
 * 
 */
package jcolonia.daw2020.mayo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author daw1m03
 *
 */
public class VistaMuestaSumandos extends VistaGeneral {

	
public VistaMuestaSumandos(String titulo,Scanner in){
		super(titulo, in);
		
	}
	

public void muestanumeros() {
	mostrarTítuloSimple();
	ArrayList <String> muestra;
	ListaNúmeros numero = new ListaNúmeros ();
	 muestra =numero.toListaString();
	for(String lista : muestra) {
		System.out.print(lista);
	}
	
	
	
	
	
}


}
