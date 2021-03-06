package agent.actions;

import environment.Environment;
import environment.Manor;

/**
 * @since 01.02.2020
 * @author Thomas Beauchataud
 * This class represents the Aspire Action
 * When this action is executed : the Agent go down in the Manor and return a score modification of -1
 */
public class MoveBottom implements Action {

    /**
     * Execute an action of an Agent on his Environment and return the score modification for the agent
     * @param environment Environment
     * @return int
     */
    @Override
    public int execute(Environment environment) {
        Manor manor = (Manor) environment;
        if(manor.getVacuumPosition().getX() != 4) {
            manor.getVacuumPosition().setX(manor.getVacuumPosition().getX() + 1);
        }
        return -1;
    }

}
