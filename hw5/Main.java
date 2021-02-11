package eu.senla.hw5;

import java.util.Iterator;

import eu.senla.hw5.container.AContainer;
import eu.senla.hw5.container.Cone;
import eu.senla.hw5.container.Cylinder;
import eu.senla.hw5.container.Square;
import eu.senla.hw5.deck.Deck;
import eu.senla.hw5.dock.Dock;
import eu.senla.hw5.ship.Ship;

public class Main {

	public static void main(String[] args) {
		Dock dock = new Dock();
		Ship[] ships = new Ship[10];
		dock.setShips(ships);

		Ship ship1 = new Ship();
		Deck[] decksOfShip1 = new Deck[2];
		ship1.setDecks(decksOfShip1);

		Deck deck1OfShip1 = new Deck();
		AContainer[] containersOfdeck1OfShip1 = new AContainer[4];
		deck1OfShip1.setContainers(containersOfdeck1OfShip1);
		decksOfShip1[0] = deck1OfShip1;

		AContainer cone = new Cone(20, 50, (short) 1);
		AContainer cylinder = new Cylinder(20, 50, (short) 1);
		AContainer square = new Square(20, 50, (short) 1);
		deck1OfShip1.put(cone);
		deck1OfShip1.put(cylinder);
		deck1OfShip1.put(square);
		int shipCont = 0;
		for (int i = 0; i < dock.getShips().length; i++) {
			Ship ship = dock.getShips()[i];
			if (ship != null) {
				shipCont++;
				for (int j = 0; j < ship.getDecks().length; j++) {
					if (ship.getDecks()[j] != null) {
						Deck deck = ship.getDecks()[j];
						for (int k = 0; k < deck.getContainers().length; k++) {
							if (deck.getContainers()[k] != null) {
								

								System.out.println(deck.getContainers()[k].calculateVolume());
							}
						}

					}
				}

			}

		}
	}

}
