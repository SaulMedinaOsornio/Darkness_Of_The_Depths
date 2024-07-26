package mx.com.darkness_of_the_depths.model;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String cellPhone;
    private int shippingId;
    private Adress adress;
}
