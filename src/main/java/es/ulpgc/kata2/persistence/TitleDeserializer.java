package es.ulpgc.kata2.persistence;

import es.ulpgc.kata2.model.entities.Title;

import java.util.Optional;

public interface TitleDeserializer {
    Optional<Title> deserialize(String line);
}
