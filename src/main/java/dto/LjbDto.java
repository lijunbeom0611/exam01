package dto;

public class LjbDto {
	 private String resvNo;
     private String custNo;
     private String resvDate;
     private String courtNo;
     
     public LjbDto() {
     }
   
     public LjbDto(String resvNo, String custNo, String resvDate, String courtNo) {
         this.resvNo = resvNo;
         this.custNo = custNo;
         this.resvDate = resvDate;
         this.courtNo = courtNo;
     }
	public String getResvNo() {
		return resvNo;
	}
	public void setResvNo(String resvNo) {
		this.resvNo = resvNo;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getResvDate() {
		return resvDate;
	}
	public void setResvDate(String resvDate) {
		this.resvDate = resvDate;
	}
	public String getCourtNo() {
		return courtNo;
	}
	public void setCourtNo(String courtNo) {
		this.courtNo = courtNo;
	}
     
     
}