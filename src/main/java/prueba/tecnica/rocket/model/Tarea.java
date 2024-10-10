package prueba.tecnica.rocket.model;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Tarea {
    private Long id;
    private String nombre;
    private String descripcion;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaInicio;
}
