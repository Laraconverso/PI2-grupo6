package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="calendars")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calendar")
    private Long idCalendar;

    @OneToMany(mappedBy = "calendar", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Game> gamesCalendar = new HashSet<Game>();

    public Calendar() {
    }

    public Calendar(Set<Game> gamesCalendar) {
        this.gamesCalendar = gamesCalendar;
    }

    public Calendar(Long idCalendar, Set<Game> gamesCalendar) {
        this.idCalendar = idCalendar;
        this.gamesCalendar = gamesCalendar;
    }

    public Long getIdCalendar() {
        return idCalendar;
    }

    public void setIdCalendar(Long idCalendar) {
        this.idCalendar = idCalendar;
    }

    public Set<Game> getGamesCalendar() {
        return gamesCalendar;
    }

    public void setGamesCalendar(Set<Game> gamesCalendar) {
        this.gamesCalendar = gamesCalendar;
    }
}
