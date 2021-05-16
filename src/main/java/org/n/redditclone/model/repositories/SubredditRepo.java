package org.n.redditclone.model.repositories;

import org.n.redditclone.model.datamodel.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubredditRepo extends JpaRepository<Subreddit, UUID> {
}
