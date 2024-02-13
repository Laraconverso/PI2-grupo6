package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="coaches")
public class Coach extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="coach_number")
    private Long coachNumber;

    @Column(name="coach_dni")
    private Long coachDni;

    @OneToMany(mappedBy = "coach", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Team> assignedTeams =new HashSet<Team>();

    public Coach() {
    }

    public Coach(Long coachNumber, Long coachDni, Set<Team> assignedTeams) {
        this.coachNumber = coachNumber;
        this.coachDni = coachDni;
        this.assignedTeams = assignedTeams;
    }

    public Coach(String userName, String userLastname, String userDni, String userEmail, String userAddress, Role role, Club club, Long coachNumber,Long coachDni, Set<Team> assignedTeams) {
        super(userName, userLastname, userDni, userEmail, userAddress, role, club);
        this.coachNumber = coachNumber;
        this.coachDni = coachDni;
        this.assignedTeams = assignedTeams;
    }

    public Coach(Long idUser, String userName, String userLastname, String userDni, String userEmail, String userAddress, Role role, Club club, Long coachNumber, Long coachDni, Set<Team> assignedTeams) {
        super(idUser, userName, userLastname, userDni, userEmail, userAddress, role, club);
        this.coachNumber = coachNumber;
        this.coachDni = coachDni;
        this.assignedTeams = assignedTeams;
    }

    public Coach(String userDni, Long coachNumber, Long coachDni, Set<Team> assignedTeams) {
        super(userDni);
        this.coachNumber = coachNumber;
        this.coachDni = coachDni;
        this.assignedTeams = assignedTeams;
    }

    public Long getCoachNumber() {
        return coachNumber;
    }

    public void setCoachNumber(Long coachNumber) {
        this.coachNumber = coachNumber;
    }

    public Long getCoachDni() {
        return coachDni;
    }

    public void setCoachDni(Long coachDni) {
        this.coachDni = coachDni;
    }

    public Set<Team> getAssignedTeams() {
        return assignedTeams;
    }

    public void setAssignedTeams(Set<Team> assignedTeams) {
        this.assignedTeams = assignedTeams;
    }
}
