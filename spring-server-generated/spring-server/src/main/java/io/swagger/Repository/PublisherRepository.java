package io.swagger.Repository;

import io.swagger.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Long> {

    List<Publisher> findByName(String Name);
    boolean existsByName(String Name);
    Publisher findById (Long id);
}
