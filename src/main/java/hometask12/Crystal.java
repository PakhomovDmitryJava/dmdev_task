package hometask12;

import java.util.Objects;

public class Crystal {
    private CrystalColorEnum color;

    public Crystal(CrystalColorEnum color) {
        this.color = color;
    }

    public CrystalColorEnum getColor() {
        return color;
    }

    public void setColor(CrystalColorEnum color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Crystal{" +
                "color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crystal crystal = (Crystal) o;
        return color == crystal.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

