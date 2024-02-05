package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="contract_backup")
public class Contract implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column 
	private String _hc_err;
	private String _hc_lastop;
	private String accountid;
	private String billingcity;
	private String billingcountry;
	private String billingpostalcode;
	private String dato_bancario__c;
	private String description;
	private String dia_de_pago__c;
	private String forma_de_pago__c;
	private String opportunity__c;
	private String pais_gls__c;
	private String recordtypeid;
	private String sfid;
	private Boolean factura_electronica_c__c;
	private Boolean isdeleted;
	@Temporal(TemporalType.DATE)
	private Date createddate;




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String get_hc_err() {
		return _hc_err;
	}

	public void set_hc_err(String _hc_err) {
		this._hc_err = _hc_err;
	}

	public String get_hc_lastop() {
		return _hc_lastop;
	}

	public void set_hc_lastop(String _hc_lastop) {
		this._hc_lastop = _hc_lastop;
	}

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	public String getBillingcity() {
		return billingcity;
	}

	public void setBillingcity(String billingcity) {
		this.billingcity = billingcity;
	}

	public String getBillingcountry() {
		return billingcountry;
	}

	public void setBillingcountry(String billingcountry) {
		this.billingcountry = billingcountry;
	}

	public String getBillingpostalcode() {
		return billingpostalcode;
	}

	public void setBillingpostalcode(String billingpostalcode) {
		this.billingpostalcode = billingpostalcode;
	}

	public String getDato_bancario__c() {
		return dato_bancario__c;
	}

	public void setDato_bancario__c(String dato_bancario__c) {
		this.dato_bancario__c = dato_bancario__c;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDia_de_pago__c() {
		return dia_de_pago__c;
	}

	public void setDia_de_pago__c(String dia_de_pago__c) {
		this.dia_de_pago__c = dia_de_pago__c;
	}

	public String getForma_de_pago__c() {
		return forma_de_pago__c;
	}

	public void setForma_de_pago__c(String forma_de_pago__c) {
		this.forma_de_pago__c = forma_de_pago__c;
	}

	public String getOpportunity__c() {
		return opportunity__c;
	}

	public void setOpportunity__c(String opportunity__c) {
		this.opportunity__c = opportunity__c;
	}

	public String getPais_gls__c() {
		return pais_gls__c;
	}

	public void setPais_gls__c(String pais_gls__c) {
		this.pais_gls__c = pais_gls__c;
	}

	public String getRecordtypeid() {
		return recordtypeid;
	}

	public void setRecordtypeid(String recordtypeid) {
		this.recordtypeid = recordtypeid;
	}

	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	public Boolean getFactura_electronica_c__c() {
		return factura_electronica_c__c;
	}

	public void setFactura_electronica_c__c(Boolean factura_electronica_c__c) {
		this.factura_electronica_c__c = factura_electronica_c__c;
	}

	public Boolean getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
