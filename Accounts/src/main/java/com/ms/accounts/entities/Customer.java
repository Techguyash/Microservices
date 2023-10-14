package com.ms.accounts.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author techguyash
 * @Date 10/5/2023
 * @Time 8:24 AM
 */
@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(generator = "native",strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native",strategy = "native")
    private Long customerId;
    private String name;
    private String email;
    private String mobileNumber;

}
