package com.sap.langer.edu.todoeduapplication.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class ToDoList extends BaseEntity {
    @Basic
    @Column(length = 255, nullable = false)
    private String title;

    @Enumerated(EnumType.STRING)
    private ToDoListStatus status;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime statusChanged;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "toDoList")
    @ToString.Exclude
    private List<ToDoTask> tasks;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        ToDoList toDoList = (ToDoList) o;
        return getId() != null && Objects.equals(getId(), toDoList.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
