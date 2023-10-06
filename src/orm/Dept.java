package orm;

import java.io.Serializable;

//class名稱不用跟表格一樣, 但需要有關聯, 欄位也是
public class Dept implements Serializable{
	private Integer deptno; //因為有可能有空值, 所以都用包裝類別而不是基本型別int
	private String dname;
	private String loc;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	//建構子
	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	

	
	

}
