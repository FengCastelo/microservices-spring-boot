package com.fengcastelo.ms_oauth.Entities;

import java.io.Serializable;
import java.util.Objects;

public class Role implements Serializable {

    private Long id;
    private String roleName;

    public Role(){
    }

    public Role(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Role roles = (Role) o;
        return Objects.equals(id, roles.id) && Objects.equals(roleName, roles.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName);
    }
}
