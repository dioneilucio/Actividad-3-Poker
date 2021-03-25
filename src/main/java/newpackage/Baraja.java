/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author dioneilucio
 */
import java.util.Stack;
import java.util.Scanner;

public class Baraja {
	
	
	static Stack<Carta> baraja = new Stack<Carta>();
	static estetica ds = new estetica();

	public static void main(String[] args){
		ds.titulo();
		menu();
		System.out.println("Programa finalizado correctamente");
		ds.credito();
	}
	
	public static void menu(){
		Scanner entrada = new Scanner(System.in);
		
		boolean salir = false;
		while (!salir){
			System.out.println("Que desea realizar?");
			System.out.println("1. Mezclar el Deck");
			System.out.println("2. Dar la vuelta a la ultima carta");
			System.out.println("3. Salir");
			int opcion = entrada.nextInt();
			
			switch (opcion){
			case 1:
				baraja();
				break;
			case 2:
				getCarta();
				break;
			case 3:
				if (confirma("salir")){
					salir = true;
				}
				break;
			default:
				System.out.println("La opcion escogida no es valida");
			}
			ds.limpiarln(25);
		}
	}
	
	public static void baraja(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantas cartas quieres barajar");
		int numCartas = entrada.nextInt();
		
		if (baraja.empty()){
			
			for (int i=0; i<numCartas; i++){
				nuevaCarta();
			}
		}	else	{
			baraja.clear();
			for (int i=0; i<numCartas; i++){
				nuevaCarta();
			}
		}
		System.out.println("Se mezclo el Deck con " + baraja.size() + " cartas");
	}
	
	public static void nuevaCarta(){
		
		int numC = random(1,10);
		int paloI = random(1,4);
		String paloC = null;
		
		
		switch (paloI){
		case 1:
			paloC = "Treboles";
			break;
		case 2:
			paloC = "Corazones";
			break;
		case 3:
			paloC = "Picas";
			break;
		case 4:
			paloC = "Diamantes";
			break;
		}
		
		
		baraja.push(new Carta(numC,paloC));
	}

	public static int random(int min, int max){
		
		int num = (int) (Math.random()*max+min);
		return num;
	}
	
	public static void getCarta(){
		
		ds.limpiarln(25);
	
		if (baraja.empty()){
			System.out.println("La baraja esta vacia, baraja de nuevo primero");
		}	else	{
			baraja.pop().mostrar();
		}
		
		System.out.println("Te quedan " + baraja.size() + " cartas en la baraja");
	}
	
	public static boolean confirma(String mensaje){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Estas seguro de que quieres " + mensaje);
		System.out.println("1. Si, quiero " + mensaje);
		System.out.println("2. No, no quiero " + mensaje);
		int seguro = entrada.nextInt();
		if (seguro == 1){
			return true;
		}	else	{
			System.out.println("Cancelado");
		}
		return false;		
	}
	
}
