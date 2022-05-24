import java.util.ArrayList;

public class Snake {
 //direction
 //pixel coordinates (arraylist)
    
//turnDirection()
//eatApple()
//isDead( obstacles ) , snake

private ArrayList<Coordinates> coordinates;
private Direction direction;


public Snake( int length, Coordinates headPosition, Direction direction ) {

    this.coordinates.add( headPosition );
    this.direction = direction;
    for( int i = 1; i < length; i++ ) {
        coordinates.add( headPosition.moveCoordinates( this.direction, i ) );
    }
    


}


}
