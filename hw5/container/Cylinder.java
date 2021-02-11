package eu.senla.hw5.container;



public class Cylinder extends AContainer {

	public Cylinder(int diameter, int height, short size) {
		this.diameter=diameter;
		this. height=height;
		this.size=size;
	}

	public double calculateVolume() {

		return this.height * (this.diameter / 2);
	}
	

}
