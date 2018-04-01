package com.orz.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* 用户基础信息 */
@Entity
@Table(name = "Base_User")
public class Base_User implements Serializable {
	private static final long serialVersionUID = 3646014853725898752L;

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "userName")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "create_time", updatable = false)
	private Date create_time;

	@Column(name = "last_modify_time")
	private Date last_modify_time;

	@Column(name = "cellphone")
	private String cellphone;

	@Column(name = "email")
	private String email;

	@Column(name = "gbf_id")
	private String gbf_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGbf_id() {
		return gbf_id;
	}

	public void setGbf_id(String gbf_id) {
		this.gbf_id = gbf_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getLast_modify_time() {
		return last_modify_time;
	}

	public void setLast_modify_time(Date last_modify_time) {
		this.last_modify_time = last_modify_time;
	}

}
