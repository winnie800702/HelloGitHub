package xxx;

public class CubeException extends Exception { //-自訂exception, 必須繼承 Throwable 或 Exception 或 RuntimeException 之一
	//自訂的例外類別，通常會包含以下兩個建構子
	public CubeException() {
		
	}
	
	public CubeException(String msg) {
		super(msg);
	}
}
