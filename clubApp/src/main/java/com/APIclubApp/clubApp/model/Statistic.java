package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="statistics")
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_statistic")
    private Long idStatistic;

    @Column(name= "goal_scored", nullable = false, unique = false)
    private Integer goalScored;

    @Column(name= "goal_assisted", nullable = false, unique = false)
    private Integer goalAssisted;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Player")
    private Player player;

    public Statistic() {
    }

    public Statistic(Integer goalScored, Integer goalAssisted, Player player) {
        this.goalScored = goalScored;
        this.goalAssisted = goalAssisted;
        this.player = player;
    }

    public Statistic(Long idStatistic, Integer goalScored, Integer goalAssisted, Player player) {
        this.idStatistic = idStatistic;
        this.goalScored = goalScored;
        this.goalAssisted = goalAssisted;
        this.player = player;
    }

    public Long getIdStatistic() {
        return idStatistic;
    }

    public void setIdStatistic(Long idStatistic) {
        this.idStatistic = idStatistic;
    }

    public Integer getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(Integer goalScored) {
        this.goalScored = goalScored;
    }

    public Integer getGoalAssisted() {
        return goalAssisted;
    }

    public void setGoalAssisted(Integer goalAssisted) {
        this.goalAssisted = goalAssisted;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
