package apustuak;
import java.util.Scanner;
public class primitiva {

	public static void main(String[] args) {
		//Iniciar el Scanner
		Scanner leer = new Scanner(System.in);

		// Aqui vamos a hacer el switch para poder escoger entre los 3 programas
		
		
		//Declarar las variables
		int comprobarpremiado, comprobarintento, contadordeacertados,comprobarcomodin,comprobarreintegro,contadorparaguardarlosacertados;
		int [] intentos;
		int [] numerosacertados;
		int premiado[] = {03,10,14,16,28,35};
		int comodin = 34;
		int reintegro = 3;
		
		//Inicializar las variables
		intentos = new int[6];
		contadordeacertados = 0;
		contadorparaguardarlosacertados = 0;
	
		
		//Numero de intentos
		for(int i=0; i<6;i++) {
			System.out.println("Introduce el " + (i+1) + " numero");
			intentos[i] = leer.nextInt();

			while(intentos[i] > 100 || intentos[i] < 0){
				System.out.println("El numero introducido no es valido: " + intentos[i]);
				System.out.println("-----------------------------------------------------");
				System.out.println("Introduce nuevamente el " + (i+1) + " numero");
				intentos[i] = leer.nextInt();
			}//EndWhile

				// Comprobar si el numero introducido es igual q el anterior
				for(int j=0;j<=i-1;j++) {
					// Vamos a comprobar que el numero introducido esta dentro del margen que nosotros queremos
					while(intentos[i] == intentos[j]){
						System.out.println("El numero introducido ya esta repetido " + intentos[j]);
						System.out.println("--------------------------------------------------------------------");
						System.out.println("Introduzca nuevamente el " + (i+1) + " numero");
						intentos[i] = leer.nextInt();
							// Vamos a comprobar que el numero introducido esta dentro del margen que nosotros queremos
							while(intentos[i] > 100 || intentos[i] < 0){
								System.out.println("El numero introducido no es valido: " + intentos[i]);
								System.out.println("-----------------------------------------------------");
								System.out.println("Introduce nuevamente el " + (i+1) + " numero");
								intentos[i] = leer.nextInt();
							}//EndWhile
							// Comprobar si el numero introducido es igual q el anterior
							for(int k=0;k<=i-1;k++){
								while(intentos[i] == intentos[k]){
									System.out.println("El numero introducido ya esta repetido " + intentos[k]);
									System.out.println("--------------------------------------------------------------------");
									System.out.println("Introduzca nuevamente el " + (i+1) + " numero");
									intentos[i] = leer.nextInt();
										// Vamos a comprobar que el numero introducido esta dentro del margen que nosotros queremos
										while(intentos[i] > 100 || intentos[i] < 0){
											System.out.println("El numero introducido no es valido: " + intentos[i]);
											System.out.println("-----------------------------------------------------");
											System.out.println("Introduce nuevamente el " + (i+1) + " numero");
											intentos[i] = leer.nextInt();
										}//EndWhile

								}//endWhile

							}//endFor

					}//endWhile
	
				}//endFor
		}//endFor



		//Vamos a comprobar si algun numero introducido coincide con el premiado

		for(int i =0; i<6;i++){
			comprobarpremiado = premiado[i];
			for(int j=0;j<6;j++){
				comprobarintento = intentos[j];
				if(comprobarpremiado == comprobarintento){
					contadordeacertados = contadordeacertados +1;
				}//EndIf
			}//Endfor
		}//EnfFor


		
		// Vamos a sacar un array en el que se guardaran los numeros que hemos acertado y luego nos lo imprimira
		numerosacertados = new int[contadordeacertados];

		for(int i=0;i<6;i++){
			comprobarpremiado = premiado[i];
			for(int j=0;j<6;j++){
				comprobarintento = intentos[j];
				if(comprobarpremiado == comprobarintento){
					numerosacertados[contadorparaguardarlosacertados] = comprobarintento;
					contadorparaguardarlosacertados++;
				}
			}//endFor
		}//endFor
		 



		//Vamos a pedirle al usuario que meta el numero del comodin

		System.out.println("Introduce el numero de comodin que desea del 0-50");
		comprobarcomodin = leer.nextInt();

		while (comprobarcomodin >50 || comprobarcomodin < 0) {
			System.out.println("El numero de comodin introducido no es valido: " + comprobarcomodin + " introduzca nuevamente un numero: ");
			comprobarcomodin = leer.nextInt();
		}//EndWhile

		
		//Vamos a pedirle al usuario que meta el numero del reintegro

		System.out.println("Introduce el numero de reintegro que desea del 0-10");
		comprobarreintegro = leer.nextInt();

		while (comprobarreintegro >10 || comprobarreintegro < 0) {
			System.out.println("El numero de reintegro introducido no es valido: " + comprobarreintegro + " introduzca nuevamente un numero: ");
			comprobarreintegro = leer.nextInt();
		}//EndWhile
		
		// Aqui vamos a imprimir los numeros de la loteria premiados
		System.out.print("Los numeros de la primitiva premiados son los siguientes: ");
		for(int i=0;i<premiado.length;i++) {
			System.out.print(premiado[i]);
			if(i != premiado.length-1) {
				System.out.print(", ");
			}else{
				System.out.print(" ");
				System.out.println();
			}//endIF
		}//enfFOR


		// Aqui vamos a imprimir el resultado de lo anterior y si el contador es igual a 6 significa que hemos acertado todos los numeros
		if(contadordeacertados == 6){
			System.out.println("ZORIONAK!!!!! zenbaki guztiak asmatu dituzu");
		}else{
			System.out.print("Ez dituzu zenbaki guztiak asmatu " + contadordeacertados + " zembaki baizik eta zure saiakerak hurrengoak dira: ");
			for(int i =0;i<intentos.length;i++) {
				System.out.print(intentos[i]);
				if(i != intentos.length-1) {
					System.out.print(", ");
				}else{
					System.out.print(" ");
					System.out.println();
				}//endIF
			}//endFor
		}//EndIf
		
		//Vamos a decirle al usuario cuales son los numeros que a acertado
		if(numerosacertados.length != 0){
			System.out.print("Los numeros que as acertado son los siguientes: ");
			for(int i =0;i<numerosacertados.length;i++){
				System.out.print(numerosacertados[i]);
				if(i == numerosacertados.length-1){
					System.out.print(". ");
					System.out.println();
				}else{
					System.out.print(", ");
				}//endIF
				
		}//endFor	
		}else{
			System.out.println("No as acertado ningun numero :(");
		}//endIF

		 


		//Vamos a comprobar si el comodin que a metido el usuario es el premiado

		if(comodin == comprobarcomodin){
			System.out.println("ZORIONAK!!!! comodin zembakia asmatu duzu " + comodin);
		}else{
			System.out.println("Ez duzu comodin zembakia asmatu " + comprobarcomodin);
		}//EndIF

		//Vamos a comprobar si el reintegro que a metido el usuario es el premiado

		if(reintegro == comprobarreintegro){
			System.out.println("ZORIONAK!!!! reintegro zembakia asmatu duzu " + reintegro);
		}else{
			System.out.println("Ez duzu reintegro zembakia asmatu " + comprobarreintegro);
		}//EndIF
	
		leer.close();
		
	}//EndMain

}//EndClass