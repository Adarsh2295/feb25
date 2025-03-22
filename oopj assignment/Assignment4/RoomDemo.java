

 //Q1. Room Volume Calculation






import java.util.* ;

class Room
{

 	float h  , w , l ;
	
	Room(float h,float  w ,float l )
	{
		this.h = h; 
		this.w = w ; 
		this.l = l ; 
		
	}

    float volume( )
	{
        float res = l * w * h ;
		 return  res ; 
	}		

}

class   RoomDemo 
{

	public static void main(String Args[])
	{
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Enter the height of room : ");
		float h = sc.nextFloat() ;
		System.out.println("Enter the width of room : ");
		float w = sc.nextFloat() ;
		System.out.println("Enter the length of room : ");
		float l = sc.nextFloat() ;
		
		Room r1 = new Room(h, w , l );
		System.out.println("Volume of the room is : "+r1.volume());
		 
		
	}
	

}