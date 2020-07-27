package com.example.demo;

import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        User user = new User();
        user.isFile();
        System.out.println(System.getProperty("user.dir"));


        System.out.println("=======================================");
        System.getProperties().list(System.out);
        System.out.println("=======================================");

    }

    class A {
        String id;

        public A(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "A{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }

    @Test
    public void test() {
        List<A> list = new ArrayList<>();
        list.add(new A("1"));
        list.add(new A("2"));

        for (A item : list) {
            item.setId("000");
        }
        System.out.println("A======"+list.toString());
    }
}
