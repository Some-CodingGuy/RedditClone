package org.n.redditclone.model.datamodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Subreddit {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private UUID id;
    @NotBlank (message = "You have to name the subreddit")
    private String name;
    @NotBlank (message = "You also have to give a description")
    private String description;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;
    private Instant createDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
