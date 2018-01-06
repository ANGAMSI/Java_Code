package com.practice.ipod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author SivaSankar
 *
 */
public class InventoryUtils {

	/**
	 * 
	 * @return list of country inventory list
	 */
	public static List<Inventory> getInventoryDetailsByCountry(){
		
		List<Inventory> inventoryList = new ArrayList<Inventory>();
		
		Inventory countryA = new Inventory();
		countryA.setCountryName("brazil");
		countryA.setNumberOfunits(InventoryConstants.numberOfIpodPerCountry);
		countryA.setPrice(100);
		countryA.setExportPricePerTenUnit(400);
		
		inventoryList.add(countryA);
		
		Inventory countryB = new Inventory();
		countryB.setCountryName("Argentina");
		countryB.setNumberOfunits(InventoryConstants.numberOfIpodPerCountry);
		countryB.setPrice(50);
		countryB.setExportPricePerTenUnit(400);
		
		inventoryList.add(countryB);
		
		return inventoryList;
	}
	/**
	 * 
	 * @param inventoryList have details above product on each country
	 */
	public static void displayInventorySummayByCountry(List<Inventory> inventoryList){
		
		System.out.println("INVENTORY STOCk DETAILS BY COUNTRY");
		for(Inventory inventory:inventoryList){
			System.out.println("Country Name:"+inventory.getCountryName());
			System.out.println("Price:"+inventory.getPrice());
			System.out.println("Number of units:"+inventory.getNumberOfunits());
			System.out.println("Export Price Per 10 Unit from One to Anther Countr:"+inventory.getExportPricePerTenUnit()+"\n");
		}
		
	}
	/**
	 * 
	 * @return number of product which is enter by user
	 */
	public static int displayOptionsToSelectProduct(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number Of Products");
		int numberOfProducts = scanner.nextInt();
		
		return numberOfProducts;
	
	}
	/**
	 * 
	 * @return options which is selected by user
	 */
	public static int displayOptionsToSelectCountry(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Country");
		System.out.println("1.Brazil");
		System.out.println("2.Argentina");
		int countrySelection = scanner.nextInt();
		int country = 0;
		switch(countrySelection){
			case 1:
				country = 1;
				break;
			case 2:
				country = 2;
				break;
		}
		
		return country;
	
	}
	/**
	 * 
	 * @param inventoryList have details about product based on country
	 * @param numberOfProducts entered by the user
	 * @param countrySelection country is selected by the user
	 */
	public static void displaySummayByCountry(List<Inventory> inventoryList,int numberOfProducts,int countrySelection){
		
		int totalAmountInSameCountry = 0;
		int totalAmountInDiffCountry = 0;
		for(Inventory inventory:inventoryList){
			if(countrySelection == 1){
				if(inventory.getCountryName().equals("brazil")){
					if(numberOfProducts<=100){
						totalAmountInSameCountry = numberOfProducts * inventory.getPrice();
						System.out.println("Total Price in Your country:"+totalAmountInSameCountry);
					}
				}else{
					if(numberOfProducts<=100){
						int exportCharges =  numberOfProducts * ( inventory.getExportPricePerTenUnit() / 10);
						totalAmountInDiffCountry = numberOfProducts * inventory.getPrice() + exportCharges;
						System.out.println("Total Price in other country(Icludes import charges):"+totalAmountInDiffCountry);
					}
				}
			}
			if(countrySelection == 2){
				if(inventory.getCountryName().equals("Argentina")){
					if(numberOfProducts<=100){
						totalAmountInSameCountry = numberOfProducts + inventory.getPrice();
						System.out.println("Total Price in Your country:"+totalAmountInSameCountry);
					}
				}else{
					if(numberOfProducts<=100){
						int exportCharges = numberOfProducts * ( inventory.getExportPricePerTenUnit() / 10);
						totalAmountInDiffCountry = numberOfProducts * inventory.getPrice() + exportCharges;
						System.out.println("Total Price in other country (Icludes import charges):"+totalAmountInDiffCountry);
					}
				}
			}
		}
		
	}
}
