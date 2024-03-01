package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Planet {

    @Id
    private String id;

    private String name;

}

