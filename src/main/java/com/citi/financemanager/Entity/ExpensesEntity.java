package com.citi.financemanager.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "expense")
public class ExpensesEntity {
    @Id
    private String id;
    private String categoryName;
    private double value;
    private String date;
    private String description;

    public ExpensesEntity(String id, String categoryName, double value, String date, String description) {
        this.id = id;
        this.categoryName = categoryName;
        this.value = value;
        this.date = date;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
