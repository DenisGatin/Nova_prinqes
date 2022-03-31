package substantivos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner l = new Scanner(System.in);
		int laco=1;
		String port;
		String prin;
		ArrayList<Substantivos>substantivos = new ArrayList<Substantivos>();
		Substantivos sub;
		do {
			System.out.println("\n 1-cadastrar substantivo, 2- Alterar substantivo, 3- mostar substantivo, 4-mostrar todos os substantivos cadastrados, 0-sair");
			int escolha = l.nextInt();
			switch(escolha) {
			case 1:
				System.out.println("digite ele em português");
				port = l.next();
				System.out.println("digite ele em prinqes");
				prin = l.next();
				sub = new Substantivos(port,prin);
				substantivos.add(sub);
				
				break;
				
				
			case 2:
				System.out.println("1-alterar em português  2-alterar em prinqes");
				int alt = l.nextInt();
				switch(alt) {
				case 1:
					System.out.println("digite o substantivo em português");
					String pinho = l.next();
					
					for(int i=0; i< substantivos.size();i++) {
					if(substantivos.get(i).getSub_port().equalsIgnoreCase(pinho)) {
						System.out.println("digite o novo substantivo");
						String noSu = l.next();
						
						
						
					  }
					}
					break;
				case 2:
				
				
					break;
				}
				break; 
				
				
				
				
				
				
				
			case 3:
				System.out.println("\n 1- Mostrar em português  2- Mostrar em prinqes");
				int mostrar = l.nextInt();
				
				switch(mostrar) {
				case 1:
					System.out.println("digite o substantivo em prinqes");
					String sPr = l.next();
				
					for(int i=0; i < substantivos.size();i++) {
						if(substantivos.get(i).getSub_prin().equalsIgnoreCase(sPr)) {
							System.out.println(substantivos.get(i).getSub_port());
						}
					
					}
					
					break;
				case 2:
					System.out.println("digite o substantivo em português");
					sPr = l.next();
					for(int i=0; i < substantivos.size();i++) {
						if(substantivos.get(i).getSub_port().equalsIgnoreCase(sPr)) {
							System.out.println(substantivos.get(i).getSub_prin());
						}
											}
					
					break;
				}
				
				break;
			case 4:
				
				break;
			}
			
		}while(laco != 0);
		
		
		
		
		
	}

}
