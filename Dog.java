

interface Running{
	void ShowRun();
		
	
}
interface Swimming{
	void ShowSwim();
}


public class Dog extends Animal implements Running, Swimming{
protected String name;
private double height;

public Dog(String Specia,int age, Double weight,String name,double height) {
	super(Specia,age,weight);
	this.name=name;
	this.height=height;
}
@Override
public String toString() {
	return "Dog [name=" + name + ", height=" + height + "]";
}
@Override
public void ShowRun() {
	System.out.println(name +" is running");
}
@Override
public void ShowSwim() {
	System.out.println(name + " is swimming");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}

}
