package com.problem.calculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.problem.main.Item;
import com.problem.util.SalesTaxConstants;
import com.problem.util.SalesTaxUtils;
/**
 * 
 * @author SivaSankar
 *
 */
public class SalesTaxCalculator {
	/**
	 * 
	 * @param item
	 * @return
	 */
	public static void calculateTaxAmountPerItem(List<Item> listOfProducts){
		
		double salesTax = 0.00;
		double totalAmount = 0.00;
		Map<String, Double> itemSummaryMap = new HashMap<>();
		for(Item item:listOfProducts){
			double itemPriceWithTaxCalculation = 0.00;
			double itemPrice = item.getPrice();
			boolean imported = item.isImported();
			String itemName = item.getProductName();
			if(item.getCategoryName().equalsIgnoreCase(SalesTaxConstants.CATEGORY_BOOKS) 
					|| item.getCategoryName().equalsIgnoreCase(SalesTaxConstants.CATEGORY_FOOD)){
				if(imported){
					salesTax = salesTax+((itemPrice*5)/100);
					itemPriceWithTaxCalculation = itemPrice + ((itemPrice*5)/100);
				}else{
					itemPriceWithTaxCalculation = itemPrice;
				}
			}else{
				if(imported){
					salesTax = salesTax+((itemPrice*15)/100);
					itemPriceWithTaxCalculation = itemPrice + ((itemPrice*15)/100);
				}else{
					salesTax = salesTax+((itemPrice*10)/100);
					itemPriceWithTaxCalculation = itemPrice + ((itemPrice*10)/100);
				}
			}
			totalAmount = totalAmount + itemPriceWithTaxCalculation;
			itemSummaryMap.put(itemName, itemPriceWithTaxCalculation);
		}
		SalesTaxUtils.printSummary(itemSummaryMap, salesTax,totalAmount);
	}
	
}
