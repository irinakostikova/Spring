package laba1.csv;


import com.opencsv.CSVReader;
import laba1.service.Question;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
