package cn.zheng.neptune.MySpringBoot

import org.springframework.beans.BeanUtils

class Test {
    String name
    String password

    Test() {
    }

    Test(String name, String password) {
        this.name = name
        this.password = password
    }

    public static void main(String[] args) {
        Test a = new Test("AAA","aaa")
        Test b = new Test()
        BeanUtils.copyProperties(a,b)

        println('a: ' + a.hashCode())
        println('b: ' + b.hashCode())

        b.name = 'bbbb'

        println('a: ' + a)
        println('b: ' + b)

        println('a: ' + a.hashCode())
        println('b: ' + b.hashCode())

    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
