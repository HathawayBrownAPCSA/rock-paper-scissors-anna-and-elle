
/**
 * Write a description of class RPSMatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random; 

public class RPSMatch2
{
   
    private int humanPlay;
    private int computerPlay;
    private int computerWins;
    private int humanWins;
    private int ties; 
    

    public RPSMatch2()
    {
        // initialise instance variables
        humanWins = 0;
        computerWins = 0;
        ties = 0;
        
    }

    
    public void setHumanPlay(int n)
    {
        // put your code here
        humanPlay =  n; 
    }
    
    public String getComputerPlay()
    {
        computerPlay = (int)(Math.random()*3);
        
        if (humanPlay == 1)
        {
        
            computerPlay = (int)(Math.random()*3+1);
            
        }
        
        if (humanPlay == 2)
        {
            computerPlay = (int)(Math.random()*3-1);
        }
        
        if (humanPlay == 0)
        {
           computerPlay = (int)(Math.random()*2);
        }
        
        if (computerPlay == 0)
        { 
            return ("Rock");
        }
    
        else if (computerPlay == 1)
        {
            return ("Paper");
        }
        
        
        else 
        {
            return ("Scissors");
        }
        
    
    }
    
    public int getHumanWins()
    {
        return humanWins;
    }
    
    public int getComputerWins()
    {
        return computerWins;
    }
    
    public int getTies()
    {
        return ties;
    }
    
    public String getResults()
    {
        if (computerPlay == 0 && humanPlay == 1)
        {
           humanWins = humanWins + 1  ;
           return ("ugh you win, i'll get you next time");

        }
        
        if (computerPlay == 1 && humanPlay == 0)
        {
            computerWins = computerWins + 2;
            return ("haha i win");
            
        }
        
        if (computerPlay == 2 && humanPlay == 0)
        {
            humanWins = humanWins + 1;
            return ("ugh you win, i'll get you next time");
        }
        
        if (computerPlay == 0 && humanPlay == 2)
        {
            computerWins = computerWins + 1;
            return ("haha i win");
        }
        
        if (computerPlay == 1 && humanPlay == 2)
        {
            humanWins = humanWins + 1;
            return ("ugh you win, i'll get you next time");
        }
        
        if (computerPlay == 2 && humanPlay == 1)
        {
            computerWins = computerWins + 1;
            return ("haha i win"); 
        }
        
        else 
        {
            ties = ties +1;
            return ("it's a tie ...");
        }
    }
    
}
