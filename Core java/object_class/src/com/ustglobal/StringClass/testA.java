package com.ustglobal.StringClass;

public class testA {
	public static void main(String[] args) {
		
	
	String s1 ="priya";
	String s2 = "swathi";
	
	String s3 = new String ("priya");
	String s4= new String ("priya");
	String s5 = "priya";
	
    System.out.println(s1.equals(s2));
    System.out.println(s3.equals(s4));
    System.out.println(s1.equals(s5));	
    
    String str1=s1.toLowerCase();
    System.out.println(str1);
    String str2=s2.toUpperCase();
    System.out.println(str2);
    char c=s1.charAt(0);
    System.out.println(c);
    
    boolean b=s1.equalsIgnoreCase("PRIya");
    System.out.println(b);
    
    
    StringBuffer sb1 = new StringBuffer("priya");
    sb1.append("vikram");
    System.out.println(sb1);
    
    
	}	


}
