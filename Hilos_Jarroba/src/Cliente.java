
public class Cliente {

	private String nombre;
	private int[] carroCompra;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente (String nombre, int[] carrito) {
		this.nombre = nombre;
		this.carroCompra = carrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getCarroCompra() {
		return carroCompra;
	}

	public void setCarroCompra(int[] carroCompra) {
		this.carroCompra = carroCompra;
	}

}
