package kata4.main;

import java.io.IOException;
import java.util.List;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class KATA4 {
    
    private static final String filename = "emails.txt";
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
    
    public static void main(String[] args) throws IOException{
        execute();
    }
    
    private static void execute() throws IOException{
        input();
        process();
        output();
    }
    
    private static void input() throws IOException{
        mailList = MailListReader.read(filename);
    }
    private static void process() throws IOException{
        histogram = MailHistogramBuilder.build(mailList);
    }
    private static void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
