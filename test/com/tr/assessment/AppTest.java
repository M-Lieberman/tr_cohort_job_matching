package com.tr.assessment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise
 * Tech Returners want to improve the conversations we have with our cohorts such that we want to really understand which jobs match our cohort
 * members.
 * Your task is to write a function that accepts a list of job characteristics and a list of individual skills/characteristics. It should use those two
 * different sets of characteristics to provide a match score between 0 and 100. Where 100 is the ideal match and 0 indicates definitely do NOT
 * show this person that job.
 * An example list of job characteristics might be (please create others to test out your code):
 * Job A characteristics: “remote” “flexible working hours”
 * Job B characteristics: “office based two days per week” “react developer”
 * Individual A skills/characteristics: “wants to work remote” “react experience” “looking for frontend”
 * Individual B skills/characteristics: “backend developer” “cloud experience” “AWS certified”
 */

class AppTest {

    static final App app = new App();



    @Test
    void findBestJob() {
        Individual person = new Individual("A", List.of("wants to work remote", "react experience"));
        int actual = app.findBestJob(person);
        assertEquals(0, actual);
    }


    @Test
    void createJobCharacteristic() {
        List<String> keywords = List.of("remote", "flexible working");
        var jobCharacteristic = new JobCharacteristic("remote", keywords);
        System.out.println(jobCharacteristic);
        assertNotNull(jobCharacteristic);
    }

    @Test
    @Disabled("can't remember how to assert a class is in a list - probably hamcrest needed")
    void buildJobList() {
        List<Job> jobsList = buildTestJobsList();
    }

    // edge cases
    // new characteristics
    //

    private List<Job> buildTestJobsList() {
        List<Job> jobs = new ArrayList<>();
        List<JobCharacteristic> jobACharacteristics = new ArrayList<>();
        var keywords = new JobCharacteristic("remote", List.of("remote"));
        var jobA = new Job(JobName.A, jobACharacteristics);
        jobs.add(jobA);
        return jobs;
    }


}