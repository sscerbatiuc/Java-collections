package learningcollections.entity;

import java.util.Objects;

/**
 *
 * @author sscerbatiuc
 */
public class PersonWithCode {

    private String name, surname;
    private Integer code; // this should be unique

    public PersonWithCode(Integer code, String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getCode() {
        return code;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonWithCode)) {
            return false;
        }
        final PersonWithCode other = (PersonWithCode) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }

   
}
