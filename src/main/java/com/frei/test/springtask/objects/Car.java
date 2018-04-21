package com.frei.test.springtask.objects;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@NoArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode
@Entity
public class Car {
    @Id @GeneratedValue
    private long id;
    @NonNull
    private String name;
}
