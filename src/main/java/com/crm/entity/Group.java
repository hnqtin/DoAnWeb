package com.crm.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "group")
public class Group {
	@Id
	private String id;
	
	@NotBlank(message = "Tên không được bỏ trống!")
	@Length(min = 4, message = "Tên không được ít hơn 4 ký tự!")
	private String name;
	
	@NotBlank(message = "Mô tả không được bỏ trống!")
	private String description;
	
	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
	private List<Task> tasks;
	
	public Group(){
		
	}
	public Group(String id,
			@NotBlank(message = "Tên nhóm việc không được bỏ trống!") @Length(min = 4, message = "Tên nhóm việc không được ít hơn 4 ký tự!") String name, 
			@NotBlank(message = "Mô tả không được bỏ trống!") String description, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
