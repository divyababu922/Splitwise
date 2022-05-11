package com.splittter.jpa.domains;

import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface UsersRepository extends CrudRepository<UserTable, Long> {
	List<UserTable> findByUnameContaining(String unmae);
}
