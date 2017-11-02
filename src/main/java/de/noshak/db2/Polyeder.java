package de.noshak.db2;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="polyeder")
@SuppressWarnings("serial")
public class Polyeder implements Serializable
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long id;

    public String name;

    public Polyeder() {
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("POL(%d,%s)", id, name);
    }
}