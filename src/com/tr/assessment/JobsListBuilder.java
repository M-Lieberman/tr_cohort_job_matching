package com.tr.assessment;

import java.util.ArrayList;
import java.util.List;

/**
 * Build a list of jobs
 */
public class JobsListBuilder {

    private final static List<Job> jobsList = new ArrayList<>();

    public void JobListBuilder() {

        // initialise Job A
        List<JobCharacteristic> jobACharacteristics = new ArrayList<>();

        buildCharacteristics(jobACharacteristics, "remote", List.of("remote"));
        buildCharacteristics(jobACharacteristics, "flexible working hours", List.of("flexible working", "work remote", "remote working", "part time"));

        var jobA = new Job(JobName.A, jobACharacteristics);
        jobsList.add(jobA);


        // initialise Job B
        List<JobCharacteristic> jobBCharacteristics = new ArrayList<>();

        buildCharacteristics(jobACharacteristics, "office based two days per week", List.of("office"));
        buildCharacteristics(jobACharacteristics, "react developer", List.of("react"));
        var jobB = new Job(JobName.B, jobACharacteristics);
        jobsList.add(jobB);
    }

    private void buildCharacteristics(List<JobCharacteristic> characteristics, String s, List<String> strings) {
        var keywords = new JobCharacteristic(s, strings);
        characteristics.add(keywords);
    }

}
