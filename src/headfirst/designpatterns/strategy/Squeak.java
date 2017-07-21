package headfirst.designpatterns.strategy;

/**
 * 吱吱的叫声
 */
public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
