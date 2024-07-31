package dev.zilvis.dockerapitest2.repository;

import dev.zilvis.dockerapitest2.models.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
}
