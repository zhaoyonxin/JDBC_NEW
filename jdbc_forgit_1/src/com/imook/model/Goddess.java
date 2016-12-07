package com.imook.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Goddess {

	private Long ID;
	private Timestamp creat_at;
	private Timestamp update_at;
	private String name;
	private Integer qq;
	private String xiuzhenstyle;
	private String biyeschool;
	private Integer xuehao;
	private Date ruxuetime;
	private String ribaolianjie;
	private String zhiyuan;
	private String tuijianren;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Timestamp getCreat_at() {
		return creat_at;
	}

	public void setCreat_at(Timestamp creat_at) {
		this.creat_at = creat_at;
	}

	public Timestamp getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Timestamp update_at) {
		this.update_at = update_at;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQq() {
		return qq;
	}

	public void setQq(Integer qq) {
		this.qq = qq;
	}

	public String getXiuzhenstyle() {
		return xiuzhenstyle;
	}

	public void setXiuzhenstyle(String xiuzhenstyle) {
		this.xiuzhenstyle = xiuzhenstyle;
	}

	public String getBiyeschool() {
		return biyeschool;
	}

	public void setBiyeschool(String biyeschool) {
		this.biyeschool = biyeschool;
	}

	public Integer getXuehao() {
		return xuehao;
	}

	public void setXuehao(Integer xuehao) {
		this.xuehao = xuehao;
	}

	public Date getRuxuetime() {
		return ruxuetime;
	}

	public void setRuxuetime(Date ruxuetime) {
		this.ruxuetime = ruxuetime;
	}

	public String getRibaolianjie() {
		return ribaolianjie;
	}

	public void setRibaolianjie(String ribaolianjie) {
		this.ribaolianjie = ribaolianjie;
	}

	public String getZhiyuan() {
		return zhiyuan;
	}

	public void setZhiyuan(String zhiyuan) {
		this.zhiyuan = zhiyuan;
	}

	public String getTuijianren() {
		return tuijianren;
	}

	public void setTuijianren(String tuijianren) {
		this.tuijianren = tuijianren;
	}

	@Override
	public String toString() {
		return "Goddess [ID=" + ID + ", creat_at=" + creat_at + ", update_at="
				+ update_at + ", name=" + name + ", qq=" + qq
				+ ", xiuzhenstyle=" + xiuzhenstyle + ", biyeschool="
				+ biyeschool + ", xuehao=" + xuehao + ", ruxuetime="
				+ ruxuetime + ", ribaolianjie=" + ribaolianjie + ", zhiyuan="
				+ zhiyuan + ", tuijianren=" + tuijianren + "]";
	}
}
