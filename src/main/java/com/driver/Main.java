package com.driver;

public class Main {
  public static void main(String[] args) {
	  B obj = new B();
	  System.out.println(obj.meth());
	  
	  B obj2 = new B();
	  System.out.print(obj2.meth());
	  
  }
  
  public static class A{
	  public String meth() {
		  return "Invoking method from class A";
	  }
  }
  
  public static class B{
	  public String meth() {
		  return "Method is overridden in Extendend class B";
	  }
  }
  
}