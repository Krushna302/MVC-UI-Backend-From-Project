package Com.Exponent.Model;



public class Employee {
	
	
	
	

	
	
	
	private int eid;
	
	private String ename;
	
	private long mobno;
	
	private String eaddress;
	
	private String edepartment;
	
	private String eusername;
	
	private String epassword;

	
	
	
	
	
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getEdepartment() {
		return edepartment;
	}

	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}

	public String getEusername() {
		return eusername;
	}

	public void setEusername(String eusername) {
		this.eusername = eusername;
	}

	public String getEpassword() {
		return epassword;
	}

	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mobno=" + mobno + ", eaddress=" + eaddress
				+ ", edepartment=" + edepartment + ", eusername=" + eusername + ", epassword=" + epassword + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
