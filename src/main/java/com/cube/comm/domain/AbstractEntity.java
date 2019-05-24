package com.cube.comm.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable{
	// 문자 타입
	@Transient
	protected final int SEQ = 13;

	@Transient
	protected final int ID = 30;

	@Transient
	protected final int NM = 100;

	@Transient
	protected final int PW = 128; // sha512

	@Transient
	protected final int YN = 1;

	@Transient
	protected final int MEMO = 2000;

	@Transient
	protected final int CODE = 8; // 코드

	@Transient
	protected final int TYPE = 20; // 코드

	@Transient
	protected final int YMD = 8; // 날짜 - YYYYMMDD

	@Transient
	protected final int EMAIL = 100;

	@Transient
	protected final int PH = 20; // 우편번호

	@Transient
	protected final int POST = 20; // 우편번호

	@Transient
	protected final int ADDR = 255; // 주소

	@Transient
	protected final int URL = 1000; //

	@Transient
	protected final int PATH = 255; // 시스템 경로

	@Transient
	protected final int TAG = 255; // 태그,ex) 해쉬태그

	@Transient
	protected final int NO = 20;

	// 숫자 타입
	@Transient
	protected final int ORDER = 4;

	@Transient
	protected final int AMT = 16; // 금액

	@Transient
	protected final int CNT = 8; // 건수,횟수

	@Transient
	protected final int NUM = 8; // 회차

	@Transient
	protected final int DAY = 8; // 일수 , DAYS 가 실제 의미가 맞지만 가독성 및 실수를 줄이는 차원에서 DAY 로 명기한다.

	@Transient
	protected final int RTO = 7; // 이율
	

	@Column(length = ID, updatable = false)	
	protected String idCreate;

	
	@CreationTimestamp
	@Column(nullable = false , updatable=false)
	protected OffsetDateTime dtCreate;
	
	@Column(length = ID, insertable = false)	
	protected String idUpdate;
	
	
	@UpdateTimestamp
	@Column( insertable=false)
	protected OffsetDateTime dtUpdate;


	public String getIdCreate() {
		return idCreate;
	}


	public void setIdCreate(String idCreate) {
		this.idCreate = idCreate;
	}


	public OffsetDateTime getDtCreate() {
		return dtCreate;
	}


	public void setDtCreate(OffsetDateTime dtCreate) {
		this.dtCreate = dtCreate;
	}


	public String getIdUpdate() {
		return idUpdate;
	}


	public void setIdUpdate(String idUpdate) {
		this.idUpdate = idUpdate;
	}


	public OffsetDateTime getDtUpdate() {
		return dtUpdate;
	}


	public void setDtUpdate(OffsetDateTime dtUpdate) {
		this.dtUpdate = dtUpdate;
	}
	

}
