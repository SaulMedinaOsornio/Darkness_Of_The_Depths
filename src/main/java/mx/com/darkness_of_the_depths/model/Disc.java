package mx.com.darkness_of_the_depths.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Disc {
    private String name;
    private String launchDate;
    private String genre;
    private String band;
    private String artist;
    private Double price;
    private String urlImage;
}
