
public class MainRunnable implements Runnable {

	private Cliente cliente;
	private Cajera cajera;
	private long initialTime;
	
	
	
	//CONSTRUCTORES--------------------------------------------------------------------------------
	public MainRunnable (Cliente cliente, Cajera cajera, long initialTime){
		this.setCajera(cajera);
		this.setCliente(cliente);
		this.setInitialTime(initialTime);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
		
		Cajera cajera1 = new Cajera("Cajera 1");
		Cajera cajera2 = new Cajera("Cajera 2");
		
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		
		Runnable proceso1 = new MainRunnable(cliente1, cajera1, initialTime);
		Runnable proceso2 = new MainRunnable(cliente2, cajera2, initialTime);
		
		new Thread(proceso1).start();
		new Thread(proceso2).start();
	}

	
	//MÉTODOS IMPLEMENTADOS----------------------------------------------------------------------
	
		@Override
		public void run() {
			// TODO Auto-generated method stub
			this.cajera.procesarCompra(this.cliente, this.initialTime);
		}
	
	
	
	//GETTERS Y SETTERS----------------------------------------------------------------------------------

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Cajera getCajera() {
		return cajera;
	}


	public void setCajera(Cajera cajera) {
		this.cajera = cajera;
	}


	public long getInitialTime() {
		return initialTime;
	}


	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}


	
	

}
