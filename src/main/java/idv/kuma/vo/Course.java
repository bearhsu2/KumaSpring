package idv.kuma.vo;

import org.springframework.context.annotation.Bean;

public class Course {

    String name;
    String description;
    Double price;
    String comments;

    public Course() {
    }



    public Course(String name, String description, Double price, String comments) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.comments = comments;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
