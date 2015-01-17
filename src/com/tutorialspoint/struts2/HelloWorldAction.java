package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	private String osName;
    private String version;
    private String notes;
   

	
	public String execute() throws Exception 
	{
		return "success";
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

