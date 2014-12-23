package com.bms.rbac.management.domain;

import java.util.Date;

public class Repository {
	private int id;
	private int proc_inst_id;
	private String sendor;
	private Date recvdate;
	private String recevior;
	private String author;
	private String formurl;
	private String name;
	private Date create_date;
	private String instcreator;
	private String pzyj;
	private String fjmc;
	private String dsvalues;
	private String showdate;
	//formId=1121&procInstId=624683&actId=986&workItemId=36571598&flag=1&procTypeId=1&procInfoId=1118&coming=receiver&name=viewList1&viewList=all&i=0&addinfo=
	private String actId;
	private String dsmId;
	private String formId;
	private String procId;
	private String typeId;
	private String workItemId;
	
	public String getShowdate() {
		return showdate;
	}
	public void setShowdate(String showdate) {
		this.showdate = showdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSendor() {
		return sendor;
	}
	public void setSendor(String sendor) {
		this.sendor = sendor;
	}
	public Date getRecvdate() {
		return recvdate;
	}
	public void setRecvdate(Date recvdate) {
		this.recvdate = recvdate;
	}
	public String getRecevior() {
		return recevior;
	}
	public void setRecevior(String recevior) {
		this.recevior = recevior;
	}	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getFormurl() {
		return formurl;
	}
	public void setFormurl(String formurl) {
		this.formurl = formurl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public int getProc_inst_id() {
		return proc_inst_id;
	}
	public void setProc_inst_id(int proc_inst_id) {
		this.proc_inst_id = proc_inst_id;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getInstcreator() {
		return instcreator;
	}
	public void setInstcreator(String instcreator) {
		this.instcreator = instcreator;
	}
	public String getPzyj() {
		return pzyj;
	}
	public void setPzyj(String pzyj) {
		this.pzyj = pzyj;
	}
	public String getFjmc() {
		return fjmc;
	}
	public void setFjmc(String fjmc) {
		this.fjmc = fjmc;
	}
	public String getDsvalues() {
		return dsvalues;
	}
	public void setDsvalues(String dsvalues) {
		this.dsvalues = dsvalues;
	}
	public String getActId() {
		return actId;
	}
	public void setActId(String actId) {
		this.actId = actId;
	}
	public String getDsmId() {
		return dsmId;
	}
	public void setDsmId(String dsmId) {
		this.dsmId = dsmId;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public String getProcId() {
		return procId;
	}
	public void setProcId(String procId) {
		this.procId = procId;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getWorkItemId() {
		return workItemId;
	}
	public void setWorkItemId(String workItemId) {
		this.workItemId = workItemId;
	}
	
	
	
	

}
