package com.sap.langer.edu.todoeduapplication.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
