package gestorcursos.gestion_de_cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestorcursos.gestion_de_cursos.model.Entity.CursoEntity;

@Repository

public interface CursoRepository extends JpaRepository<CursoEntity, Integer>{

    CursoEntity findBycursoId(Integer cursoId);
    boolean exitsBycursoId(Integer cursoId);
    void deleteBycursoId(Integer cursoId);

    
}
