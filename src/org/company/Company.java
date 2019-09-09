package org.company;

import org.client.Client;

public class Company extends Client{
	public void companyName() {
		System.out.println("Greens");
		
	}

	public static void main(String[] args) {
		System.out.println("Hello");
Company c=new Company();
c.companyName();
c.clientName();
	}

}
