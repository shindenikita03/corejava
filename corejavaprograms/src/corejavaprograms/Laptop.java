package corejavaprograms;

class Laptop
{
int ramSize = 8;
double Price = 60000.25;
String Company= "ASUS";
boolean isGraphicsEnabled = true;

void display ()
{
System.out.println ("DISPLAY PICTURE");
}

public static void main (String[] args){

Laptop obj = new Laptop();

System.out.println ("RAM SIZE:" + obj.ramSize);
System.out.println ("PRICE:" + obj.Price);
System.out.println ("COMPNAY:" + obj.Company );
System.out.println ("IS GRAPHICS ENABLED:" + obj.isGraphicsEnabled);

obj.display();
}
}


