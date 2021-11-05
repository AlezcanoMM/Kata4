package main;

import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    public List<Mail> mailList;
    public Histogram<String> histogram;
    
    public static void main(String[] args) throws IOException {
        Kata4 kata4 = new Kata4(); 
        kata4.execute();
    }
    
    public void execute() throws IOException{
        input();
        process();
        output();
    }

    public void input() throws IOException {
        String fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
    }

    public void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    public void output() {
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
}
