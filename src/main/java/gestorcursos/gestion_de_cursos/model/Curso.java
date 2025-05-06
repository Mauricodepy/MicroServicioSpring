package gestorcursos.gestion_de_cursos.model;

import java.time.LocalDate;
//import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Curso {

    private int cursoId;
    private String nombreCurso, nombreUsuario,nombreDocente;
    private LocalDate fecha_ini_curso, fecha_fin_curso;

}
