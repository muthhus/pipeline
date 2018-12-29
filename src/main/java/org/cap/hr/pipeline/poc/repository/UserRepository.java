package org.cap.hr.pipeline.poc.repository;

import org.cap.hr.pipeline.poc.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
