package com.kprit.tns.oops;

public class InheritanceDemo {
	public void eat() {
		System.out.println("Eating to be healthy");
		
	}
	public void sounds(){
		System.out.println("The DOg  barks");
		
	}
}
class Cow extends InheritanceDemo {
	public void sounds() {
		System.out.println("The cow says moh moh");
	}

}
