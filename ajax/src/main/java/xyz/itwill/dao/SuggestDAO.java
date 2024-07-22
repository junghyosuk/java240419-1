package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xyz.itwill.dto.SuggestDTO;

public class SuggestDAO extends JdbcDAO {
	private static SuggestDAO _dao;
	
	private SuggestDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new SuggestDAO();
	}
	
	public static SuggestDAO getDAO() {
		return _dao;
	}
	
	//검색어(String 객체)를 전달받아 SUGGEST 테이블에 저장된 행에서 검색어가 포함된 모든
	//행을 검색하여 검색목록(List 객체)을 반환하는 메소드
	public List<SuggestDTO> selectSuggestList(String keyword) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<SuggestDTO> suggestList=new ArrayList<SuggestDTO>();
		try {
			con=getConnection();
			
			String sql="select word,url from suggest where word like '%'||?||'%' order by word";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, keyword);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				SuggestDTO suggest=new SuggestDTO();
				suggest.setWord(rs.getString("word"));
				suggest.setUrl(rs.getString("url"));
				
				suggestList.add(suggest);
			}
		} catch (SQLException e) {
			System.out.println("[에러]selectSuggestList() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return suggestList;
	}
}

















