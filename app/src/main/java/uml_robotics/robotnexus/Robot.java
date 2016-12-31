package uml_robotics.robotnexus;

import android.graphics.Bitmap;

/**
 * Robot object used by the model and controller
 */


public class Robot {
    public enum State {ok, safe, help, dangerous, off} // a robot is in one of these states at all times
    private String name; // name of robot
    private Bitmap image; // image a robot may want to transfer
    private boolean dismissed = false; // for dismissed robots
    private int proximity; // how close is this robot
    private String id; //hidden identifier for a bot
    private String model; // the make of a robot
    private State currState;


    public Robot(int rssi, String id) {
        this.proximity = rssi;
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCurrState(String currState) {
        this.currState = State.valueOf(currState);
    }

    public String getCurrState() {
        return currState.toString();
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Bitmap getImage() {
        return image;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return (name == null? "Null" : name) + " - " + model +
                "\nStatus: " + currState.toString() + "\nProximity: " +
                proximity + "\nID: " + id;
     }
}
