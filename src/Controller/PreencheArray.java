package Controller;

public class PreencheArray extends Thread {
	public PreencheArray(int[] vet) {
		this.vetor = vet;
	}
	
	int[] vetor;
	
	@Override
	public void run() {
		int sum = 0;
		for(int i = 0; i < vetor.length ; i++) {
			sum += vetor[i];
		}
		System.out.println(sum);
	}
}
