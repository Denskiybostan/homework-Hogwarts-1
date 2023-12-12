public class Griffindor extends Hogwarts{
    public int brave;
    public int honor;
    public int nobility;

    public Griffindor(String name, int magicPower, int transgression, int brave, int honor, int nobility) {
        super(name, magicPower, transgression);
        this.brave = brave;
        this.honor = honor;
        this.nobility = nobility;
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

    public int sum() {
        return getBrave() + getHonor() + getNobility();
    }

    @Override
    public String toString() {
        return "Griffindor{" + super.toString() +
                ", brave=" + brave +
                ", honor=" + honor +
                ", nobility=" + nobility +
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


