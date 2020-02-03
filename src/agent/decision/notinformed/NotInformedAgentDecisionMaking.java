package agent.decision.notinformed;

import agent.actions.*;
import agent.decision.nodes.ManorNode;
import agent.decision.nodes.Node;
import environment.Environment;
import environment.Manor;

import java.util.Arrays;

/**
 * @since 01.02.2020
 * @author Thomas Beauchataud
 * This class contains all the logic and the exploration algorithm of an not informed Agent Vacuum in the Manor
 */
@SuppressWarnings("Duplicates")
public class NotInformedAgentDecisionMaking extends AbstractNotInformedAgentDecisionMaking {

    public NotInformedAgentDecisionMaking(Environment perfectState) {
        super(perfectState);
    }

    @Override
    protected Node getFirstNode(Environment environment) {
        return new ManorNode(environment);
    }

    /**
     * Return true if the environment equals the perfect state of the Agent
     * @param environment Environment
     * @return boolean
     */
    @Override
    protected boolean isNotPerfectState(Environment environment) {
        Manor manor = (Manor)environment;
        Manor perfectManor = (Manor)this.perfectState;
        for(int i = 0 ; i < manor.getRooms().length ; i++) {
            for(int k = 0 ; k < manor.getRooms().length ; k++) {
                if(!perfectManor.getRooms()[i][k].equalsTo(manor.getRooms()[i][k])) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Load the list of possible Actions for a Node
     */
    @Override
    protected void loadActions() {
        this.possibleActions = Arrays.asList(
                new MoveLeft(),
                new MoveRight(),
                new MoveTop(),
                new MoveBottom(),
                new Aspire(),
                new PickUp()
        );
    }

}