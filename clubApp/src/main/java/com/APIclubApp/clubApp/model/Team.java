package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_team")
    private Long idTeam;

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "coach_number")
   // @JoinColumn(name="coach_number")
    private Coach coach;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_category")
    private Category category;

    @Column(name = "team_name", nullable = false, unique = false)
    private String teamName;

    @Column(name = "team_schedule", nullable = false, unique = false)
    private String teamSchedule;

    @Column(name = "team_daytraining", nullable = false, unique = false)
    private String teamDaytraining;

    @Column(name = "team_fee", nullable = false, unique = false)
    private String teamFee;

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Player> playersTeam = new HashSet<Player>();

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Game> gamesTeam = new HashSet<Game>();


    public Team() {
    }

    public Team(Coach coach, Category category, String teamName, String teamSchedule, String teamDaytraining, String teamFee, Set<Player> playersTeam) {
        this.coach = coach;
        this.category = category;
        this.teamName = teamName;
        this.teamSchedule = teamSchedule;
        this.teamDaytraining = teamDaytraining;
        this.teamFee = teamFee;
        this.playersTeam = playersTeam;

    }

    public Team(Long idTeam, Coach coach, Category category, String teamName, String teamSchedule, String teamDaytraining, String teamFee, Set<Player> playersTeam) {
        this.idTeam = idTeam;
        this.coach = coach;
        this.category = category;
        this.teamName = teamName;
        this.teamSchedule = teamSchedule;
        this.teamDaytraining = teamDaytraining;
        this.teamFee = teamFee;
        this.playersTeam = playersTeam;

    }

    public Long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamSchedule() {
        return teamSchedule;
    }

    public void setTeamSchedule(String teamSchedule) {
        this.teamSchedule = teamSchedule;
    }

    public String getTeamDaytraining() {
        return teamDaytraining;
    }

    public void setTeamDaytraining(String teamDaytraining) {
        this.teamDaytraining = teamDaytraining;
    }

    public String getTeamFee() {
        return teamFee;
    }

    public void setTeamFee(String teamFee) {
        this.teamFee = teamFee;
    }

    public Set<Player> getPlayersTeam() {
        return playersTeam;
    }

    public void setPlayersTeam(Set<Player> playersTeam) {
        this.playersTeam = playersTeam;
    }

}
