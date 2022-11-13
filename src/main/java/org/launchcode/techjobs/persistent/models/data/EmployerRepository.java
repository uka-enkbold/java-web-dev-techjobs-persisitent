package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

// CrudRepository that contains methods for CRUD operations.
// It provides generic Crud operation on a repository. It is defined in the package org. springframework

public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}
