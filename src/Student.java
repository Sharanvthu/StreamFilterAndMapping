import java.util.List;

class Student {
	 int Sid;
	 String Sname;
	 List<String> Sco;
	 
	public Student(int sid, String sname, List<String> sco) {
		Sid = sid;
		Sname = sname;
		Sco = sco;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sco=" + Sco + "]"+"\n";
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public List<String> getSco() {
		return Sco;
	}
	public void setSco(List<String> sco) {
		Sco = sco;
	}
	 
	 
}
