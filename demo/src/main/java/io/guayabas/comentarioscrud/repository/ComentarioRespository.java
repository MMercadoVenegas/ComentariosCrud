package io.guayabas.comentarioscrud.repository;

import io.guayabas.comentarioscrud.repository.model.ComentarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRespository
        extends CrudRepository<ComentarioEntity, Integer> {
}
