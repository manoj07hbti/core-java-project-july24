package model;

import java.util.Objects;

public class Docter {
String name;
int experience;
String post;

    public Docter(String name, int experience, String post) {
        this.name = name;
        this.experience = experience;
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docter docter = (Docter) o;
        return experience == docter.experience && Objects.equals(name, docter.name) && Objects.equals(post, docter.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience, post);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
