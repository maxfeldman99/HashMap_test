import java.util.Objects;

public class Driver implements Comparable<Driver> {
    private String name;
    private int id;

    public Driver(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return id == driver.id;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }


    @Override
    public int compareTo(Driver o) {
        if (this.id > o.id) {
            return 1;
        }
        else if(this.id < o.id){
            return -1;
        }

        return 0;
    }

}

