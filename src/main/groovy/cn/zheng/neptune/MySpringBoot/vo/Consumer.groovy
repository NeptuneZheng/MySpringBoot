package cn.zheng.neptune.MySpringBoot.vo

import cn.zheng.neptune.MySpringBoot.configuration.annotation.SystemDateTime
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.stereotype.Repository

@Document
@Repository
class Consumer {
	@Id
	private int id
	private String name
	private String password
	private int age
	private String date

	Consumer() {
	}

	Consumer(String name, String password, int age) {
		this.id = new Random().nextInt(100)
		this.name = name
		this.password = password
		this.age = age
	}

	int getId() {
		return id
	}

	void setId(int id) {
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

	int getAge() {
		return age
	}

	void setAge(int age) {
		this.age = age
	}

	String getDate() {
		return date
	}
	void setDate(String date) {
		this.date = date
	}


	@Override
	public String toString() {
		return "Consumer{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				", date='" + date + '\'' +
				'}';
	}
}
