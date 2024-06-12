package ExMat;
import java.util.Scanner;
public class ex02 {
	
	public static void main(String[] args) {
		
		int par[][] = new int [5][5];
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				par[i][j] = (int)Math.round(Math.random()*100);
			}
		}
	
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(par[i][j] % 2==0) {
					System.out.println("Valor inteiros dos pares são: " + par[i][j]);
				}
			}
	}
	}
}
