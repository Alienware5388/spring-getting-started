package ro.sda.spring._2_.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Owner {

    private String name;
    private Dog dog;

}
