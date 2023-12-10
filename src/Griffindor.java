public class Griffindor {
    public String name;
    public int magicPower;
    public int transgression;
    public int brave;
    public int honor;
    public int nobility;

    public Griffindor(String name, int magicPower, int transgression, int brave, int honor, int nobility) {
        this.magicPower = magicPower;
        this.transgression = transgression;
        this.name = name;
        this.brave = brave;
        this.honor = honor;
        this.nobility = nobility;
    }

    public Griffindor(int magicPower, int transgression) {
    }

    public Griffindor(String name, int magicPower, int transgression) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
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

    public int sum() {
        return getBrave() + getHonor() + getNobility();
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }

    public void compare(Griffindor other) {
        int power = sum();
        int power1 = other.sum();
        if (power > power1) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + getName());
        }

    }
}


