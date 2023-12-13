public class Puffendui extends Hogwarts {
    public int hardWork;
    public int loyalty;
    public int honesty;

    public Puffendui(String name, int magicPower, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
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

    @Override
    public String toString() {
        return "Puffendui{" + super.toString() +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public int sum() {
        return getHardWork() + getLoyalty() + getHonesty();
    }
    public void compare(Puffendui other) {
        int power6 = sum();
        int power7 = other.sum();
        if (power6 > power7) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());
        }
    }
}
