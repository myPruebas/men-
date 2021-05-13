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
public class VistaSumaTotal extends VistaGeneral {

	public VistaSumaTotal(String titulo,Scanner in){
		super(titulo, in);
		
	}
	
	
	
	public void muestraSuma() {
		ListaNúmeros sumaNumeros = new ListaNúmeros ();
		if(sumaNumeros.getSuma() == 0) {
			mostrarMensaje("No tiene sentido una suma sin sumandos…");
		}else {
			System.out.print(sumaNumeros.toString());
		}	
			
		}
	
	
	
}
