package eu.senla.hw5.container;

public abstract class AContainer {

	protected int height;
	protected int diameter;
	protected short size;

	public abstract double calculateVolume( );
	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public short getSize() {
		return size;
	}

	public void setSize(short size) {
		this.size = size;
	}

}
