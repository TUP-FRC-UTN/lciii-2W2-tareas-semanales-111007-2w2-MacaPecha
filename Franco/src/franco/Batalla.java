package franco;

public class Batalla 
{
	private Guerrero Goku, Vegeta, First, Second;
	private String Ganador;
	private boolean GameOver, Begining;
	private int AtqFirst, AtqSecond;
	public Batalla()
	{
		Goku = new Guerrero("Goku");
		Vegeta = new Guerrero("Vegeta");
		First = null;
		Second = null;
		Ganador = "";
		GameOver = false;
		AtqFirst = 0;
		AtqSecond = 0;
		Begining = true;
	}
	public int getFirst()
	{
		if (Goku.GetSpeed()>Vegeta.GetSpeed())
		{
			this.First = this.Goku;
			this.Second = this.Vegeta;
			return 1;
		}
		else if(Vegeta.GetSpeed()>Goku.GetSpeed())
		{
			this.First = this.Vegeta;
			this.Second = this.Goku;
			return 2;
		}
		else
		{
			return 3;
		}
	}
	public int getRandom() // 
	{
		return (int)Math.floor(Math.random()*(2-1+1)+1);
	}
	public void Begins()
	{
		int round = 1;
		int first = getFirst();
		while(!GameOver)
		{
			if (first==3)
			{
				
				if (round%2 != 0)
				{
					this.First = this.Goku;
					this.Second = this.Vegeta;
				}
				else
				{
					this.First = this.Vegeta;
					this.Second = this.Goku;
				}
			}
			if(First.Vivo())
			{
			System.out.println("Round "+ (round));
			System.out.println();
			System.out.println("Turno de "+First.getNombre());
			AtqFirst = First.Attack();
			if (First.getCritic())
			{
				System.out.println(First.isCritic());
			}
			System.out.println(First.getNombre()+" realiza un Ataque de "+AtqFirst);
			Second.Damage(AtqFirst);
			System.out.println(Second.getNombre()+" recibe un da�o de "+Second.getDamage());
			Second.Defensa();
			System.out.println("Vida restante de "+Second.getNombre()+" "+Second.getVida());
			
			
			Second.Vivo();
			}
			if (Second.Vivo())
			{
				System.out.println();
				System.out.println("Turno de "+Second.getNombre());
				AtqSecond = Second.Attack();
				if (Second.getCritic())
				{
					System.out.println(Second.isCritic());
				}
				System.out.println(Second.getNombre()+" realiza un Ataque de "+AtqSecond);
				First.Damage(AtqSecond);
				System.out.println(First.getNombre()+" recibe un da�o de "+First.getDamage());
				First.Defensa();
				System.out.println("Vida restante de "+First.getNombre()+" "+First.getVida());
				First.Vivo();
			}
			checkGameOver();
			if (GameOver)
			{
				System.out.println("Fin de la Batalla");
			}
			round++;
		}
		setGanador();
		System.out.println("Ganador: "+ Ganador);
	}
	public boolean checkGameOver()
	{
		if(!First.Vivo())
		{
			GameOver = true;
		}
		if(!Second.Vivo())
		{
			GameOver = true;
		}
		return GameOver;
	}
	public void setGanador()
	{
		if((First.Vivo() == true) && (Second.Vivo() == false))
		{
			Ganador = First.getNombre();
		}
		else if ((First.Vivo() == false) && (Second.Vivo() == true))
		{
			Ganador = Second.getNombre();
		}
		else
		{
			Ganador = "Empate";
		}
	}
	private String GetGanador()
	{
		return Ganador;
	}
	public Guerrero getGoku()
	{
		return this.Goku;
	}
	public Guerrero Vegeta()
	{
		return this.Vegeta;
	}
}
