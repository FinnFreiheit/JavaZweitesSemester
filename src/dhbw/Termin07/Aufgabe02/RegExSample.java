package dhbw.Termin07.Aufgabe02;

public class RegExSample
{
        public static boolean isIPAdresse(String adresse)
        {
            String a = "^(((\\d|0\\d|00\\d|\\d{2}|0\\d{2}|1\\d{2}|2[0-4]\\d|2[0-5]{2})\\.){3})(\\d|0\\d|00\\d|\\d{2}|0\\d{2}|1\\d{2}|2[0-4]\\d|2[0-5]{2})$";
            return adresse.matches(a);
        }

        public static boolean isEmailAdresse(String adresse)
        {
            return adresse.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        }

        public static boolean isTelefonNummer(String telefonNummer)
        {
            return telefonNummer.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$");
        }

}
