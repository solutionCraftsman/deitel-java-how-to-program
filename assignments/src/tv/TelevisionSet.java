package tv;

public class TelevisionSet {

    private String name;
    private int volume;
    private boolean isOn;
    private int currentChannel;

    public TelevisionSet(String name) {
        this.name = name;
        currentChannel = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Volume out of TV range");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setChannel(int channel) {
        if(channel > 0 && channel <= 1000) {
            currentChannel = channel;
        } else {
            System.out.println("Channel out of TV range");
        }
    }

    public void decreaseVolume() {
        if (isOn) {
            if(volume > 0 && volume <= 100) {
                volume--;
            }
            else {
                System.out.println("Minimum volume reached");
            }
        } else {
            printPowerStatus();
        }
    }

    public void increaseVolume() {
        if (isOn) {
            if(volume >= 0 && volume < 100) {
                volume++;
            }
            else {
                System.out.println("Maximum volume reached");
            }
        } else {
            printPowerStatus();
        }
    }

    public void nextChannel() {
        if (isOn) {
            if(currentChannel >= 1 && currentChannel < 1000) {
                currentChannel++;
            } else if(currentChannel == 1000) {
                currentChannel = 1;
            }
            else {
                System.out.println("Channel range is from 1 to 1000");
            }
        } else {
            printPowerStatus();
        }
    }

    public void previousChannel() {
        if (isOn) {
            if(currentChannel > 1 && currentChannel <= 1000) {
                currentChannel--;
            } else if(currentChannel == 1) {
                currentChannel = 1000;
            }
            else {
                System.out.println("Minimum channel reached");
            }
        } else {
            printPowerStatus();
        }
    }

    public void printDetails() {
        printPowerStatus();
        System.out.println("Channel: " + currentChannel + "\n" +
                            "Volume: " + volume);
    }

    public void printPowerStatus() {
        String powerStatus = isOn ? "turned on" : "turned off";
        System.out.println(name + " TV is currently " + powerStatus);
    }
    
}


