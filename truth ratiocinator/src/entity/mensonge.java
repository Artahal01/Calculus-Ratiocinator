package entity;

import java.sql.Array;

public class mensonge {
    private java.sql.Array mensonge;

    public mensonge(Array mensonge) {
        this.mensonge=mensonge;
    }

    public java.sql.Array getMensonge() {
        return mensonge;
    }

    public void setMensonge( java.sql.Array mensonge) {
        this.mensonge = mensonge;
    }
}
