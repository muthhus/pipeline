package org.cap.hr.pipeline.poc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    private String uuid;
    private String firstName;
    private String middleName;
    private String lastName;
    private String city;
    private String postCode;
    private String ward;
    private String council;
    private String county;

}
