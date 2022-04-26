package com.razortype.GameStoreSystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.razortype.GameStoreSystem.entities.abstracts.GameOwnershipEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_game_ownership")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class GameOwnership implements GameOwnershipEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "game_id")
    private int game_id;

}
