package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

//To map the Employer and Skill classes to your techjobs database,
// you’ll add data access interfaces for these relational objects

public interface JobRepository extends CrudRepository<Job, Integer> {
}
