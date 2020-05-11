package comparator;

public class School implements Comparable<School> {
	private int code;
	private String sname;

	public School(int code, String sname) {
		this.code = code;
		this.sname = sname;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "School [code=" + code + ", sname=" + sname + "]";
	}

	public String getSname() {
		return sname;
	}

	@Override
	public int compareTo(School s) {
		return s.sname.compareTo(sname);
	}
}