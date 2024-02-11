import java.time.LocalDate;

public class Parser {
    public User parseInput(String input) {
        String[] userData = input.split(" ");
        if (userData.length < 6) {
            throw new IllegalArgumentException("Too little data entered!");
        } else if (userData.length > 6) {
            throw new IllegalArgumentException("Too mutch data entered!");
        }
        String lastName = userData[0];
        String firstName = userData[1];
        String surName = userData[2];
        LocalDate dateBirth = parseDateBirth(userData[3]);
        long phoneNum = parsePhoneNum(userData[4]);
        char gender = parseGender(userData[5]);
        return new User(lastName, firstName, surName, dateBirth, phoneNum, gender);
    }

    private LocalDate parseDateBirth(String dateString) {
        LocalDate dateBirth = LocalDate.parse(dateString, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        if (!dateString.equals(dateBirth.format(java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy")))) {
            throw new IllegalArgumentException("Invalid format entered!");
        }

        if (dateBirth.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("You must have at least one day!");
        }

        if (dateBirth.getYear() < 1900) {
            throw new IllegalArgumentException("Are you okay?");
        }

        return dateBirth;
    }

    private long parsePhoneNum(String phoneNum) {
        try {
            return Long.parseLong(phoneNum);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid symbol format! " + phoneNum);
        }
    }

    private char parseGender(String gender) {
        if (gender.length() != 1 || (gender.charAt(0) != 'm' && gender.charAt(0) != 'f')) {
            throw new IllegalArgumentException("Enter \"m\" or \"f\"");
        }
        return gender.charAt(0);
    }
}
