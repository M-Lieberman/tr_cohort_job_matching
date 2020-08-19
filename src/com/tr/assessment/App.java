package com.tr.assessment;

import java.util.ArrayList;
import java.util.List;

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

public class App {


    // TODO
    /**
     * My Plan
     * Main class is App
     * Test class is AppTest - goal was to TDD but lost in some rusty coding skills:)
     *
     * create classes to map out Jobs, Characteristics, and Individuals
     * create a Job class - Job Id, Characteristic, matched value = 100
     * create a class for Job Characteristics - characteristic, keywords (for matching against individual skills), matchScore = 20(?)
     * Create a class for Individual - Id, characteristics, score
     * Characteristics will contain a list of keywords for matching
     * Build a list of Jobs with Characteristics
     * Create an Individual with a list of keywords for skills
     * run Individual through matcher to match against Job Characteristics to get match score
     * Cycle Individual skills/characteristics against Job characteristic keywords
     * Matcher could match using RegEx, but probably a framework or library that would do this better. To investigate
     * Compare Individual score against Jobs to see which matched best
     * Return the winning Job
     */


    public List<Job> buildJobsList() {
        List<Job> jobsList = new ArrayList<>();
        return jobsList;
    }


    // TODO change from match value to Job name
    public int findBestJob(Individual individual) {

        // match individual against job list
        var jobMatcher = new JobMatcher();
        int score = jobMatcher.getMatchScore(buildJobsList(), individual);

        return score;
    }

}
