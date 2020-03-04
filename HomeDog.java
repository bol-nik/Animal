import java.util.Arrays;
import java.util.Comparator;


interface Eat{
	void ShowEat();
	
}
public class HomeDog extends Dog implements Eat, Comparator {
	private String color;
	private String[] wool; 
	

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String[] getWool() {
		return wool;
	}
	public void setWool(String[] wool) {
		this.wool = wool;
	}
	public int compareTo(HunterDog p){
	    
	    return getAge().compareTo(p.getAge());
	}
	
	
	@Override
	public String toString() {
		return "HomeDog [color=" + color + ", wool=" + Arrays.toString(wool) 
				+ ", getName()=" + getName() + ", getHeight()=" + getHeight() + ", getSpecia()=" + getSpecia()
				+ ", getAge()=" + getAge() + ", getWeight()=" + getWeight() +"]";
	}
	public HomeDog(String Specia, int age, Double weight, String name, double height,String color,String[] wool) {
		super(Specia, age, weight, name, height);
		this.color=color;
		this.wool=wool;
		
		// TODO Auto-generated constructor stub
	}
	public void ShowEat() {
		System.out.println(name +" eat food");
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		 return ((Animal) o1).getAge().compareTo(((Animal) o2).getAge());
	}

}
