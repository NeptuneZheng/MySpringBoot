package cn.zheng.neptune.MySpringBoot.pojo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated

import javax.validation.constraints.Email

@Component
//@PropertySource(value = "classpath:person.properties")
@ConfigurationProperties(prefix = "legal-user")
@Validated
class LegalUser {
	long id
	String name
	String password
	@Email
	String Email
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


	@Override
	public String toString() {
		return "LegalUser{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", Email='" + Email + '\'' +
				", updateTS=" + updateTS +
				'}';
	}
}
