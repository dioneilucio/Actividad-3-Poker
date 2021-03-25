Barajas Java

Programa en Java para barajar cartas y ver cual es la carta de arriba.
Los objetos Carta se alamcenan en un Stack facilitando la tarea de añadir cartas al final y ir quitando una a una
Funciones

    Barajar cartas (Añade una cantidad de cartas aleatorias al mazo)
    Levanta la ultima carta (La muestra y la descarta del mazo)

Metodos

    Metodo para generar una nueva carta aleatoria que la añade al mazo baraja

  public static void nuevaCarta(){
    //Obtenemos numeros aleatorios
    int numC = random(1,10);
    int paloI = random(1,4);
    String paloC = null;
		
    //Convertimos palo en String
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
		
    //Generamos la nueva carta en la baraja
    baraja.push(new Carta(numC,paloC));
  }

    Objeto Carta

public class Carta {

	//Variables
	int numero;
	String palo;
	estetica ds = new estetica();

	public Carta(int n, String p){
		numero = n;
		palo = p;
	}
	
	public void mostrar(){
		ds.limpiarlnSM("#",25);
		System.out.println("Numero: " + numero);
		System.out.println("Palo: " + palo);
		ds.limpiarlnSM("#",25);
	}
}

Ejemplo

-----Actividad 3 Cartas de Poker-----
-------------------------
Que desea realizar?
1. Mezclar el Deck
2. Dar la vuelta a la ultima carta
3. Salir
1
Cuantas cartas quieres barajar
52
Se mezclo el Deck con 52 cartas
-------------------------
Que desea realizar?
1. Mezclar el Deck
2. Dar la vuelta a la ultima carta
3. Salir
2
-------------------------
#########################
Numero: 6
Palo: Treboles
#########################
Te quedan 51 cartas en la baraja
-------------------------
Que desea realizar?
1. Mezclar el Deck
2. Dar la vuelta a la ultima carta
3. Salir
3
Estas seguro de que quieres salir
1. Si, quiero salir
2. No, no quiero salir
1
-------------------------
Programa finalizado correctamente
-------------------------
-----Dionei Lucio-----

Licencia

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
