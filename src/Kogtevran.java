public class Kogtevran {
    public int magicPower;
    public int transgression;
    public String name;
    public int smart;
    public int wise;
    public int wit;
    public int creation;

    public Kogtevran(String name, int magicPower, int transgression, int smart, int wise, int wit, int creation) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
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

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "magicPower=" + magicPower +
                ", transgression=" + transgression +
                ", name='" + name + '\'' +
                '}';
    }

    public int sum1() {
        return getSmart() + getWit() + getWise() + getCreation();
    }

    public void compare(Kogtevran other) {
        int power2 = sum1();
        int power3 = other.sum1();
        if (power2 > power3) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        }
    }
}
