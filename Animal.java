import java.math.BigDecimal;

public abstract class Animal {
private String Specia;
private Integer age;
private Double weight;

public Animal(String Specia, Integer age, Double weight) {
	this.age=age;
	this.Specia= Specia;
	this.weight=weight;
}

public String getSpecia() {
	return Specia;
}
public void setSpecia(String specia) {
	Specia = specia;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Double getWeight() {
	return weight;
}
public void setWeight(Double weight) {
	this.weight = weight;
}



}
