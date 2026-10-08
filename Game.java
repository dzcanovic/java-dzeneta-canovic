package novi;
import java.util.ArrayList;
//Lejla Hadzialijagic 25/042
//Dzeneta Canovic 25/029


class Player {
	private String ime;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	private int damage;
	
	
	
	
	
	
public Player(String ime, int x, int y, int width, int height, int health) {
		this.ime = ime;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}






public String getIme() {
	return ime;
}






public void setIme(String ime) {
	if (ime == null || ime.trim().isEmpty()) {
		this.ime = ime;
       System.out.println("Ime igrača ne smije biti prazno!");
    }
	String novi = ime.trim(); 
    String rez = ""; 
    boolean novaRijec = true;
    
    for (int i = 0; i < novi.length(); i++) {
    	char c = novi.charAt(i);
   
    if (c == ' ') {
        novaRijec = true;
    } else {
        if (novaRijec) {
            if (rez.length() > 0) {
                rez = rez + " ";
            }
            rez = rez + Character.toUpperCase(c);
            novaRijec = false;
        } else {
            rez = rez + Character.toLowerCase(c);
        }
    }


       this.ime = rez;
}
}


 public int getX() {
	return x;
}






public void setX(int x) {
	this.x = x;
}






public int getY() {
	return y;
}






public void setY(int y) {
	this.y = y;
}






public int getWidth() {
	if (width <= 0) {
        System.out.println("Širina mora biti pozitivna vrijednost!");
	return width;
}
}





public void setWidth(int width) {
	this.width = width;
}






public int getHeight() {
	return height;
}






public void setHeight(int height) {
	if(health >=0 && health <= 100) {
	this.height = height;
}else {
	System.out.println("Greska, health mora biti izmedju 0 i 100");
}
}




public int getHealth() {
	return health;

}






public void setHealth(int health) {
	if(health >=0 && health <= 100) {
		this.health = health;
	}else {
		System.out.println("Greska, health mora biti izmedju 0 i 100");
	
}
}






  public class Enemy {
	  private String type;
	    private int x1;
	    private int y1;
	    private int width1;
	    private int height1;
	    private int damage;
  
  public Enemy(String type, int x1, int y1, int width1, int height1, int damage) {
		this.type = type;
		this.x1 = x1;
		this.y1 = y1;
		this.width1= width1;
		this.height1 = height1;
		this.damage = damage;
  }




public String getType() {
	return type;
}




  public void setType(String type) {
	  if (type == null || type.trim().isEmpty()) {
          System.out.println("Tip neprijatelja ne smije biti prazan!");
          return;
      }
      this.type = type.trim();
  }
	
  }




  public int getX1() {
	return x;
  }




  public void setX1(int x) {
	this.x= x;
  }




  public int getY1() {
	return y;
  }




  public void setY1(int y1) {
	this.y = y;
  }




  public int getWidth1() {
	return width;
  }




  public void setWidth1(int width) {
	this.width = width;
  }




  public int getHeight1() {
	return height;
  }




  public void setHeight1(int height) {
	this.height = height;
  }




  public int getDamage() {
	return getDamage();
  }




  public void setDamage(int damage) {
	  if (damage < 0) {
          this.damage = 0;
      } else if (damage > 100) {
          this.damage = 100;
      } else {
          this.damage = damage;
	this.damage = damage;
  }




public class Game {
	


	public static void main(String[] args) {
		
	}
		private Player player;
	    private ArrayList<Enemy> enemies;
	    private ArrayList<String> eventLog;
	
	    public Game(Player player) {
	        this.player = player;
	        this.enemies = new ArrayList<>();
	        this.eventLog = new ArrayList<>();
	    }
	    
	        }
	    }

  }

  



	

