class Student
{

  
 static int stid = 100;
 static String stname= "Rama";
  static double stmarks=99.5;
  
  
  public static void getStudentInfo()
  {
	  
	    System.out.println("student id is: " + stid);
		System.out.println("student name is: " + stname);
		System.out.println("student marks are: " + stmarks);
	  
  }
public static void main (String[] args){
   getStudentInfo();
}
}