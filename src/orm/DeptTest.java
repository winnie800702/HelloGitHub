package orm;

import java.util.List;
import java.util.Scanner;

public class DeptTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("要新增(查詢)的部門編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的部門名稱");
		String dname = sc.next();
		System.out.println("要新增的部門所在地");
		String loc = sc.next();
		
//		sc.close();
//		//要對部門表格操作, 透過dao物件進行
		//空介面dao class   new實作介面的參考變數DeptDAOImpl
		DeptDAO dao = new DeptDAOImpl();
		//利用Dept Bean, 包裝著要新增的資料交給方法處理
		Dept dept = new Dept(deptno, dname, loc);
		dao.insert(dept);
		
		//要對部門表格操作, 透過dao物件進行
//		DeptDAO dao = new DeptDAOImpl();
//		Dept dept = dao.findByDeptno(deptno);
//		System.out.println(dept);
		
		//要對部門表格操作, 透過dao物件進行
//		DeptDAO dao = new DeptDAOImpl();
//		List<Dept> deptList = dao.getAll();
//		for(Dept dept : deptList) {
//			System.out.println(dept);
//		}
	}

}
