import java.util.*;
public class primitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DEF INPUT
		Scanner input= new Scanner(System.in);
		//DEFINICIONES
		int[] prOK = {3, 10, 14, 16, 28, 35};
		int aciertos=0;
		int comp=34; 
		int reint=3;
		int reintOK = 0;
		int [] prTRY = new int[6]; 
		int reintTRY=0;
		int compTRY=0;
		
		//FIN DEFINICIONES
		//START MONDONGO
		for (int i=0; i<6; i++) {
			System.out.println("Introduce un número");
			prTRY[i] = input.nextInt();
			while (prTRY[i]>49 ||prTRY[i]<1) {
				System.out.println("Has introducido un número incorrecto, vuelve a intentarlo.");
				prTRY[i] = input.nextInt();
			}	
		}
		//COMPLEMENTARIO
		while (compTRY<49 ||compTRY>1) {
			System.out.println("Ahora introduce el complementario.");
			comp = input.nextInt();
				if (compTRY>49||compTRY<1)
					System.out.println("Vuelve a intentarlo.");
					compTRY = input.nextInt();
				if(compTRY == comp) {
				aciertos++;
			}
		}
		//REINTEGRO
		while (reintTRY>9 ||reintTRY<1) {
			System.out.println("Ahora el reintegro.");
			reint = input.nextInt();
			reintOK++;
				if (reint<9||reint>1)
				System.out.println("Vuelve a intentarlo.");
				reint = input.nextInt();
				
		}
		
		//COMPROBAR ACIERTOS
		for (int j=0; j<6; j++ ) {
			for (int i=0 ;i<6 ; i++ ) {
			if(prOK[j] == prTRY[i]) {
				aciertos++;
			}
		}
		}
		System.out.println("ACIERTOS: "+ aciertos+ "");        
				input.close();
	}//FIN CLASE
	
}//FIN ALGORITMO