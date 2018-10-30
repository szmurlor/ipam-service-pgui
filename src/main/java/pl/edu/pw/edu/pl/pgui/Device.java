package pl.edu.pw.edu.pl.pgui;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "devices")
public class Device implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;
    private String ip;
    private String location;

    @Column(length=2048)
    private String description;

    private int numUs;


    protected Device() {

    }

    public Device(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumUs() {
        return numUs;
    }

    public void setNumUs(int numUs) {
        this.numUs = numUs;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
