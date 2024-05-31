package com.example.tareitagtics.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UserId implements Serializable {
    private static final long serialVersionUID = -8885499861059639159L;
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "idrol", nullable = false)
    private Integer idrol;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserId entity = (UserId) o;
        return Objects.equals(this.idrol, entity.idrol) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idrol, id);
    }

}