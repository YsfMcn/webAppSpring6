package com.training.conference.model;

import jakarta.validation.constraints.NotEmpty;

public class Registration {

    @NotEmpty // this will not allow to add registration object with empty or null name
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
