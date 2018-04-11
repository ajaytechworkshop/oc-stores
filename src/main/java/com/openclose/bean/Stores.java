package com.openclose.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Stores")
public class Stores
{
	@Id
	private String id;
	@Indexed
	private String name;
	private Category category;
	private String businesLogo;
	private String description;
	private String mobileNo;
	private String landlineNo;
	private String address;

	@GeoSpatialIndexed
	private Point storeLocation;

	private String url;
	private String email;
	private boolean isOpen;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public String getBusinesLogo()
	{
		return businesLogo;
	}

	public void setBusinesLogo(String businesLogo)
	{
		this.businesLogo = businesLogo;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getMobileNo()
	{
		return mobileNo;
	}

	public void setMobileNo(String mobileNo)
	{
		this.mobileNo = mobileNo;
	}

	public String getLandlineNo()
	{
		return landlineNo;
	}

	public void setLandlineNo(String landlineNo)
	{
		this.landlineNo = landlineNo;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public Point getLocation()
	{
		return storeLocation;
	}

	public void setLocation(Point location)
	{
		this.storeLocation = location;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public boolean isOpen()
	{
		return isOpen;
	}

	public void setOpen(boolean isOpen)
	{
		this.isOpen = isOpen;
	}

	@Override
	public String toString()
	{
		return "Stores [name=" + name + ", category=" + category + ", businesLogo=" + businesLogo + ", description="
				+ description + ", mobileNo=" + mobileNo + ", landlineNo=" + landlineNo + ", address=" + address
				+ ", location=" + storeLocation + ", url=" + url + ", email=" + email + "]";
	}

}
