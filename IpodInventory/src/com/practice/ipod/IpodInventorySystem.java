package com.practice.ipod;

import java.util.List;

/**
 * 
 * @author SivaSankar
 *
 */
public class IpodInventorySystem {

	public static void main(String[] args) {
		
		//get InventoryList By Country
		List<Inventory> inventoryList = InventoryUtils.getInventoryDetailsByCountry();
		
		if(inventoryList.size() > 0){
			//Display Inventory Details
			InventoryUtils.displayInventorySummayByCountry(inventoryList);
			//Give option to enter number of product to the user
			int numberOfProduct = InventoryUtils.displayOptionsToSelectProduct();
			//Give option to select country where user live
			int countrySelect = InventoryUtils.displayOptionsToSelectCountry();
			//Calulate and displays sumary
			InventoryUtils.displaySummayByCountry(inventoryList,numberOfProduct,countrySelect);
		}/*end if*/
		
		
	}

}
