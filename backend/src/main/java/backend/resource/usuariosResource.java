package backend.resource;

import backend.service.usuariosService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuarios")
public class usuariosResource {

    @Autowired
    public ModelMapper mapper;

    @Autowired
    public usuariosService service;

}
