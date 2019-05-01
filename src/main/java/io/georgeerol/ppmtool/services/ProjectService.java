package io.georgeerol.ppmtool.services;

import io.georgeerol.ppmtool.domain.Project;
import io.georgeerol.ppmtool.exception.ProjectIdException;
import io.georgeerol.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by George Fouche on 4/28/19.
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public Project saveOrUpdateProject(Project project){

        //Logic
        try{
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);

        }catch (Exception e){
            throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"' already exists");
        }
    }

    public Project findByProjectIdentifier(String projectId){
        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
        if(project == null){
            throw new ProjectIdException("Project ID '"+ projectId.toUpperCase()+"' does not exist");
        }
        return project;
    }

}
