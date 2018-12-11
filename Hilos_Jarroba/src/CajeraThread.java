
public class CajeraThread extends Thread {

	// Variables---------------------------------------------------------------------------------

	private String nombre;
	private Cliente cliente;
	private long initialTime;

	// Constructores--------------------------------------------------------------------------------

	public CajeraThread() {
		// TODO Auto-generated constructor stub
	}
	
	public CajeraThread(String nombre, Cliente cliente, long initialTime) {
		this.setNombre(nombre);
		this.setCliente(cliente);
		this.setInitialTime(initialTime);
	}
	
	

	// Getters y Setters---------------------------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	// Métodos---------------------------------------------------------------------------------

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println(
				"La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getNombre()
						+ " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

		for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
			this.esperarXsegundos(cliente.getCarroCompra()[i]);
			System.out.println("Procesado el producto " + (i + 1) + " del cliente " + this.cliente.getNombre()
					+ "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
		}

		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + this.cliente.getNombre()
				+ " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
