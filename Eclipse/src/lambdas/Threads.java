package lambdas;

public class Threads {

	public static void main(String[] args) {
		Runnable tarefa = new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100; i++) {
					System.out.println("Tarefa #" + i);
				}
			}
		};

		Thread t1 = new Thread(tarefa);

		t1.run();
	}
}
