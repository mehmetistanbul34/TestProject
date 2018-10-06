package com.cakmak.livedict;


import com.cakmak.livedict.model.Address;
import com.cakmak.livedict.model.User;

public class Main {
	
	public static void main(String[] args) {
		User user1 = new User();
		Address address1 = new Address();
		address1.setMahalle("Þifa Mahallesi");
		address1.setPostaCode(34950);
		address1.setCadde("inönü caddes");
		address1.setSokak("3619.sokak");
		address1.setApartmanName("kiptaþ konutlarý");
		user1.setAddress(address1);
		user1.setName("Mehmet");
		user1.setSurname("Cakmak");
		user1.setTc("12345678999");
		user1.setEmail("tr.mehmetcakmak@gmail.com");
		user1.setUsername("mehmetcakmak34");
		user1.setPassword("123456789");
		
		System.out.println("User Email= "+ user1.getEmail());
		System.out.println("User Sokak = "+ user1.getAddress().getSokak());
	
	    String str = user1.toString();
	    System.out.println("Strrrrr : "+str);
	
	}
	
}

