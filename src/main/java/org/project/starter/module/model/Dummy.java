package org.project.starter.module.model;

import javax.persistence.*;

public class Dummy {
    @Column(name = "DUMMY")
    private String dummy;

    /**
     * @return DUMMY
     */
    public String getDummy() {
        return dummy;
    }

    /**
     * @param dummy
     */
    public void setDummy(String dummy) {
        this.dummy = dummy;
    }
}