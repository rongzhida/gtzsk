package com.bms.rbac.management.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 用户
 * 
 * @author rongzhida
 * 
 */
public class User implements java.io.Serializable {

	private static final long serialVersionUID = -8339781453734086624L;
	public static final int STATUS_SUSPEND = 2;
	public static final int STATUS_VALID = 1;
	public static final int STATUS_INVALID = 0;

	public static final int TYPE_CYZT = 99;// 从业主体

	private Integer id;
	private Integer position;
	private String password;
	private String name;
	private String userName;
	private Integer type = 1;
	private Integer status = STATUS_VALID;
	private String remark;
	private String code;
	private String cacode;
	private transient String typeName;
	private transient String organizationName;
	private transient String depthName;
	private transient String sourceName;
	private transient String adminSourceName;
	private transient String repassword;
	private transient String roleName;
	//
	private String phone;
	private String email;
	private String address;
	private Integer orgPosition;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getRepassword() {
		repassword = password;
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getAdminSourceName() {
		return adminSourceName;
	}

	public void setAdminSourceName(String adminSourceName) {
		this.adminSourceName = adminSourceName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDepthName() {
		return depthName;
	}

	public void setDepthName(String depthName) {
		this.depthName = depthName;
	}

	public String getCacode() {
		return cacode;
	}

	public void setCacode(String cacode) {
		this.cacode = cacode;
	}

	public Integer getOrgPosition() {
		return orgPosition;
	}

	public void setOrgPosition(Integer orgPosition) {
		this.orgPosition = orgPosition;
	}
}
