package com.razortype.GameStoreSystem.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.razortype.GameStoreSystem.entities.abstracts.UserInfoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserInfo implements UserInfoEntity {


    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "credit_card")
    private String credit_card;

    @Id
    @Column(name = "user_id")
    private int user_id;

}
