public class Slizerin{
    public String name;
    public int magicPower;
    public int transgression;
    public int cunning;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int lustForPower;

    public Slizerin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
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
        return "Slizerin{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }
    public int sum2() {
        return getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower();
    }
    public void compare(Slizerin other) {
        int power4 = sum2();
        int power5 = other.sum2();
        if (power4 > power5) {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());
        }
    }
}
