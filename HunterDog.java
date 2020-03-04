import java.util.Comparator;

interface Hunt{
	void ShowHunt();
	
}

public class HunterDog extends Dog implements Hunt, Comparator<Object>  {
	private double Speed;
	private String prey;

public HunterDog(String Specia, Integer age, Double weight, String name, double height,double Speed,String prey) {
		super(Specia, age, weight, name, height);
		this.Speed=Speed;
		this.prey = prey;
		// TODO Auto-generated constructor stub
	}

public void ShowHunt() {
	System.out.println(name +" is hunting on "+prey);
}

public int compareTo(HomeDog charli){
    
    return getAge().compareTo(charli.getAge());
}

public double getSpeed() {
	return Speed;
}

public void setSpeed(double speed) {
	Speed = speed;
}

public String getPray() {
	return prey;
}

public void setPray(String pray) {
	this.prey = pray;
}

@Override
public String toString() {
	return "HunterDog [Speed=" + Speed + ", pray=" + prey + ", getName()="
			+ getName() + ", getHeight()=" + getHeight() + ", getSpecia()=" + getSpecia() + ", getAge()=" + getAge()
			+ ", getWeight()=" + getWeight() + "]";
}

@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	 return ((Animal) o1).getAge().compareTo(((Animal) o2).getAge());
}


}
