package com.ehsan.dockerExample;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Builder
@Data
@Getter
@Setter
public class FruitModel implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String color;


    public FruitModel() {
    }

    public FruitModel(int id,
                      String name,
                      String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

}
