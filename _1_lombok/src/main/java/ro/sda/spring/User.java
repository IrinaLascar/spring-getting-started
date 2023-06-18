package ro.sda.spring;
import lombok.*;

//@Data - este un shortcut ptr @EqualsAndHashCode, @Setter, @Getter, @ToString
@EqualsAndHashCode
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;
}