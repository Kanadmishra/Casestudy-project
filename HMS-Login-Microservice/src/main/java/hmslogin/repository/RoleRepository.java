package hmslogin.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import hmslogin.models.ERole;
import hmslogin.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
