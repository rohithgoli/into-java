package com.rrk.oopsVisited;

public class CustomerRunner {
	public static void main(String[] args) {
		
		Address homeAddress = new Address("Lane 14", "Aerocity", "400242");
		Customer customer = new Customer("Raju", homeAddress);
		
		Address workAddress = new Address("sector 35", "Tech park city", "400234");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
		System.out.println(customer.getHomeAddress());
		System.out.println(customer.getWorkAddress());
	}
}
