import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		int[] n = new int[5]; // local
		lerDados(n); // argumento -> ser� enviada para o m�todo
		int maior = maiorValor(n);
		int menor = menorValor(n);
		System.out.println("maior valor = "+ maior);
		System.out.println("menor valor = "+ menor);

	}
	
	public static int maiorValor(int[] n) { //metodo com retorno
		int aux = n[0];//inicializa com um valor que j� t� la dentro
		for(int i=0 ; i< n.length;i++) {
			if(n[i] > aux) {
				aux = n[i];
			}
		}
		return aux;
	}
	
	
	public static int menorValor(int[] n) {
		int aux = n[0];//inicializa com um valor que j� t� la dentro
		for(int i=0 ; i< n.length;i++) {
			if(n[i] < aux) {
				aux = n[i];
			}
		}
		return aux;
		
		
		
	}
	
	

	public static void lerDados(int[] n) { // metodo sem retorno - parametro -> variavel que recebe o valor
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<n.length;i++) {
			System.out.print("Valor: ");
			n[i] = teclado.nextInt();
		}
		teclado.close();
	}
	
	
}
