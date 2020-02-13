package tarea;

import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactureDate;

	public UsedProduct(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	

}
