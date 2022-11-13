package org.launchcode.techjobs.persistent.models;

import org.hibernate.validator.constraints.Length;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
// make it entity annotation
public class Employer extends AbstractEntity {
//    make it reasonable length either length or size make it also String
//    @Length()
    @Size (min=1, max=50)
    @NotBlank
    // i dunno if I need to create size () method to check or there is size method same as @length
    private String location;

    @OneToMany
//    @JoinColumn(name = "id")
    @Size (min=1, max=50)

    @JoinColumn(name = "employer_id")

    private List<Job> jobs = new ArrayList<>();

    public Employer () {
//no arg constructor
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }
//    how to make only one location?

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPresent() {
        return true;
    }

    @Override
    public Object get() {
        return null;
    }
}
