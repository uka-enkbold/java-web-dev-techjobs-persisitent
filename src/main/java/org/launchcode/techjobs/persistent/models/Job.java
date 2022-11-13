package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;
    @ManyToMany // TODO: @ManyToMany
    private List<Skill> skills;

    public Job() {
    }
// test 3 initially empty arraylist is not passing
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List <Skill> skills) {
        this.skills = skills;
    }

    @Override
    public Object get() {
        return null;
    }
}
