package com.openclose.bean;

public class User
{
	private String name;
	private String mobileNumber;
	private String language;
	private Role role;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMobileNumber()
	{
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public Role getRole()
	{
		return role;
	}

	public void setRole(Role role)
	{
		this.role = role;
	}

	@Override
	public String toString()
	{
		return "User [name=" + name + ", mobileNumber=" + mobileNumber + ", language=" + language + ", getName()="
				+ getName() + ", getMobileNumber()=" + getMobileNumber() + ", getLanguage()=" + getLanguage()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
