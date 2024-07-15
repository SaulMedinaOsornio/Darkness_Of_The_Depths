package mx.com.darkness_of_the_depths.controller.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Band {
    private String name;
    private Date creationDate;
    private String description;
    private List<Artista> artists;

    public Band(String name){
        this.name = name;
    }
}
