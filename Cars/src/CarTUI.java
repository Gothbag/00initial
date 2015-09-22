import java.util.Scanner;


public class CarTUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car c = new Car();
		System.out.println("Type in the make of the car, please.");
		c.setMake(sc.nextLine());
		System.out.println("Insert the model of the car, please.");
		c.setModel(sc.nextLine());
		System.out.println("Write the number of cylinders in the car, please");
		c.setNCylinders(sc.nextInt());
		System.out.println("Type in the car's engine displacement, please");
		c.setNCylinders(sc.nextInt());
		c.calcFiscalHorsepower();
		System.out.println("The " + c.getMake() + " " + c.getModel() + " has a fiscal horsepower of " + String.valueOf(c.getFiscalHorsepower()) + ".");
		sc.close();
	}

}
