package test;

//abstract parent class
abstract class Person{ 
//abstract method
public abstract void myJob();

void show()
{
	System.out.println("suhcjh");}

}
//Teacher class extending Person class
class Teacher extends Person {
	
	void input()
	{}
public void myJob(){
	System.out.println("My job is Teaching");

}



}

//Painter class extending Person class
 class Painter extends Person {
public  void myJob(){
	System.out.println("My job is Painting");
        }}





public class abstractdemo {
	public static void main(String args[]){
		Person obj,obj1;
		obj = new Teacher();
		obj.myJob();
		obj1 = new Painter();
		obj1.myJob();
		
		}


}

