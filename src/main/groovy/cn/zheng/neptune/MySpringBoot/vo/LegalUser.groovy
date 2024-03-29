package cn.zheng.neptune.MySpringBoot.vo

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.context.annotation.Bean
import org.springframework.format.annotation.DateTimeFormat

import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "LegalUser")
class LegalUser {
	@Id
	@PrimaryKeyJoinColumn
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id

	@NotNull
	String name

	@NotNull
	String password
	String Email

	@DateTimeFormat(style = "yyyy-MM-dd HH:mm:SS",iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	Date updateTS = new Date()

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

	LegalUser(long id, String name, String password, String email, Date updateTS) {
		this.id = id
		this.name = name
		this.password = password
		Email = email
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
