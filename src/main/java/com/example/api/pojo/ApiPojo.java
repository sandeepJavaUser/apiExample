package com.example.api.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

 @Document(collection="Acollection")
public class ApiPojo 
{
	@Id
    String id;
	String aName;
	int cost;
	String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "ApiPojo [id=" + id + ", aName=" + aName + ", cost=" + cost + ", city=" + city + "]";
	}
}
