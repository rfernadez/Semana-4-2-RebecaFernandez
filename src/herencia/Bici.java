/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public class Bici extends Vehiculo implements Actor {

	private String tiporuedas;
	private String marcabici;
	private String colorbici;
	
	//set - get
	
	/**
	 * @return the tiporuedas
	 */
	public String getTiporuedas() {
		return tiporuedas;
	}

	/**
	 * @param tiporuedas the tiporuedas to set
	 */
	public void setTiporuedas(String tiporuedas) {
		this.tiporuedas = tiporuedas;
	}

	/**
	 * @return the marcabici
	 */
	public String getMarcabici() {
		return marcabici;
	}

	/**
	 * @param marcabici the marcabici to set
	 */
	public void setMarcabici(String marcabici) {
		this.marcabici = marcabici;
	}

	/**
	 * @return the colorbici
	 */
	public String getColorbici() {
		return colorbici;
	}

	/**
	 * @param colorbici the colorbici to set
	 */
	public void setColorbici(String colorbici) {
		this.colorbici = colorbici;
	}

	//metodos heredados
	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}

	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
	}

	@Override
	public int getAño() {
		// TODO Auto-generated method stub
		return super.getAño();
	}

	@Override
	public void setAño(int año) {
		// TODO Auto-generated method stub
		super.setAño(año);
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public void poner() {
		// TODO Auto-generated method stub
		super.poner();
	}

	@Override
	public void quitar() {
		// TODO Auto-generated method stub
		super.quitar();
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		super.mover();
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
	public void frenar() {
		// TODO Auto-generated method stub
		super.frenar();
	}

	@Override
	public void acelerando() {
		// TODO Auto-generated method stub
		super.acelerando();
	}

	@Override
	public void detenido() {
		// TODO Auto-generated method stub
		super.detenido();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	// metodos 
	
		public void metodo1() {
			System.out.println("metodo1");
		}
		
		public void metodo2() {
			System.out.println("metodo2");
		}
		
		public void metodo3() {
			System.out.println("metodo3");
		}

	/**
	 * @param marca
	 * @param año
	 * @param color
	 * @param tiporuedas
	 * @param marcabici
	 * @param colorbici
	 */
	public Bici(String marca, int año, String color, String tiporuedas, String marcabici, String colorbici) {
		super(marca, año, color);
		this.tiporuedas = tiporuedas;
		this.marcabici = marcabici;
		this.colorbici = colorbici;
	}

}
