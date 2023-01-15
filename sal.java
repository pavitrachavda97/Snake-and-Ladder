import java.util.Scanner;
import java.util.Random;

public class sal
{
	static void deskboard(int p1, int p2, int flag)
	{
		System.out.println("deskboard : ");
		int count = 0;
		String x;
		String y;
		if(flag == 0)
		{
			x = "C";
			y = "P";
		}
		else 
		{
			x = "P1";
			y = "P2";
		}
		for(int i=100 ; i>0 ; i=i-10)
		{
			if(count == 0)
			{
			    for(int j=i ; j>i-10 ; j--)
			    {
					if(j == p1 && j == p2)
					{
						System.out.print("(B)" + " ");
					}
				    else if(j == p1)
					{
						System.out.print("(" + x + ")" + " ");
					}
					else if(j == p2)
					{
						System.out.print("(" + y + ")" + " ");
					}
					else
					{
						System.out.print(j + "   ");
					}
			    }
				count = 1;
			}
			else
			{
				for(int j=i-9 ; j<=i ; j++)
			    {
				    if(j == p1 && j == p2)
					{
						System.out.print("(B)" + " ");
					}
				    else if(j == p1)
					{
						System.out.print("(" + x + ")" + " ");
					}
					else if(j == p2)
					{
						System.out.print("(" + y + ")" + " ");
					}
					else
					{
						System.out.print(j + "   ");
					}
			    }
				count = 0;
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------");
	}
	
	static int snake(int k)
	{
		if(k == 22)
		{
			System.out.println("snake at current position");
			System.out.println("current position : " + k);
			k = 17;
			System.out.println("after position : " + k);
		}
		else if(k == 33)
		{
			System.out.println("snake at current position");
			System.out.println("current position : " + k);
			k = 6;
			System.out.println("after position : " + k);
		}
		else if(k == 57)
		{
			System.out.println("snake at current position");
			System.out.println("current position : " + k);
			k = 38;
			System.out.println("after position : " + k);
		}
		else if(k == 71)
		{
			System.out.println("snake at current position");
			System.out.println("current position : " + k);
			k = 49;
			System.out.println("after position : " + k);
		}
		else if(k == 75)
		{
			System.out.println("snake at current position");
			System.out.println("current position : " + k);
			k = 9;
			System.out.println("after position : " + k);
		}
		else if(k == 98)
		{
			System.out.println("snake at current position");
			System.out.println("current position : " + k);
			k = 79;
			System.out.println("after position : " + k);
		}
		return k;
	}
	static int ladder(int k)
	{
		if(k == 8)
		{
			System.out.println("ladder at current position");
			System.out.println("current position : " + k);
			k = 26;
			System.out.println("after position : " + k);
		}
		else if(k == 24)
		{
			System.out.println("ladder at current position");
			System.out.println("current position : " + k);
			k = 74;
			System.out.println("after position : " + k);
		}
		else if(k == 30)
		{
			System.out.println("ladder at current position");
			System.out.println("current position : " + k);
			k = 50;
			System.out.println("after position : " + k);
		}
		else if(k == 42)
		{
			System.out.println("ladder at current position");
			System.out.println("current position : " + k);
			k = 61;
			System.out.println("after position : " + k);
		}
		else if(k == 63)
		{
			System.out.println("ladder at current position");
			System.out.println("current position : " + k);
			k = 77;
			System.out.println("after position : " + k);
		}
		else if(k == 73)
		{
			System.out.println("ladder at current position");
			System.out.println("current position : " + k);
			k = 94;
			System.out.println("after position : " + k);
		}
		return k;
	}
	static void computer()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int c = 1;
		int p = 1;
		deskboard(c, p, 0);
		int turn = 0;
		while(c <= 100 || p <= 100)
		{
			if(turn == 0)
			{
				System.out.println("Computer : ");
				int k = r.nextInt(5) + 1;
				System.out.println("Number is : " + k);
				
				if((c+k) <= 100)
				{
					c = c + k;
				}
				c = snake(c);
				c = ladder(c);
			    if(k == 6)
				{
					turn = 0;
					deskboard(c,p,0);
					System.out.println("Turn of computer again");
				}
				else
				{
					turn = 1;
					deskboard(c,p,0);
					System.out.println("Turn of player");
				}
				System.out.println("select 1 to play: ");
				int x = sc.nextInt();
				if(x != 1)
				{
					System.out.println("Game over by player");
					break;
				}
			}
			else
			{
				System.out.println("Player : ");
				int k = r.nextInt(5) + 1;
				System.out.println("Number is : " + k);
				
				if((p+k) <= 100)
			    {
				    p = p + k;
			    }
				p = snake(p);
				p = ladder(p);
			    if(k == 6)
				{
					turn = 1;
					deskboard(c,p,0);
					System.out.println("Turn of player again");
				}
				else
				{
					turn = 0;
					deskboard(c,p,0);
					System.out.println("Turn of computer");
				}
			}
			if(c == 100)
			{
				System.out.println("COMPUTER WON!!!!!!!!!");
				break;
			}
			else if(p == 100)
			{
				System.out.println("PLAYER WON!!!!!!!!!");
				break;
			}
		}
	}
	
	static void twoPlayer()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int p1 = 1;
		int p2 = 1;
		deskboard(p1, p2,1);
		int turn = 0;
		while(p1 <= 100 || p2 <= 100)
		{
			System.out.println("select 1 to play: ");
			int x = sc.nextInt();
			if(x != 1)
			{
				if(turn == 0)
				{
					System.out.println("Game over by player 1");
				}
				else
				{
					System.out.println("Game over by player 2");
				}
				break;
			}
			if(turn == 0)
			{
				System.out.println("Player 1 : ");
				int k = r.nextInt(5) + 1;
				System.out.println("Number is : " + k);
				
				if((p1+k) <= 100)
				{
					p1 = p1 + k;
				}
				p1 = snake(p1);
				p1 = ladder(p1);
			    if(k == 6)
				{
					turn = 0;
					deskboard(p1,p2,1);
					System.out.println("Turn of player 1 again");
				}
				else
				{
					turn = 1;
					deskboard(p1,p2,1);
					System.out.println("Turn of player 2");
				}
			}
			else
			{
				System.out.println("Player 2 : ");
				int k = r.nextInt(5) + 1;
				System.out.println("Number is : " + k);
				
				if((p2+k) <= 100)
			    {
				    p2 = p2 + k;
			    }
				p2 = snake(p2);
				p2 = ladder(p2);
			    if(k == 6)
				{
					turn = 1;
					deskboard(p1,p2,1);
					System.out.println("Turn of player 2 again");
				}
				else
				{
					turn = 0;
					deskboard(p1,p2,2);
					System.out.println("Turn of player 1");
				}
			}
			if(p1 == 100)
			{
				System.out.println("PLAYER 1 WON!!!!!!!!!");
				break;
			}
			else if(p2 == 100)
			{
				System.out.println("PLAYER 2 WON!!!!!!!!!");
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter number of players : \n1.with computer \n2.with friend\n");
		int no_of_player = sc.nextInt();
		
		switch(no_of_player)
		{
			case 1:
			    computer();
				break;
			case 2:
				twoPlayer();
				break;
					
			default:
				System.out.println("This option is not available");
		}
	}
}