package com.dada.business.message.api.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Title: BaseModel Description: 基础模型
 * 
 * @author ssc
 * @date 2016年4月15日 下午2:14:00
 */
public abstract class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id; 												// 实体ID
	private Long version; 											// 版本号
	private Date createDate; 										// 创建时间
	private Date updateDate; 										// 更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
