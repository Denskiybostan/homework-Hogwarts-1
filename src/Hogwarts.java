public class Hogwarts {
    public String name;
    public int magicPower;
    public int transgression;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }
}

