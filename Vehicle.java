class Vehicle {
    private int numberOfWheels;
    private String color;
    
    public Vehicle (String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }

	public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}