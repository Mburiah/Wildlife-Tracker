import org.sql2o.Connection;
import java.util.List;

public class Sighting {
    private String animal;
    private String location;
    private String ranger_name;

    public Sighting(String animal, String location, String rangername){
        this.animal=animal;
        this.location=location;
        this.ranger_name=rangername;
    }

    public String getAnimal() {
        return animal;
    }

    public String getLocation() {
        return location;
    }

    public String getRanger_name() {
        return ranger_name;
    }

    public void add(){
        try(Connection conn =  DB.sql2o.open()){
            conn.createQuery("insert into sightings(animal, location, ranger_name) VALUES(:animal, :location, :ranger_name)")
                    .addParameter("animal", this.animal)
                    .addParameter("location", this.location)
                    .addParameter("ranger_name", this.ranger_name)
                    .executeUpdate();
        }
    }
    public static List<Sighting> getAll(){
        try (Connection conn = DB.sql2o.open()) {
            return conn.createQuery("select *from sightings").executeAndFetch(Sighting.class);
        }
    }
}
