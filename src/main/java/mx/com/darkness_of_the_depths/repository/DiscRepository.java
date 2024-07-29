package mx.com.darkness_of_the_depths.repository;

import mx.com.darkness_of_the_depths.entities.Disc;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DiscRepository {

    public List<Disc> findAll() {
        List<Disc> discs = new ArrayList<>();
        discs.add(new Disc(
                "Burzum",
                "1992",
                "Black Metal",
                "Burzum",
                "Burzum",
                20.65d,
                "https://www.burzum.org/img/covers/small/official/1992_burzum.jpg"
        ));
        return discs;
    }

    public Disc findById(Long id) {
        String query = "SELECT * FROM disc WHERE id_disc = " + id;
        Disc disc = new Disc("Burzum", "1992", "Black Metal", "Burzum", "Burzum", 20.65d, "https://www.burzum.org/img/covers/small/official/1992_burzum.jpg");
        return disc;
    }

    public void save(Disc disc) {
    }

    public void deleteById(Long id) {
    }
}
