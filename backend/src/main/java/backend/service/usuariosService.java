package backend.service;

import backend.entity.DTO.usuariosDTO;
import backend.entity.model.Usuarios;
import backend.repository.usuariosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class usuariosService {

    @Autowired
    public ModelMapper mapper;

    @Autowired
    public usuariosRepository repository;


    public Usuarios save(usuariosDTO DTO) {
        return repository.save(
                mapper.map(DTO, Usuarios.class)
        );
    }
}
