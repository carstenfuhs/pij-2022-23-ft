public class OldPhone implements Phone {

    private String brand = null;

    public OldPhone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void call(String number) {
	System.out.println("Calling " + number + "...");
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        OldPhone oldPhone = (OldPhone) other;
        if (this.brand == null) {
            return other.brand == null;
        }
        return this.brand.equals(other.brand); // beware of == for String
    }
}