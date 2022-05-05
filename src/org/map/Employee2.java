package org.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Employee2 {
	public static void main(String[] args) {
	employee e=new employee();
	e.setEmpid(0);
	e.setName("harish");
	e.setPhone(123456l);
	e.setAddress("303 west street");
	e.setDob(12345);
	e.setDoj(87654);
	e.setEmail("selvaharish1@");
	e.setGender('m');
	e.setSalary(12345.234f);
	
	employee e1=new employee();
	e1.setEmpid(1);
	e1.setName("subSH");
	e1.setPhone(123456l);
	e1.setAddress("303 west street");
	e1.setDob(12345);
	e1.setDoj(87654);
	e1.setEmail("selvaharish1@");
	e1.setGender('m');
	e1.setSalary(12345.234f);
	
	
	
	employee e2=new employee();
	e2.setEmpid(1);
	e2.setName("hari");
	e2.setPhone(123456l);
	e2.setAddress("303 west street");
	e2.setDob(12345);
	e2.setDoj(87654);
	e2.setEmail("selvaharish1@");
	e2.setGender('m');
	e2.setSalary(12345.234f);
	
	
	
	employee e3=new employee();
	e3.setEmpid(3);
	e3.setName("san");
	e3.setPhone(123456l);
	e3.setAddress("303 west street");
	e3.setDob(12345);
	e3.setDoj(87654);
	e3.setEmail("selvaharish1@");
	e3.setGender('m');
	e3.setSalary(12345.234f);
	
	employee e4=new employee();
	e4.setEmpid(4);
	e4.setName("hari");
	e4.setPhone(123456l);
	e4.setAddress("303 west street");
	e4.setDob(12345);
	e4.setDoj(87654);
	e4.setEmail("selvaharish1@");
	e4.setGender('m');
	e4.setSalary(12345.234f);
	
	
	employee e5=new employee();
	e5.setEmpid(5);
	e5.setName("hari");
	e5.setPhone(123456l);
	e5.setAddress("303 west street");
	e5.setDob(12345);
	e5.setDoj(87654);
	e5.setEmail("selvaharish1@");
	e5.setGender('m');
	e5.setSalary(12345.234f);
	
	
	employee e6=new employee();
	e6.setEmpid(6);
	e6.setName("mani");
	e6.setPhone(123456l);
	e6.setAddress("303 west street");
	e6.setDob(12345);
	e6.setDoj(87654);
	e6.setEmail("selvaharish1@");
	e6.setGender('m');
	e6.setSalary(12345.234f);
	
	
	employee e7=new employee();
	e7.setEmpid(7);
	e7.setName("ganesh");
	e7.setPhone(123456l);
	e7.setAddress("303 west street");
	e7.setDob(12345);
	e7.setDoj(87654);
	e7.setEmail("selvaharish1@");
	e7.setGender('m');
	e7.setSalary(12345.234f);
	
	
	employee e8=new employee();
	e8.setEmpid(8);
	e8.setName("ram");
	e8.setPhone(123456l);
	e8.setAddress("303 west street");
	e8.setDob(12345);
	e8.setDoj(87654);
	e8.setEmail("selvaharish1@");
	e8.setGender('m');
	e8.setSalary(12345.234f);
	
	
	employee e9=new employee();
	e9.setEmpid(9);
	e9.setName("harish");
	e9.setPhone(123456l);
	e9.setAddress("303 west street");
	e9.setDob(12345);
	e9.setDoj(87654);
	e9.setEmail("selvaharish1@");
	e9.setGender('m');
	e9.setSalary(12345.234f);
	Map<Integer,employee> mp=new HashMap<>();
	mp.put(1, e);
	mp.put(2, e1);
	mp.put(3, e2);
	mp.put(4, e3);
	mp.put(5, e4);
	mp.put(6, e5);
	mp.put(7, e6);
	mp.put(8, e7);
	mp.put(9, e8);
	mp.put(10, e9);

	Set<Entry<Integer, employee>> entrySet = mp.entrySet();
	for (Entry<Integer, employee> m : entrySet) {
		System.out.println(m.getKey());
		System.out.println("empid="+m.getValue().getEmpid());
		System.out.println("name="+m.getValue().getName());
		System.out.println("phone="+m.getValue().getPhone());
		System.out.println("adress="+m.getValue().getAddress());
		System.out.println("dob="+m.getValue().getDob());
		System.out.println("doj="+m.getValue().getDoj());
		System.out.println("email="+m.getValue().getEmail());
		System.out.println("gender="+m.getValue().getGender());
		System.out.println("salary="+m.getValue().getSalary());
	
		
		
	}
	
	
	
	
	
		
	}

}
