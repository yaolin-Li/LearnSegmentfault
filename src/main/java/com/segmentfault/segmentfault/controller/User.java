package com.segmentfault.segmentfault.controller;

import org.springframework.hateoas.RepresentationModel;

public class User extends RepresentationModel {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
