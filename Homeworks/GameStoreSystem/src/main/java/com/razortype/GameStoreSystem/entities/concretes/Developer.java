package com.razortype.GameStoreSystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.razortype.GameStoreSystem.entities.abstracts.DeveloperEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "developers")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Developer implements DeveloperEntity {

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "companyKey")
    private String companyKey;

    @Column(name = "Validation")
    private Boolean validation;

    @Id
    @Column(name = "userId")
    private int userId;


}
