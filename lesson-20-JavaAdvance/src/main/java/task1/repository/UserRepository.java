package task1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import task1.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUserName(String username);
}
