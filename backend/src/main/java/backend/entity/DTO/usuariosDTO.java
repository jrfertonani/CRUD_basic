package backend.entity.DTO;

import backend._config.Enums.Status;

import java.io.Serial;


public class usuariosDTO {
    @Serial
    private static final long serialVersionUID = 1L;


    private String name;
    private Status status;

    public usuariosDTO() {
    }

    public usuariosDTO(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
