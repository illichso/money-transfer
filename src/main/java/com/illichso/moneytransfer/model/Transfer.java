package com.illichso.moneytransfer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transfer implements Serializable {
    @Id
    private String id;
    private int amount;
    private String description;
}
