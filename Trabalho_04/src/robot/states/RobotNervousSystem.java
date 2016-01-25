package robot.states;

public interface RobotNervousSystem {																// Interface to be implemented that defines the events generated by a scanner
	void ObjectDetected(ActiveState state);
	void ObjectIsGone();
}
