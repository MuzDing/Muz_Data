package testWeb;

public class BookBean {
	
	private String bid;
	private String bname;
	private int number;
	private String wr;

	public void setBid(String bid){
		this.bid=bid;
	}
	public String getBid(){
		return this.bid;
	}
	public void setBname(String bname){
		this.bname=bname;
	}
	public String getBname(){
		return this.bname;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return this.number;
	}
	public void setWr(String wr){
		this.wr=wr;
	}
	public String getWr(){
		return this.wr;
	}

}
