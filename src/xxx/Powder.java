package xxx;
public class Powder implements Weighter{
	private String color; 
	private double weight;
	
	public Powder() {
		super();
	}
	
	public Powder(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	//實作介面Weighter 裡的方法 printWeightTool()
	public void printWeightTool() {
		System.out.println("小磅秤");
	}
	
	
}
