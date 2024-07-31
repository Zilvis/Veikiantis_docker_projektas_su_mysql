package dev.zilvis.dockerapitest2.repository;

import dev.zilvis.dockerapitest2.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
