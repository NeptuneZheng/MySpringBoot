package cn.zheng.neptune.MySpringBoot.vo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Consumer {
	@Id
	private int id
	private String name
	private String password
	private int age

	Consumer() {
	}

	Consumer(String name, String password, int age) {
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


	@Override
	public String toString() {
		return "Consumer{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				'}';
	}
}
