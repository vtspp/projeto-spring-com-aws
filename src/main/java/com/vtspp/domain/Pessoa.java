package com.vtspp.domain;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String hobby;
}
