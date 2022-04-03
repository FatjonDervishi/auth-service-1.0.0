package al.fatjon.authservice.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class LoginPojo {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
}
