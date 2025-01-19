package es.ulpgc.kata2.persistence;

import es.ulpgc.kata2.model.entities.Title;

import java.io.IOException;
import java.util.List;

public interface TitleReader {
    List<Title> read() throws IOException;
}
