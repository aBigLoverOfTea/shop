package shop;

public class Product {
	private long id, count;
	private String name, manufacturer;
	private float price;
	private bool isAvaliable;

	public Product(long id, long count, String name, String manufacturer, flaot price, bool isAvaliable) {
		this.id = id; this.count = count;
		this.name = name; this.manufacturer = manufacturer;
		this.price = price;
		this.isAvaliable = isAvaliable == 1 ? true : false; /* somewhy in my db I can't create a bool field, 
															so i created short field */
	}

	public get(String param) {
		switch (param) {
			case "id":
				return this.id;
				break;
			case "count":
				return this.count;
				break;
			case "name":
				return this.name;
				break;
			case "manufacturer":
				return this.manufacturer;
				break;
			case "price":
				return this.price;
				break;
			case "isAvaliable":
				return this.isAvaliable;
				break;
		} // Just because I don't want write quadrillion getters
	}
	public set(String param, Object value) {
		switch (param) {
			case "count":
				this.count = (long) value;
				break
			case "isAvaliable":
				this.isAvaliable = (boolean) value;
		}
	}
}