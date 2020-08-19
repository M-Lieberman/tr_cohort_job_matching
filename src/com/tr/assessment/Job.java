package com.tr.assessment;

import java.util.ArrayList;
import java.util.List;

public class Job {
    private JobName jobName;
    private List<JobCharacteristic> characteristics = new ArrayList<>();
    private final static int matchTotal = 100;

    public Job(JobName jobName, List<JobCharacteristic> characteristics) {
        this.jobName = jobName;
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobName=" + jobName +
                ", characteristics=" + characteristics +
                '}';
    }
}
