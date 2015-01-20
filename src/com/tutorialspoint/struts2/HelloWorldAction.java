package com.tutorialspoint.struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	
	private String osName;
    private String version;
    private String notes;
 
   

	
	public String execute() throws Exception {
		
		String ret = ERROR;
		Connection conn = null;
		
		try{
			String URL = "jdbc:mysql://localhost/HelloWorld";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "");
			String sql = "SELECT osName FROM entry WHERE";
			sql+=" osName = ? AND version = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, osName);
			ps.setString(2, version);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				notes = rs.getString(1);
				ret = SUCCESS;
			}
		}catch (Exception e) {
			ret = ERROR;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
		
		return ret;
	}

	
		public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public void validate()
	{
		if (osName == null || osName.trim().equals(""))
		{ 
			addFieldError("osName","The OS name is required");
		}
		if (version == null || version.trim().equals(""))
		{
			addFieldError("version","The OS version is required");
		}
    }
}

