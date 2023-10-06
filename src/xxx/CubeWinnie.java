package xxx;

public class CubeWinnie {
	private double length;
	
	public CubeWinnie() {
		
	}
	
	public CubeWinnie(double length){
		this.length = length;
		//System.out.println(length * length *length);
	}
	
	public void setLength(double length) throws CubeException{
		this.length = length;
	}
	
	public double getLength(double length) {
		return length;
	}
	
	public double getVolume(double length) throws CubeException{
		if(length <= 0) {
			throw new CubeException("正方體邊長不得為0或負數");
		}else
			return length * length *length;
		
	}
	

}
