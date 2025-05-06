package gestorcursos.gestion_de_cursos.model.Entity;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@EntityScan
@Data


public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cursoId;

    @Column(name = "Nombre Curso")
    private String nombreCurso;
    
    @Column(name = "Nombre Usuario")
    private String nombreUsuario;
    
    @Column(name = "Nombre Docente")
    private String nombreDocente; 
    
    @Column(name = "Fecha de inicio")
    private LocalDate fecha_ini_curso;

    @Column(name = "Fecha de termino")
    private LocalDate fecha_fin_curso;
}
