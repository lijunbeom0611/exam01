package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.LjbDto;
import Util.DBUtil;

public class LjbDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void insertReservation(LjbDto ljDto) {
        try {
            conn = Util.DBUtil.getConnection();
            String sql = "INSERT INTO tbl_resv VALUES(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ljDto.getResvNo());
            pstmt.setString(2, ljDto.getCustNo());
            pstmt.setString(3, ljDto.getResvDate());
            pstmt.setString(4, ljDto.getCourtNo());
            
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           Util.DBUtil.close(conn, pstmt, null);
        }
    }
	
	public List<LjbDto> selectReservation() {
		List<LjbDto> list = new ArrayList<>();
		 try {
	            conn = Util.DBUtil.getConnection();
	            String sql = "SELECT * from tbl_resv";
	            pstmt = conn.prepareStatement(sql);
	            rs = pstmt.executeQuery();
	            
	            while(rs.next()) {
	            	LjbDto rDto = new LjbDto(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
	            	list.add(rDto);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           Util.DBUtil.close(conn, pstmt, rs);
	        }
		
		return list;
	}
}