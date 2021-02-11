package eu.senla.hw5.container;

public class Cone extends AContainer {

	public Cone(int diameter, int height, short size) {
		this.diameter=diameter;
		this. height=height;
		this.size=size;
		 
	}

	@Override
	public double calculateVolume( ) {
		return this.height / 3 * Math.pow(this.diameter / 2, 2) * Math.PI;
	}

}
