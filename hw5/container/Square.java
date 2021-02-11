package eu.senla.hw5.container;

public class Square extends AContainer {

	public Square(int diameter, int height, short size) {
		 
	}

	public double calculateVolume( ) {

		return Math.pow(   Math.sqrt(Math.pow(this.diameter, 2)/2) , 3);
		

	}

}
