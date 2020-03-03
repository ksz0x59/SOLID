package dip.ok;

public class Button
{
    private Equipment equipment;
    private boolean state;

    public Button(Equipment equipment)
    {
        this.equipment = equipment;
    }

    public void toggle()
    {
        this.state = !state;
        boolean buttonOn = state;
        if (buttonOn) {
            equipment.turnOn();
        } else {
            equipment.turnOff();
        }
    }
}
