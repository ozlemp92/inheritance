package com.ozlem.inheritance;
// override etme :)
	class inheritance {
		  public void Class1() {
		    System.out.println("sdfsdfsdf");
		  }
		}

		class Pig extends inheritance {
		  public void Class1() {
			  System.out.println("435gghyt");
		  }
		}

		class Dog extends inheritance {
		  public void Class1() {
			  System.out.println("rttrrt");
		  }
		}

		class MyMainClass {
		  public static void main(String[] args) {
			  inheritance Class1 = new inheritance();
			  inheritance met1 = new Pig();
			  inheritance met2 = new Dog();
		        
			  Class1.Class1();
			  met1.Class1();
			  met2.Class1();
		  }
		}

