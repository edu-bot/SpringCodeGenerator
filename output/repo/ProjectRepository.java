package com.radicalz.persistence.repo;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.data.rest.core.annotation.RepositoryRestResource;import com.radicalz.persistence.model.Project;@RepositoryRestResource(collectionResourceRel = "projects", path = "projects")public interface ProjectRepository extends JpaRepository<Project, Integer>{}