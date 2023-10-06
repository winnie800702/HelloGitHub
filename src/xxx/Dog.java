package xxx;
public class Dog implements Weighter {
	private String name;
	private double weight;
	
	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//實作介面Weighter 裡的方法 printWeightTool()
	public void printWeightTool() {
		System.out.println("中磅秤");
	}
	
	
	
	
}
