package dao;

import java.sql.*;
import java.util.*;
import dto.LjbDto;
import Util.DBUtil;

public class LjbDao {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    
    public void insertRental(LjbDto rDto) {
        try {
            conn = DBUtil.getConnection();
            String sql = "INSERT INTO tbl_rental VALUES(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, rDto.getRentalNo());
            pstmt.setString(2, rDto.getStudentNo());
            pstmt.setString(3, rDto.getRentalDate());
            pstmt.setString(4, rDto.getUniformSize());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           DBUtil.close(conn, pstmt, null);
        }
    }
    
    public List<LjbDto> selectRental() {
        List<LjbDto> list = new ArrayList<>();
        try {
            conn = DBUtil.getConnection();
            String sql = "SELECT * from tbl_rental";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()) {
            	LjbDto dto = new LjbDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           DBUtil.close(conn, pstmt, rs);
        }
        return list;
    }


	public LjbDto selectRentalByNo(String rentalNo) {
	    LjbDto dto = null;
	    try {
	        conn = DBUtil.getConnection();
	        String sql = "SELECT * FROM tbl_rental WHERE rental_no = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, rentalNo);
	        rs = pstmt.executeQuery();
	
	        if (rs.next()) {
	        	dto = new LjbDto(
	        	        rs.getString("rental_no"),
	        	        rs.getString("student_no"),
	        	        rs.getString("rental_date"),
	        	        rs.getString("uniform_size")
	        	    );
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        DBUtil.close(conn, pstmt, rs);
	    }
	    return dto;
	}
}
