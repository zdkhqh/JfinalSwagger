package com.github.zdkhqh.model;

/**
 * @author HeQuehua
 * @date 2019/4/27
 */
public class SwaggerTag {

    private String name;
    private String description;

    public SwaggerTag(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
