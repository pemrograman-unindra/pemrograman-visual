package unindra.modules.datastore.contact.model;

public class Contact {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private int billCoaId;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBillCoaId() {
        return this.billCoaId;
    }

    public void setBillCoaId(int coaId) {
        this.billCoaId = coaId;
    }
}