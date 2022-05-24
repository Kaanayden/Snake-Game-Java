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

public void turnDirection() {
    if( this.direction.equals( Direction.UP ) ) {
        direction = Direction.RIGHT;
    } else if( this.direction.equals( Direction.RIGHT ) ) {
        direction = Direction.DOWN;
    } else if( this.direction.equals( Direction.DOWN ) ) {
        direction = Direction.LEFT;
    } else if( this.direction.equals( Direction.LEFT ) ) {
        direction = Direction.UP;
    }
}

//execute when snake eats an apple
private void grow() {
    coordinates.add(  )
}

private Coordinates getHead() {
    return coordinates.get( 0 );
}

private boolean checkDeath( ArrayList<Coordinates> obstacles ) {
    Coordinates head = getHead();
    for( Coordinates obstacle : obstacles ) {
        if( obstacle.equals( head ) ) {
            return true;
        }
    }

    for( Coordinates coordinate : this.coordinates ) {
            if( coordinate.equals( head ) ) {
                return true;
            }
    }

    return false;
}

// true if its alive false if its dead
public boolean update( ArrayList<Coordinates> obstacle ) {
    
    if( checkDeath( obstacles ) ) {

    }

}


}
