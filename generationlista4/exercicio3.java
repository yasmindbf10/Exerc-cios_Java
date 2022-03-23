package br.com.generationlista4;
import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {
		int nl[][] = new int [4][6],
			nll[][] = new int [4][6], il, ic, ill, icc,
			soma[][] = new int [4][6],
			subtracao[][] = new int [4][6],
			length;
		
		for (il=0; il<4;il++) {
			for (ic=0;ic<6;ic++) {
				System.out.println("Digite o valor: ");
				Scanner leia = new Scanner(System.in);
				nl[il][ic] = leia.nextInt();
			}
		}
		for (ill=0; ill<4;ill++) {
			for (icc=0;icc<6;icc++) {
				System.out.println("Digite o valor: ");
				Scanner leia = new Scanner(System.in);
				nll[ill][icc] = leia.nextInt();
				soma[ill][icc]= nl[ill][icc] + nll[ill][icc];
				subtracao[ill][icc] = nl[ill][icc]- nll[ill][icc];
				
			}
		}
			for(ill=0; ill<4; ill++) {
				for(icc=0; icc<6; icc++) {
			System.out.println(" No espaço " + ill + icc + " a soma foi: " + soma[ill][icc]);
			System.out.println("No espaço " + ill + icc + " a subtração foi: " + subtracao[ill][icc]);
		}
		}
		}
	}
