package io.georgeerol.ppmtool.repositories;

import io.georgeerol.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by George Fouche on 4/28/19.
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String projectId);

}
