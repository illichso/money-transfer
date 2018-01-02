package com.illichso.moneytransfer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transfers")
public class Transfer implements Serializable {
    @Id
    @Field("_id")
    private String id;
    @Field("amount")
    private BigDecimal amount;
    @Field("timestamp")
    private LocalDateTime timestamp;
    @Field("description")
    private String description;
    @Field("client_id")
    private String clientId;

    public void resetId() {
        this.id = null;
    }
}
