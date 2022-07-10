package com.example.droolsExample.model;

import java.util.HashSet;
import java.util.Set;

public class ResponseObject {
    private int id;
    private String preFill;
    private String multiple;
    private String multipleG;
    private Set<String> risk;
    private Set<String> diseases;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPreFill() {
        return preFill;
    }

    public void setPreFill(String preFill) {
        this.preFill = preFill;
    }

    public String getMultiple() {
        return multiple;
    }

    public void setMultiple(String multiple) {
        this.multiple = multiple;
    }

    public String getMultipleG() {
        return multipleG;
    }

    public void setMultipleG(String multipleG) {
        this.multipleG = multipleG;
    }

    public Set<String> getRisk() {
        return risk;
    }

    public void setRisk(Set<String> risk) {
        this.risk = risk;
    }

    public Set<String> getDiseases() {
        return diseases;
    }

    public void setDiseases(Set<String> diseases) {
        this.diseases = diseases;
    }
}
