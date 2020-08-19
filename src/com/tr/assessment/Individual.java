package com.tr.assessment;

import java.util.List;

/**
 *
 */
public class Individual {

    private String id;
    private List<String> skills;

    public Individual(String id, List<String> skills) {
        this.id = id;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "id='" + id + '\'' +
                ", skills=" + skills +
                '}';
    }
}
