package dto;

public class LjbDto {
    private String rentalNo;
    private String studentNo;
    private String rentalDate;
    private String uniformSize;
    
    public LjbDto() {}
    
    public LjbDto(String rentalNo, String studentNo, String rentalDate, String uniformSize) {
        this.rentalNo = rentalNo;
        this.studentNo = studentNo;
        this.rentalDate = rentalDate;
        this.uniformSize = uniformSize;
    }

    public String getRentalNo() { return rentalNo; }
    public void setRentalNo(String rentalNo) { this.rentalNo = rentalNo; }

    public String getStudentNo() { return studentNo; }
    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }

    public String getRentalDate() { return rentalDate; }
    public void setRentalDate(String rentalDate) { this.rentalDate = rentalDate; }

    public String getUniformSize() { return uniformSize; }
    public void setUniformSize(String uniformSize) { this.uniformSize = uniformSize; }
}