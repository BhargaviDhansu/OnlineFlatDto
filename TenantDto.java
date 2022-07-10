package com.cg.ofr.dto;

import org.springframework.stereotype.Component;

import com.cg.ofr.entities.Flat;


@Component
public class TenantDto {
	private int tenantId;
	private int age;
	private Flat flat;
	
	public TenantDto() {}
	public TenantDto(int tenantId, int age, Flat flat) {
		super();
		this.tenantId = tenantId;
		this.age = age;
		this.flat = flat;
	}
	public int getTenantId() {
		return tenantId;
	}
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Flat getFlat() {
		return flat;
	}
	public void setFlat(Flat flat) {
		this.flat = flat;
	}
	@Override
	public String toString() {
		return "TenantDto [tenantId=" + tenantId + ", age=" + age + ", flat=" + flat + "]";
	}
	
}	
		