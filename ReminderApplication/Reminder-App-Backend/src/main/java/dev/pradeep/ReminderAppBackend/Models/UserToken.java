package dev.pradeep.ReminderAppBackend.Models;

import dev.pradeep.ReminderAppBackend.Enums.UserType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "user_token")
public class UserToken extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "users_id")
    @ToString.Exclude
    private User user;

    private String token;

    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(columnDefinition = "boolean default false")
    private boolean tokenWipeOff;
}
