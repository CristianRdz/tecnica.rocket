package prueba.tecnica.rocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import prueba.tecnica.rocket.model.Tarea;
import prueba.tecnica.rocket.repository.RepositoryTarea;

@Controller
@RequestMapping("/")
public class TareaControlador {

    private final RepositoryTarea tareaRepositorio;

    public TareaControlador(RepositoryTarea tareaRepositorio) {
        this.tareaRepositorio = tareaRepositorio;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mostrarInicio() {
        return "inicio";
    }

    @RequestMapping(value = "/formularioTarea", method = RequestMethod.GET)
    public String mostrarFormularioTarea(Model model) {
        model.addAttribute("tarea", new Tarea());
        return "formularioTarea";
    }

    @RequestMapping(value = "/guardarTarea", method = RequestMethod.POST)
    public String guardarTarea(@ModelAttribute Tarea tarea) {
        tareaRepositorio.guardarTarea(tarea);
        return "redirect:/listarTareas";
    }

    @RequestMapping(value = "/listarTareas", method = RequestMethod.GET)
    public String listarTareas(Model model) {
        model.addAttribute("listaTareas", tareaRepositorio.obtenerTodasLasTareas());
        return "listaTareas";
    }

    @RequestMapping(value = "/eliminarTarea/{id}", method = RequestMethod.GET)
    public String eliminarTarea(@PathVariable Long id) {
        tareaRepositorio.eliminarTarea(id);
        return "redirect:/listarTareas";
    }
}
