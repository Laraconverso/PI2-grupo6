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

    @Column(name = "club_u", nullable = false)
    private String productDescription;

    @OneToMany(mappedBy = "club", fetch = FetchType.EAGER)
    @JsonIgnore
    //private List<User> usersClub;
    private Set<User> usersClub =new HashSet<User>();

    public Club() {
    }

    public Club(Long idClub, String clubName, String clubLogo, String productDescription, Set<User> usersClub) {
        this.idClub = idClub;
        this.clubName = clubName;
        this.clubLogo = clubLogo;
        this.productDescription = productDescription;
        this.usersClub = usersClub;
    }

    public Club(String clubName, String clubLogo, String productDescription, Set<User> usersClub) {
        this.clubName = clubName;
        this.clubLogo = clubLogo;
        this.productDescription = productDescription;
        this.usersClub = usersClub;
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

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Set<User> getUsersClub() {
        return usersClub;
    }

    public void setUsersClub(Set<User> usersClub) {
        this.usersClub = usersClub;
    }
}
