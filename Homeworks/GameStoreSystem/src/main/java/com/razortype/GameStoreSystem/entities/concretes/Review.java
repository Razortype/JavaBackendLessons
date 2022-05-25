package com.razortype.GameStoreSystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.razortype.GameStoreSystem.entities.abstracts.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Review implements ReviewEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "gameId")
    private int gameId;

    @Column(name = "userId")
    private int userId;

    @Column(name = "content")
    private String content;

}
