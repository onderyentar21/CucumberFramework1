package com.neotech.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps extends CommonMethods {

	@When("I login to the HRMS")
	public void i_login_to_the_hrms() {
		System.out.println("login ");

	}

	@When("I want to add Employeee")
	public void i_want_to_add_employeee(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		// throw new io.cucumber.java.PendingException();

		/*
		 * Map<String, String> map1 = new HashMap<>(); map1.put("FN", "Onder");
		 * map1.put("MN", "Yentar"); map1.put("LN", "Ali");
		 * 
		 * Map<String, String> map2 = new HashMap<>(); map2.put("FN", "Emre");
		 * map2.put("MN", "Cinar"); map2.put("LN", "abbbak");
		 * 
		 * 
		 * Map<String, String> map3 = new HashMap<>(); map3.put("FN", "Cınar");
		 * map3.put("MN", "Boss"); map3.put("LN", "cink"); List<Map<String, String>> lm
		 * = new ArrayList<>(); lm.add(map3); lm.add(map2); lm.add(map1);
		 */

		// getting data from the incomeing dataTable
		List<Map<String, String>> listofMAp = dataTable.asMaps();
		for (Map<String, String> map : listofMAp) {
			System.out.println(map);
			System.out.println("--------------------------------");
			System.out.println("First name: " + map.get("FirstName"));
			System.out.println("Middle name : " + map.get("MiddleName"));
			System.out.println("Last name . " + map.get("LastNamle"));

		}

	}

	@Then("I validate employee is added")
	public void i_validate_employee_is_added() {
		System.out.println("added");

	}

}
