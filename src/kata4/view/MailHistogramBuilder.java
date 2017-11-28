package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mail) {
        Histogram<String> histo = new Histogram<>();
        for (Mail email : mail) {
            histo.increment(email.getDomain());
        }
        return histo;
    }

}
