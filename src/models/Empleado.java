package models;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public int hashCode(){
        return id + name.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Empleado otraPersona = (Empleado) obj;
        return Objects.equals(name, otraPersona.name) && id == otraPersona.id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public int compareTo(Empleado o) {
        int result = Integer.compare(this.id, o.id);
        if (result != 0) {
            return result;
        }
        int nombre = this.name.compareTo(o.name);
        return nombre;

    }
}