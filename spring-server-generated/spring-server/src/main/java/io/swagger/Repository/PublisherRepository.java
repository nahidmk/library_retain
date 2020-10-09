package io.swagger.Repository;

import io.swagger.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Long> {

    Publisher findByName(String Name);
    boolean existsByName(String Name);
    Publisher findById (Long id);
}
