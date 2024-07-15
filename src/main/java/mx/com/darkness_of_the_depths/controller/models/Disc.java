package mx.com.darkness_of_the_depths.controller.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Disc {
    private String name;
    private String lunchDate;
    private String genre;
    private Band band;
    private Double price;
    private String urlImage;
}
