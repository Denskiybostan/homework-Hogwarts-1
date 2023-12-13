public class Kogtevran extends Hogwarts {
    public int smart;
    public int wise;
    public int wit;
    public int creation;

    public Kogtevran(String name, int magicPower, int transgression, int smart, int wise, int wit, int creation) {
        super(name, magicPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Kogtevran{" + super.toString() +
                "smart=" + smart +
                ", wise=" + wise +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }

    public int sum() {
        return getSmart() + getWit() + getWise() + getCreation();
    }

    public void compare(Kogtevran other) {
        int power2 = sum();
        int power3 = other.sum();
        if (power2 > power3) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        }
    }
}
