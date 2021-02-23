/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public class Estudiante extends Persona {
	private String nombreestudiante;
	private String apellido;
	private int nivel;
	
	//set-get
	

	/**
	 * @return the nombreestudiante
	 */
	public String getNombreestudiante() {
		return nombreestudiante;
	}


	/**
	 * @param nombreestudiante the nombreestudiante to set
	 */
	public void setNombreestudiante(String nombreestudiante) {
		this.nombreestudiante = nombreestudiante;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}


	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		super.actuar();
	}


	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		super.divertir();
	}

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		super.desaparecer();
	}

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		super.saludar();
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		super.comer();
	}

	/**
	 * 
	 */
	public Estudiante(String nombre, int cedula, int edad,String nombreestudiante, String apellido, int nivel) {
		super();
		super.nombre= nombre;
		super.cedula= cedula;
		super.edad= edad;
		this.nombreestudiante = nombreestudiante;
		this.apellido = apellido;
		this.nivel = nivel;
		
		// TODO Auto-generated constructor stub
	}

	public void estudiando() {
		System.out.println("Estoy estudiando");
	}
	
	public void recibiendoclases() {
		System.out.println("Recibiendo clases");
	}
	
	public void haciendo() {
		System.out.println("Estoy haciendo tarea");

	}
	@Override
	public String toString() {
		return "La infomacion del estudiante y del profesor son"+ " "+ "nombreestudiante=" + " "+ nombreestudiante + " "+ "apellido=" + " "+ apellido + " "+ "nivel=" + " "+ nivel
				+ " "+ "nombre=" + " "+ nombre + " " + "cedula=" + " " + cedula + " " + "edad=" + " "+ edad;
	}

	

}
