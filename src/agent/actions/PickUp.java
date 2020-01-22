package agent.actions;

import environment.Environment;
import environment.Manor;
import environment.Room;

public class PickUp implements Action {

    @Override
    public int execute(Environment environment) {
        Manor manor = (Manor) environment;
        Room[][] rooms = ((Manor) environment).getRooms();
        if(rooms[manor.getVacuumPosition().getX()][manor.getVacuumPosition().getY()].hasJewel()) {
            rooms[manor.getVacuumPosition().getX()][manor.getVacuumPosition().getY()].removeJewel();
            return 10;
        }
        return 0;
    }

}
