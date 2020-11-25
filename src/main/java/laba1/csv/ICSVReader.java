package laba1.csv;

import laba1.service.Question;

import java.io.IOException;
import java.util.List;

public interface ICSVReader {

    public List<Question> getQuestions() throws IOException;
}
