package org.cap.hr.pipeline.poc.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserVO {
    private String firstName;
    private String middleName;
    private String lastName;
    private String city;
    private String postCode;
    private String ward;
    private String council;
    private String county;
}
