package com.dada.business.user.api.model;

import java.io.Serializable;
import java.util.Date;

import com.dada.business.user.api.common.UserVersion;

/**
 * 
 * Title: BaseModel Description: 基础模型
 * 
 * @author ssc
 * @date 2016年5月12日 下午4:13:58
 */
public class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id; 												// 实体ID
	private Integer version; 										// 模块版本号
	private Date createDate; 										// 创建时间
	private Date updateDate; 										// 更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		String versionName = UserVersion.getVersionDesc(version);
		if ("HigherVersion".equals(versionName))
			throw new IllegalArgumentException("version is invalid.");
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
