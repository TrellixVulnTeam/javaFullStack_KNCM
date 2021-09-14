package com.md.Springdatajpaproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({

        @AttributeOverride(
                name = "name",
                column =@Column(name = "parent_name")
        ),
        @AttributeOverride(
                name = "phone",
                column =@Column(name = "parent_pnone")
        ),
        @AttributeOverride(
                name = "email",
                column =@Column(name = "parent_email")
        )
})
public class Parent {

    private String name;
    private String phone;
    private String email;


}
