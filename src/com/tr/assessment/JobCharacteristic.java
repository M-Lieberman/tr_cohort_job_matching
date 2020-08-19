package com.tr.assessment;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Job Characteristic details
 */
public class JobCharacteristic {

    private String characteristic;
    private List<String> keywords = new ArrayList<>();
    private static final int matchScore = 20;


    public JobCharacteristic(String characteristic, List<String> keywords) {
        this.characteristic = characteristic;
        this.keywords = keywords;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public int getMatchScore() {
        return matchScore;
    }

    @Override
    public String toString() {
        return "JobCharacteristic{" +
                "characteristic='" + characteristic + '\'' +
                ", keywords=" + keywords +
                '}';
    }
}
