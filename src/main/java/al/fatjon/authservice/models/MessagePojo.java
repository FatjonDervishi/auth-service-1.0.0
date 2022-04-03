package al.fatjon.authservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessagePojo {
    private String message;
    
    public MessagePojo(String message) {
        this.message = message;
    }
}
