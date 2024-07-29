package mx.com.darkness_of_the_depths.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String name;
    private String email;
    private String password;
    private String cellPhone;
    private int shippingId;
    private Adress adress;
}
