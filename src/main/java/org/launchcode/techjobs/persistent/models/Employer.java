package org.launchcode.techjobs.persistent.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @Length(min=1, max=50)
    private String location;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Job> jobs;

    public Employer () {

    }

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
