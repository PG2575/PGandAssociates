package com.cafirm.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;








@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Clients {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private long fees;
    private String workType;
}
