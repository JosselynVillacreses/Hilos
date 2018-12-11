
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

//		Cajera cajera1 = new Cajera("Cajera Thread 1");
//		Cajera cajera2 = new Cajera("Cajera Thread 2");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		CajeraThread cajeraThread1 = new CajeraThread("Cajera 1", cliente1, initialTime);
		CajeraThread cajeraThread2 = new CajeraThread("Cajera 2", cliente2, initialTime);

		cajeraThread1.start();
		cajeraThread2.start();

//		cajera1.procesarCompra(cliente1, initialTime);
//		cajera2.procesarCompra(cliente2, initialTime);
	}

}
