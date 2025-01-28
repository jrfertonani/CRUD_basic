package backend.resource;

import backend.entity.DTO.usuariosDTO;
import backend.service.usuariosService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@CrossOrigin("*")
@RestController
@RequestMapping("/usuarios")
public class usuariosResource {

    @Autowired
    public ModelMapper mapper;

    @Autowired
    public usuariosService service;

    @PostMapping
    public ResponseEntity<usuariosDTO> save(@RequestBody usuariosDTO DTO) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        service.save(DTO)
                ).toUri();
        return ResponseEntity.created(uri).body(DTO);
    }

}
