package cn.zheng.neptune.MySpringBoot.vo

import org.springframework.format.annotation.DateTimeFormat

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table


@Entity
@Table(name = "LegalUser")
class LegalUser {
	@Id
	@PrimaryKeyJoinColumn
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id

	String name
	String password
	String Email

	@DateTimeFormat(style = "yyyy-MM-dd HH:mm:SS",iso = DateTimeFormat.ISO.DATE_TIME)
	Date updateTS

	LegalUser() {
	}

	LegalUser(String name, String password) {
		this.name = name
		this.password = password
	}

	LegalUser(String name, String password, String email, Date updateTS) {
		this.name = name
		this.password = password
		Email = email
		this.updateTS = updateTS
	}

	long getId() {
		return id
	}

	void setId(long id) {
		this.id = id
	}

	String getName() {
		return name
	}

	void setName(String name) {
		this.name = name
	}

	String getPassword() {
		return password
	}

	void setPassword(String password) {
		this.password = password
	}

	String getEmail() {
		return Email
	}

	void setEmail(String email) {
		Email = email
	}

	Date getUpdateTS() {
		return updateTS
	}

	void setUpdateTS(Date updateTS) {
		this.updateTS = updateTS
	}
}
