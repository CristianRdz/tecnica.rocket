package prueba.tecnica.rocket.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import prueba.tecnica.rocket.model.Tarea;

import java.util.List;

@Mapper
public interface RepositoryTarea {

    @Select("SELECT * FROM Tarea")
    List<Tarea> obtenerTodasLasTareas();

    @Insert("INSERT INTO Tarea(nombre, descripcion, fechaInicio) VALUES(#{nombre}, #{descripcion}, #{fechaInicio})")
    void guardarTarea(Tarea tarea);

    @Select("SELECT * FROM Tarea WHERE id = #{id}")
    Tarea obtenerTareaPorId(Long id);

    @Select("DELETE FROM Tarea WHERE id = #{id}")
    void eliminarTarea(Long id);
}