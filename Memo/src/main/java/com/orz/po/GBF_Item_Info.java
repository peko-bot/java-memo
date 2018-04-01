package com.orz.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* gbf素材基础信息 */
@Entity
@Table(name = "Base_User")
public class GBF_Item_Info implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;

	// 批号，同一个id不同批次的数据
	@Column(name = "patch")
	private int patch;

	// 筛选时用的类型（暂时无用）
	@Column(name = "category_type")
	private String category_type;

	// 材料icon id（暂时无用）
	@Column(name = "image")
	private int image;

	// 是否显示在底部栏（暂时无用）
	@Column(name = "is_display_item")
	private Boolean is_display_item;

	// 材料id
	@Column(name = "item_id")
	private int item_id;

	// 材料名称
	@Column(name = "name")
	private String name;

	@Column(name = "number")
	private int number;

	@Column(name = "user_id")
	private int user_id;

	// 入库时间
	@Column(name = "create_time")
	private Date create_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatch() {
		return patch;
	}

	public void setPatch(int patch) {
		this.patch = patch;
	}

	public String getCategory_type() {
		return category_type;
	}

	public void setCategory_type(String category_type) {
		this.category_type = category_type;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public Boolean getIs_display_item() {
		return is_display_item;
	}

	public void setIs_display_item(Boolean is_display_item) {
		this.is_display_item = is_display_item;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

}
