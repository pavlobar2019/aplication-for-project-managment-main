package spd.trello.domain;

import lombok.*;
import spd.trello.domain.common.Resource;
import spd.trello.domain.enums.Role;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "member")
public class Member extends Resource {
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "user_id")
    @NotNull(message = "The userId field must be filled.")
    private UUID userId;
    @Column(name = "level")
    private String level;
}
