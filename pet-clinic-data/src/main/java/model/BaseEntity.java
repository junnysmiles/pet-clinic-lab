package model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    private Long Id;
}
