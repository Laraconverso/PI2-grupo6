package com.APIclubApp.clubApp.model;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="members")
public class Member extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "member_number")
    private Long memberNumber;

    //@OneToMany(mappedBy = "partner", fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    //@JsonIgnore
    //private List<Player> playersPartner;
    private Set<Player> playersMember =new HashSet<Player>();

    @Column(name = "member_feePaid", nullable = false, unique = false)
    private Boolean memberFeePaid;

    @Column(name = "member_ChangePassword", nullable = false, unique = false)
    private Boolean memberChangePassword;

    @Column(name = "member_token", nullable = false, unique = false)
    private String memberToken;

    public Member() {
    }


    public Member(String userName, String userLastname, String userDni, String userEmail, String userAddress, Role role, Club club, Long memberNumber, Set<Player> playersMember, Boolean memberFeePaid, Boolean memberChangePassword, String memberToken) {
        super(userName, userLastname, userDni, userEmail, userAddress, role, club);
        this.memberNumber = memberNumber;
        this.playersMember = playersMember;
        this.memberFeePaid = memberFeePaid;
        this.memberChangePassword = memberChangePassword;
        this.memberToken = memberToken;
    }


    public Long getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(Long memberNumber) {
        this.memberNumber = memberNumber;
    }

    public Set<Player> getPlayersMember() {
        return playersMember;
    }

    public void setPlayersMember(Set<Player> playersMember) {
        this.playersMember = playersMember;
    }

    public Boolean getMemberFeePaid() {
        return memberFeePaid;
    }

    public void setMemberFeePaid(Boolean memberFeePaid) {
        this.memberFeePaid = memberFeePaid;
    }

    public Boolean getMemberChangePassword() {
        return memberChangePassword;
    }

    public void setMemberChangePassword(Boolean memberChangePassword) {
        this.memberChangePassword = memberChangePassword;
    }

    public String getMemberToken() {
        return memberToken;
    }

    public void setMemberToken(String memberToken) {
        this.memberToken = memberToken;
    }
}
