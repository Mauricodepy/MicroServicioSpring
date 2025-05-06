package gestorcursos.gestion_de_cursos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestorcursos.gestion_de_cursos.model.Curso;
import gestorcursos.gestion_de_cursos.model.Entity.CursoEntity;
import gestorcursos.gestion_de_cursos.repository.CursoRepository;

@Service

public class CursoService {
    @Autowired
    private CursoRepository cursorepository;

    public String crearCurso(Curso cur){

        try{
            boolean estado = cursorepository.exitsBycursoId(cur.getCursoId());
            if (!estado){
                CursoEntity cursoNuevo= new CursoEntity();
                cursoNuevo.setCursoId(cur.getCursoId());
                cursoNuevo.setNombreCurso(cur.getNombreCurso());
                cursoNuevo.setNombreDocente(cur.getNombreDocente());
                cursoNuevo.setNombreUsuario(cur.getNombreUsuario());
                cursoNuevo.setFecha_ini_curso(cur.getFecha_ini_curso());
                cursoNuevo.setFecha_fin_curso(cur.getFecha_fin_curso());
                cursorepository.save(cursoNuevo);// metodo no creado en repository pero que existe y guarda en base de datos
                return "el curso fue creado";
            }
            return "el curso existe";
        }
        catch (Exception e) {
            return "curso no creado";
        }


    }

    public Curso mostrarCursos(Integer cursoId){
        try{
            CursoEntity curso=cursorepository.findBycursoId(cursoId);
            if (curso != null){
                Curso cur = new Curso(
                    curso.getCursoId(),
                    curso.getNombreCurso(),
                    curso.getNombreDocente(),
                    curso.getNombreUsuario(),
                    curso.getFecha_ini_curso(),
                    curso.getFecha_fin_curso()
                );
                return cur;
            }
            return null;
        }catch(Exception e){
            return null;
        }
    }

    //public String borrarCurso(int cursoId){//borrar curso

    //}
    //public String listar
}
