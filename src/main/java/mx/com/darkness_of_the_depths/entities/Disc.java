package mx.com.darkness_of_the_depths.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Disc {

    private String name;
    private String lunchDate;
    private String genre;
    private String band;
    private String artist;
    private Double price;
    private String urlImage;
}
