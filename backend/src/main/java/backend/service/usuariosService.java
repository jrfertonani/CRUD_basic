package backend.service;

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

    
}
