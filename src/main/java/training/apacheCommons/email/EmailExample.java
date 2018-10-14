package training.apacheCommons.email;

import org.apache.commons.mail.*;

class EmailExample {

    private static DefaultAuthenticator defaultAuthenticator;

    public static void main(String[] args) throws EmailException {
        sendExampleEmail();
    }

    private static void sendExampleEmail() throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        defaultAuthenticator = new DefaultAuthenticator(
                "x",
                "x");
        email.setAuthenticator(defaultAuthenticator);
        email.setStartTLSEnabled(true);
        email.setFrom("x");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail from S ... :-)");
        email.addTo("x");
        email.send();
    }

}