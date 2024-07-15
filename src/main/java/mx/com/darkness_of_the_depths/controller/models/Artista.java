package mx.com.darkness_of_the_depths.controller.models;

import lombok.Data;

import java.util.Date;

@Data
public class Artista {
    private String name;
    private String band;
    private Date birthDay;
    private String description;
    private String country;
}
