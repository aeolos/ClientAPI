package com.aeolos.model;
import javax.persistence.*; 

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id"})	
@Entity  
public class Employee {  
          @Id  
          @Column(name = "id")  
          private Long id;  
          @Column(name = "firstname")  
          private String firstName;  
          @Column(name = "lastname")  
          private String lastName;  
          public long getId() {  
                    return id;   
          }  
          public void setId(long id) {  
                    this.id = id;  
          }  
          public String getFirstName() {  
                    return firstName;  
          }  
          public void setFirstName(String firstName) {  
                    this.firstName = firstName;  
          }  
          public String getLastName() {  
                    return lastName;  
          }  
          public void setLastName(String lastName) {  
                    this.lastName = lastName;  
          }  
}  
