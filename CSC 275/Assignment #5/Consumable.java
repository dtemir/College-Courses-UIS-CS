package Assignments;

public class Consumable extends Item {
	private int quality;
	private Boolean healthy;
	private String brand;

	public Consumable(String name, Double weight, int value, int iD, int durability, int quality, Boolean healthy,
			String brand) {
		super(name, weight, value, iD, durability);
		this.brand = brand;
		this.healthy = healthy;
		this.quality = quality;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public Boolean getHealthy() {
		return healthy;
	}

	public void setHealthy(Boolean healthy) {
		this.healthy = healthy;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String toString() {
		return String.format("%-15s%-20s%-20s%-20s%-10s%-20s%-15s%-15s%-15s", "Consumable - ", "Name: " + getName(),
				"Weight: " + getWeight(), "Value: " + getValue(), "ID: " + getID(), "Durability: " + getDurability(),
				"Quality: " + getQuality(), "Healthy: " + getHealthy(), "Brand: " + getBrand());
		//return "Consumable - \tName:" + getName() + "\tWeight:" + getWeight() + "\tValue:" + getValue() + "\tID:"
			//	+ getID() + "\tDurability:" + getDurability() + "\tQuality:" + getQuality() + "\tHealthy:" + getHealthy() + "\tBrand:" + getBrand();
	}

}
