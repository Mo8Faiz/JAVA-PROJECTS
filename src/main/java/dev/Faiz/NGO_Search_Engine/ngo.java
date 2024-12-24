package dev.Faiz.NGO_Search_Engine;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "ngooooos")
@Data // Getter,Setter methods
@AllArgsConstructor // Creat a constructor which takes all the arguments below in it
@NoArgsConstructor // constructor with no parameters
public class ngo {
    @Id
    private ObjectId id;
    private String ngoId;
    private String name;
    private List<String> services;
    private String contact;
    private String location;
    @DocumentReference
    private List<Review> reviewIds;

}