package corejavaprograms;

public class Car {
	String make;
    String model;
    int year;
    public Car(String carMake, String carModel, int carYear) {
    	make = carMake;
    	model = carModel;
    	year = carYear;
    	
    }
    
    void display ()
    {
    System.out.println ("CAR INFO");
    }

    public static void main (String[] args){

    Car obj = new Car("BMW", "AUSTIN MINI", 1998);

    System.out.println ("CAR MAKE:" + obj.make);
    System.out.println ("CAR MODEL:" + obj.model);
    System.out.println ("CAR YEAR:" + obj.year );

    obj.display();
    }
    }



 
