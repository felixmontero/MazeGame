public class Room {
    //Where the doors are
    boolean northDoor = false;
    boolean eastDoor = false;
    boolean southDoor = false;
    boolean westDoor = false;


    Room rs_NorthDoor = null;
    Room rs_EastDoor = null;
    Room rs_SouthDoor = null;
    Room rs_WestDoor = null;

    int iCharacterPosX = 0;
    int iCharacterPosY = 0;


        Room(){
            northDoor = true; eastDoor = true; southDoor = true; westDoor = true;
    }

    Room(Room prevState, boolean north, boolean east, boolean south, boolean west){



        iCharacterPosX = 0;
        iCharacterPosX = 0;

        if(north)
        {
            rs_NorthDoor = prevState;
        }
    }

    public Room MoveToNextRoom(boolean north, boolean east, boolean south, boolean west){
        if(north){
            if(rs_NorthDoor == null)
            {
                rs_NorthDoor = new Room(this, north, east, south, west);
            }
            return rs_NorthDoor;
        }

        return null;
    }
}
