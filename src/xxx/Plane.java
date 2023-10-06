package xxx;
public class Plane implements Weighter {
	private String kind;     // 種類
	private double weight;
	
	public Plane() {
		super();
	}

	public Plane(String kind, double weight) {
		super();
		this.kind = kind;
		this.weight = weight;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	//實作介面Weighter 裡的方法 printWeightTool()
	public void printWeightTool() {
		System.out.println("大磅秤");
		
	}
	
	
	
	
}
