public class Validator {
    public void validateUser(User user) {
        validateName(user.getLastName());
        validateName(user.getFirstName());
        validateName(user.getSurName());
        validatePhoneNum(user.getPhoneNum());
    }

    private void validateName(String name) {
        if (!name.matches("[a-zA-Zа-яА-Я]+")) {
            throw new IllegalArgumentException("Invalid characters: " + name);
        }
    }

    private void validatePhoneNum(long phoneNum) {
        String phoneNumString = String.valueOf(phoneNum);
        if (!phoneNumString.matches("\\d{1,11}")) {
            throw new IllegalArgumentException("Number of digits exceeded!");
        }
    }
}
