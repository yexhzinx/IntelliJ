package com.example.demo.Dto;

import lombok.*;

//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PersonDto {
    private String name;
    private int age;
    private String addr;

}
