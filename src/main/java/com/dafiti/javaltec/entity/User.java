package com.dafiti.javaltec.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
@EqualsAndHashCode
@ToString
public class User {
    @Id
    private String id;
    private String name;
    private Date date = new Date();
}
