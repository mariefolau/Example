package com.goanna.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    int id;
    String name;

    public Person(@JsonProperty("id") int id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
