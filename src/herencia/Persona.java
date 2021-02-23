/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public abstract class Persona implements Actor {
	public String nombre;
	public int cedula;
	public int edad;
	

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy actuando");
	}

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		System.out.println("Como me divierto!!");
	}

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		System.out.println("Chao pescado!");
	}

	public void saludar () {
		System.out.println("Hola mi nombre es:" + nombre + "y tengo" + edad);
	}
	
	public void comer () {
		System.out.println("Estoy comiendo");
	}
	
}
