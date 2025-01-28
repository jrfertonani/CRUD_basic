package backend.entity.DTO;

import backend._config.Enums.Status;
import lombok.Data;

import java.io.Serial;

@Data
public class usuariosDTO {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Status status;


}
