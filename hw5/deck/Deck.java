package eu.senla.hw5.deck;

import eu.senla.hw5.container.AContainer;

public class Deck {

	private AContainer[] containers;

	public AContainer[] getContainers() {
		return containers;
	}

	public void setContainers(AContainer[] containers) {
		this.containers = containers;
	}

	public void put(AContainer container) {
		for (int i = 0; i < containers.length; i++) {
			if (containers[i] == null) {
				containers[i]=container;
				return;
			}//добавить проверку на рамер ече if
		}

	}

}
