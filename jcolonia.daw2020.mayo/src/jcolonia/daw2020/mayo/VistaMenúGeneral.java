/**
 * 
 */
package jcolonia.daw2020.mayo;

import java.util.Scanner;

/**
 * @author daw1m03
 *
 */
public class VistaMenúGeneral extends VistaGeneral {
private Scanner in;
private String titulo;
private String [] opciones;
private static final String [] MENU= {"Agregar valor","Mostrar valores","Mostrar suma", "Restablecer","SALIR"};
/**
 * 
 * @param titulo
 * @param opciones
 * @param in
 */
	
public VistaMenúGeneral(String titulo,String[]opciones,Scanner in){
	super(titulo, in);
	this.in=in;
	this.opciones=opciones;
	
}



public int elegirOpción() {
	String elección;
	int opciónEscogida = 0;
	int numeroOpciones=0;
	mostrarTítuloDoble();
	for(String opcionMenu : MENU) {
		System.out.printf("%d) %s\n",numeroOpciones, opcionMenu);
		numeroOpciones++;
	}
	mostrarInvitación();
	elección = in.nextLine();
	opciónEscogida = Integer.parseInt(elección);
	return opciónEscogida;
}

public static String getNúmRespuestas() {
	
	
	return null;
}
}
