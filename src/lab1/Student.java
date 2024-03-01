package lab1;

public class Student {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String groupNumber;

    public Student() {
        firstName = "nobody";
        lastName = "nobody";
        emailAddress = "nothing";
        groupNumber = "nothing";
    }

    public Student(String firstName, String lastName, String emailAddress, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "The student's name is " + firstName + " " + lastName +
                ", and their email is " + emailAddress +
                ". The student belongs to group " + groupNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public String less(Student student2) {
        //int s1 = Integer.parseInt(groupNumber);
        //int s2 = Integer.parseInt(student2.groupNumber);
        if (groupNumber.equals(student2.getGroupNumber())) {
            return firstName + " " + lastName + " and " + student2.getFirstName() + " " + student2.getLastName() +
                    " are both in group " + groupNumber;
        }
        return "They are in different groups, " +
                firstName + " " + lastName + " is in group " + groupNumber +
                ", " + student2.getFirstName() + " " + student2.getLastName() + " in group " + student2.getGroupNumber();
    }
}
