public class Contact {
    //instance variables
    private String name;
    private String relation;
    private String birthday;
    private String phone;
    private String email;

    public Contact(String _name, String _relation, String _birthday, String _phone, String _email) {
        name = _name;
        relation = _relation;
        birthday = _birthday;
        phone = _phone;
        email = _email;
    }

    //getter methods
    public String getName() { return name; }
    public String getRelation() { return relation; }
    public String getBirthday() { return birthday; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    public String toString() {
        return String.format("%-8s   %-8s   %-8s   %-12s   %s", name, relation, birthday, phone, email);
    }
}
