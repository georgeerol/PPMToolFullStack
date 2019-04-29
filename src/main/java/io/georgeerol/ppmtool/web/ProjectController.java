package io.georgeerol.ppmtool.web;

import io.georgeerol.ppmtool.domain.Project;
import io.georgeerol.ppmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by George Fouche on 4/28/19.
 */

@RestController
@RequestMapping("/api/project")
public class ProjectController {


    @Autowired
    private ProjectService projectService;


    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project) {
        return new ResponseEntity<>(project, HttpStatus.CREATED);
    }

}
