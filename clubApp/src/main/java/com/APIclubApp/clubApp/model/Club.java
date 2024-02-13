package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_club")
    private Long idClub;

    @Column(name = "club_name", nullable = false, unique = true)
    private String clubName;

    @Column(name = "club_logo", nullable = false)
    private String clubLogo;

    @Column(name = "club_description", nullable = false)
    private String clubDescription;

    @OneToMany(mappedBy = "club", fetch = FetchType.EAGER)
    @JsonIgnore
    //private List<User> usersClub;
    private Set<Coach> coaches =new HashSet<Coach>();

    @OneToMany(mappedBy = "club", fetch = FetchType.EAGER)
    @JsonIgnore
    //private List<User> usersClub;
    private Set<Member> members =new HashSet<Member>();

    public Club() {
    }

    public Club(String clubName, String clubLogo, String clubDescription) {
        this.clubName = clubName;
        this.clubLogo = clubLogo;
        this.clubDescription = clubDescription;
    }

    public Club(String clubName, String clubLogo, String clubDescription, Set<Coach> coaches, Set<Member> members) {
        this.clubName = clubName;
        this.clubLogo = clubLogo;
        this.clubDescription = clubDescription;
        this.coaches = coaches;
        this.members = members;
    }

    public Club(Long idClub, String clubName, String clubLogo, String clubDescription, Set<Coach> coaches, Set<Member> members) {
        this.idClub = idClub;
        this.clubName = clubName;
        this.clubLogo = clubLogo;
        this.clubDescription = clubDescription;
        this.coaches = coaches;
        this.members = members;
    }

    public Long getIdClub() {
        return idClub;
    }

    public void setIdClub(Long idClub) {
        this.idClub = idClub;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubLogo() {
        return clubLogo;
    }

    public void setClubLogo(String clubLogo) {
        this.clubLogo = clubLogo;
    }

    public String getClubDescription() {
        return clubDescription;
    }

    public void setClubDescription(String clubDescription) {
        this.clubDescription = clubDescription;
    }

    public Set<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(Set<Coach> coaches) {
        this.coaches = coaches;
    }

    public Set<Member> getPartners() {
        return members;
    }

    public void setPartners(Set<Member> members) {
        this.members = members;
    }
}
