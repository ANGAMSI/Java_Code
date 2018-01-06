package com.problem.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.problem.main.Item;
/**
 * 
 * @author SivaSankar
 *
 */
public class SalesTaxUtils {

	/**
	 * 
	 * @return
	 */
	public static List<Item> getListOfProducts(){
		
		List<Item> listOfProducts = new ArrayList<Item>();
		//input 1:
		listOfProducts.add(addItem("1 book at", 12.49, "books",false));
		listOfProducts.add(addItem("1 music CD", 14.99, "good",false));
		listOfProducts.add(addItem("1 Chocolate Bar",0.85, "food",false));
		
		return listOfProducts;
		
	}
	/**
	 * 
	 * @param productName
	 * @param price
	 * @param categoryName
	 * @param imported
	 * @return
	 */
	private static Item addItem(String productName,double price,String categoryName,boolean imported){
		
		Item item = new Item();
		item.setProductName(productName);
		item.setPrice(price);
		item.setCategoryName(categoryName);
		item.setImported(imported);
		return item;
	}
	
	/**
	 * 
	 * @param itemSummary
	 * @param salesTax
	 */
	public static void printSummary(Map<String, Double> itemSummary,double salesTax,double totalAmount){
		
		for(Map.Entry<String, Double> mapEntry:itemSummary.entrySet()){
			System.out.println(mapEntry.getKey()+":"+mapEntry.getValue());
		}
		System.out.println("Sales Tax:"+Math.abs(salesTax));
		System.out.println("Total AMount:"+Math.abs(totalAmount));
		
	}
}
