public class Puffendui {
    public String name;
    public int magicPower;
    public int transgression;
    public int hardWork;
    public int loyalty;
    public int honesty;

    public Puffendui(String name, int magicPower, int transgression, int hardWork, int loyalty, int honesty) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
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

    @Override
    public String toString() {
        return "Puffendui{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }
    public int sum3() {
        return getHardWork() + getLoyalty() + getHonesty();
    }
    public void compare(Puffendui other) {
        int power6 = sum3();
        int power7 = other.sum3();
        if (power6 > power7) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());
        }
    }
}
