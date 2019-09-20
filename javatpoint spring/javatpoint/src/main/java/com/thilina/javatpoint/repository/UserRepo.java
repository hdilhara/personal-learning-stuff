package com.thilina.javatpoint.repository;

import com.thilina.javatpoint.model.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserRecord,Integer> {
}
