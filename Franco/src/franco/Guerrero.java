package franco;

public class Guerrero 
{
	private String Nombre;
	private int Vida, Fuerza, Defensa, Velocidad, Suerte, Arma, Armadura, DefTot, AtqTot, Damage;
	boolean critico;
	
	public Guerrero(String Nombre)
	{
		this.Nombre = Nombre;
		Vida = 100 + (int)(Math.random()*51);
		Fuerza = 5 + (int)(Math.random()*6);
		Defensa = 5 + (int)(Math.random()*6);
		Velocidad = 5 + (int)(Math.random()*6);
		Suerte = 1 + (int)(Math.random()*3);
		
		Arma = 0;
		Armadura = 0;
		
		AtqTot = (Fuerza+Arma)*2;
		DefTot = 0;
		critico = false;
		Damage = 0;
	}
	public int GetSpeed()
	{
		return Velocidad;
	}
	public void SetArma(int Arma)
	{
		this.Arma = Arma;
	}
	public void SetArmadura(int Armadura)
	{
		this.Armadura = Armadura;
	}
	
	public void setAttack()
	{
		this.AtqTot = (Fuerza + Arma)*2;
	}
	public int getDefensa()
	{
		DefTot = Defensa + Armadura;
		return DefTot;
	}
	public int Attack()
	{
		setAttack();
		
		double Atq = AtqTot;
		double random = 50+(int)Math.floor(Math.random()*51);
		double percent = random/100;
		int TotalAttack = (int)Math.floor(Atq*percent);
		if (random>90)
		{
			critico = true;
			double Multiplier = TotalAttack*1.5;
			TotalAttack =(int)Math.floor(Multiplier);
		}
		return TotalAttack;
	}
	public boolean getCritic()
	{
		return critico;
	}
	public String isCritic()
	{
		if (getCritic())
		{
			critico = false;
			return "��� DA�O CRITICO !!!";
		}
		else
		{
			return "";
		}
	}
	public void Damage(int Ataque)
	{
		 Damage = getDefensa() - Ataque;
	}
	public int getDamage()
	{
		if (Damage<0)
		{
			return Damage;
		}
		else
		{
			return 0;
		}
	}
	public void Defensa ()
	{
		Vida = Vida + getDamage();
	}
	public void Stats()
	{
		System.out.println("----------------------");
		System.out.println(getNombre()+" STATS:");
		System.out.println("----------------------");
		System.out.println("Vida: "+ Vida);
		System.out.println("Fuerza: "+ Fuerza);
		System.out.println("Defensa: "+ Defensa);
		System.out.println("Velocidad: "+ Velocidad);
		System.out.println("Suerte: "+Suerte);
		if (Arma>0)
		{
			System.out.println("Atq. Arma: "+Arma);
		}
		else
		{
			System.out.println("Sin Arma");
		}
		if (Armadura>0)
		{
			System.out.println("Def. Armadura: "+Armadura);
		}
		else
		{
			System.out.println("Sin Armadura");
		}
		System.out.println("Atq. Total: "+AtqTot);
		System.out.println("Def. Total: "+getDefensa());
		
	}
	public boolean Vivo()
	{
		
		if (Vida>0)
		{
			 return true;
		}
		else
		{
			return false;
		}

	}
	public String getNombre()
	{
		return this.Nombre;
	}
	public int getVida()
	{
		return Vida;
	}
}
