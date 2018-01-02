package com.illichso.moneytransfer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "currencies")
public class Currency implements Serializable {
    @Id
    @Field("_id")
    private String id;
    @Field("full_name")
    private String fullName;
    @Field("short_name")
    private String shortName;
}
