package studySql;

public class GisaDataVO {
	private int stdNo;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String mgrCode;
	private String accCode;
	private String locCode;
	
	public GisaDataVO(int stdNo, String email, int kor, int eng, int math, int sci, int hist, int total, String mgrCode,
			String accCode, String locCode) {
		this.stdNo = stdNo;
		this.email = email;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.hist = hist;
		this.total = total;
		this.mgrCode = mgrCode;
		this.accCode = accCode;
		this.locCode = locCode;
	}
	




	public String getLocCode() {
		return locCode;
	}




	public int getStdNo() {
		return stdNo;
	}




	public String getEmail() {
		return email;
	}




	public int getKor() {
		return kor;
	}




	public int getEng() {
		return eng;
	}




	public int getMath() {
		return math;
	}




	public int getSci() {
		return sci;
	}




	public int getHist() {
		return hist;
	}




	public int getTotal() {
		return total;
	}




	public String getMgrCode() {
		return mgrCode;
	}




	public String getAccCode() {
		return accCode;
	}




	@Override
	public String toString() {
		return stdNo + "\t" + email+ "\t" + kor+ "\t" + eng+ "\t" + math+ "\t" + sci+ "\t"
				+ hist+ "\t" + total+ "\t" + mgrCode+ "\t" + accCode+ "\t" + locCode + "\n";
	}

	
}
