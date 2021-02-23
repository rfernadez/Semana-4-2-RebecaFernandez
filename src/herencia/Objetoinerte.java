/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public interface Objetoinerte {
	
	public static String color = "cafe";
	public static int inventario = 10;
	public static String tipo = "mesa";
	
	abstract void poner ();
	
	abstract void quitar ();
	
	abstract void mover ();

}
