package laba1.csv;

import com.opencsv.CSVReader;
import org.springframework.stereotype.Component;
import java.io.*;
import java.util.*;
import laba1.service.Question;

@Component
public class CSVReaderImpl implements ICSVReader {
   private String filePath="questions.csv";

    public List<Question> getQuestions() throws IOException {

        List<Question> result = new ArrayList<>();
        InputStream is = CSVReaderImpl.class.getResourceAsStream("/questions.csv");
        CSVReader csvReader = new CSVReader(new InputStreamReader(is));
        String[] values = null;
        while ((values = csvReader.readNext()) != null){
            String read= Arrays.toString(values);
            String[] answers = read.split(";");
            result.add(new Question(answers[1], answers[2], answers[3]));
        }
        return result;
    }
}
