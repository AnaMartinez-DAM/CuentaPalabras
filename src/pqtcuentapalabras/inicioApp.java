/*  Crea un programa que cumpla las siguientes caracter�sticas:
 *	El programa recibe un cadena de caracteres de longitud variable. Mostrar� por consola unas estad�sticas que indiquen 
 *  la cantidad total de caracteres (sin contar espacios en blanco), cantidad de palabras, cantidad total de veces que se ha introducido cada car�cter.
 *	1. Debe tener solo 1 clase, llamada inicioApp.
 *	2. Debe contener solo 3 m�todos,
 *	main - lanza la aplicaci�n, genera las llamadas a los m�todos y gestiona la interacci�n con el usuario.
 *	contarPalabras - recibe un string y realiza los c�lculos necesarios. Devuelve void.
 *	mostrarResultado - muestra por consola el resultado.
 */
package pqtcuentapalabras;
import javax.swing.JOptionPane;
public class inicioApp {
	static String cadena="";
	static int iCantidadCaracteres = cadena.length();
	static int iCantidadPalabras = 0;
/*	static char[] abecedario = new char[27];
	static char[] aiCaracteresRepetidos=new char[cadena.length()];*/ //Esta �ltima parte no daba una manera de que me saliera bien.
	
	public static void main(String[] args) {
		cadena = JOptionPane.showInputDialog("Introduce una frase");
		contarPalabras(cadena);
		mostrarResultado();
	}
	
	public static void contarPalabras (String cadena) {
		
		for (int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i)==' ') {
				iCantidadCaracteres++;
			}
		}		
		
		for (int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i)==' ') {
				iCantidadPalabras++;
			}
		}
		iCantidadPalabras++;
		
	/*	for(int k=0;k<abecedario.length;k++) {
			
		}
		
		for (int i=0; i<abecedario.length; i++) {
			for (int j=0; j<cadena.length(); j++) {
				
			}
		}*/
	}
	public static void mostrarResultado() {
		System.out.println("La cadena contiene "+cadena.length()+" car�cteres, contando los espacios.");
		System.out.println("La cadena contiene "+(cadena.length()-iCantidadCaracteres)+" car�cteres, sin espacios.");
		System.out.println("La cadena contiene "+iCantidadPalabras+" palabras.");
		
	/*	for (int i=0; i<aiCaracteresRepetidos.length; i++) {
			if (aiCaracteresRepetidos[i]==' ') {
				
			}
			else
			System.out.println("La cadena contiene la letra "+aiCaracteresRepetidos[i]+" m�s de 1 vez.");
		}*/
	}
	
}