package com.problem.main;

import java.util.List;

import com.problem.calculator.SalesTaxCalculator;
import com.problem.util.SalesTaxUtils;
/**
 * 
 * @author SivaSankar
 *
 */
public class SalesTax {

	public static void main(String[] args) {
		List<Item> listOfProducts = SalesTaxUtils.getListOfProducts();
		SalesTaxCalculator.calculateTaxAmountPerItem(listOfProducts);
	}

}
