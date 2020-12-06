package ac;

public class AirConditioner {

    private boolean isOn;
    private String productName;
    private int temperature;

    public AirConditioner(String productName) {
        this.productName = productName;
    }

    public void decreaseTemperature() {
        if(temperature <= 16) {
            System.out.println("Minimum value reached");
        }

        if(temperature > 16) {
            temperature = temperature - 1;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature < 30) {
            temperature = temperature + 1;
        }

        if(temperature >= 30) {
            System.out.println("Maximum value reached");
        }
    }

    public boolean isOn() {
        return isOn;
    }


    public void setOn(boolean isOn) {
        if(isOn) {
            setTemperature(16);
        }
        else {
            setTemperature(0);
        }
        this.isOn = isOn;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setTemperature(int temperature) {
        if(temperature < 16 || temperature > 30) {
            System.out.println("Invalid value");
        }

        if(temperature > 15 && temperature <= 30) {
            this.temperature = temperature;
        }
    }

}


