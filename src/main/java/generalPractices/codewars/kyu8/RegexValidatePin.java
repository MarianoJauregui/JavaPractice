package generalPractices.codewars.kyu8;

public class RegexValidatePin {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
    }
    //ATM's machines allow 4 or 6 digits PIN codes and PIN codes cannot contain anything but exactly 4 or 6 digits.

    public static boolean validatePin(String pin){
        /*String regex = "^([0-9]{4}|[0-9]{6})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pin);

        return matcher.matches();*/
        //Solution in just one line
        return pin.matches("\\d{4}|\\d{6}");
    }
}
