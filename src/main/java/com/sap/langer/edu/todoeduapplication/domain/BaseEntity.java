package com.sap.langer.edu.todoeduapplication.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime modified;

    public boolean isNew() {
        return id == null;
    }

    @PostPersist
    private void created() {
        this.created = LocalDateTime.now();
        this.modified = this.created;
    }

    @PostUpdate
    private void updated() {
        this.modified = LocalDateTime.now();
    }
}
