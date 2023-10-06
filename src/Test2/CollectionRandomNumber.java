package Test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//產生0-9的亂數; int r = (int)(Math.random()*31);產生0 - 30的隨機數字; 0<= r <1.0, 0+1 <= r <1*49 + 1
//從1-49隨機取得6個不重複數字
public class CollectionRandomNumber {
	public static void main(String[] args) {
		Set set = new HashSet(); //重複的資料會無法加入集合, 且**沒有順序**
		while(set.size() != 6) {
			int r = (int)(Math.random()*49)+1;
			set.add(r);
			System.out.println("toString()=" + set);
		}

		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}


}
