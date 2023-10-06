package orm;

import java.util.List;

public interface DeptDAO {
	//宣告各個對部門表格操作的方法
	//程式裡, 現在一筆部門資料就是一個Dept物件
	void insert(Dept dept);
	void update(Dept dept);
	void delete(Integer deptno);
	
	//方法的回傳型別為Dept物件
	Dept findByDeptno(Integer deptno);
	//List有順序性, order by帶出來就有排序好
	List<Dept> getAll();

}
