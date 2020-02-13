package tarea;

public class ImportedProduct extends Product {
	
	private double customsFree;

	public ImportedProduct(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(double customsFree) {
		this.customsFree = customsFree;
	}



}
