package com.bigdatan.b2c.entity;

import java.io.Serializable;
import java.util.Date;

import com.bigdatan.b2c.entity.Admin;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 订单图片凭证DO类
 *
 */
public class OrderCertify implements Serializable {
	private Integer orderCertifyId;
	private Integer orderId;
	private String orderNumber;
	private String imageUrl;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	private Admin admin;

	public Integer getOrderCertifyId() {
		return orderCertifyId;
	}

	public void setOrderCertifyId(Integer orderCertifyId) {
		this.orderCertifyId = orderCertifyId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


}
