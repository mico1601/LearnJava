package com.dicoding.javafundamental.basic;

import java.util.Objects;

public class Person {
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Person other = (Person) obj;
            return Objects.equals(name, other.name) && age == other.age;
        }

        // ... other methods
    }

