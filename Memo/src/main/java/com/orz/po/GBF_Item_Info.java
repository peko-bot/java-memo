package com.orz.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* gbf�زĻ�����Ϣ */
@Entity
@Table(name = "GBF_Item_Info")
public class GBF_Item_Info implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	// ���ţ�ͬһ��id��ͬ���ε�����
	// Ŀǰ��user_id + ����yyyyMMddHHmmss
	@Column(name = "patch")
	private String patch;

	// ɸѡʱ�õ����ͣ���ʱ���ã�
	@Column(name = "category_type")
	private String category_type;

	// ����icon id����ʱ���ã�
	@Column(name = "image")
	private Integer image;

	// �Ƿ���ʾ�ڵײ�������ʱ���ã�
	@Column(name = "is_display_select_item")
	private Boolean is_display_select_item;

	// ����id
	@Column(name = "item_id")
	private Integer item_id;

	// ��������
	@Column(name = "name")
	private String name;

	@Column(name = "number")
	private Integer number;

	@Column(name = "user_id")
	private String user_id;

	// ���ʱ��
	@Column(name = "create_time")
	private Date create_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatch() {
		return patch;
	}

	public void setPatch(String patch) {
		this.patch = patch;
	}

	public String getCategory_type() {
		return category_type;
	}

	public void setCategory_type(String category_type) {
		this.category_type = category_type;
	}

	public Integer getImage() {
		return image;
	}

	public void setImage(Integer image) {
		this.image = image;
	}

	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Boolean getIs_display_select_item() {
		return is_display_select_item;
	}

	public void setIs_display_select_item(Boolean is_display_select_item) {
		this.is_display_select_item = is_display_select_item;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

}
