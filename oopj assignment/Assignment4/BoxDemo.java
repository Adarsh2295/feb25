

 //Q3. Box Area and Volume






import java.util.* ;

class Box
{

 	float h  , w , l ;
	
	Box(float h,float  w ,float l )
	{
		this.h = h; 
		this.w = w ; 
		this.l = l ; 
		
	}

    float getVolume( )
	{
        float vol = l * w * h ;
		 return  vol ; 
	}
 
    float getArea()
	{
	  float area = l * w  ; 
        return area ; 
		
	}
	

}

class   BoxDemo 
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
		
		Box b1 = new Box(h, w , l );
		System.out.println("Volume of the room is : "+b1.getVolume());
		System.out.println("Area of the room is : "+b1.getArea());
		 
		
	}
	

}