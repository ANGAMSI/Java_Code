package com.practice.ipod;
/**
 * 
 * @author SivaSankar
 *
 */
public class Inventory {

	private String countryName;
	private int numberOfunits;
	private int price;
	private int exportPricePerTenUnit;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getNumberOfunits() {
		return numberOfunits;
	}
	public void setNumberOfunits(int numberOfunits) {
		this.numberOfunits = numberOfunits;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getExportPricePerTenUnit() {
		return exportPricePerTenUnit;
	}
	public void setExportPricePerTenUnit(int exportPricePerTenUnit) {
		this.exportPricePerTenUnit = exportPricePerTenUnit;
	}
}
