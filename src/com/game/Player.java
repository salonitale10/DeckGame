package com.game;
public class Player implements Comparable<Player>
{
public Player(int id)
{
   this.playerId = id;
}

private int playerId;

private String playerName;

private int points;



public int getPlayerId()
{
   return playerId;
}

public void setPlayerId(int playerId)
{
   this.playerId = playerId;
}

public String getPlayerName()
{
   return playerName;
}

public void setPlayerName(String playerName)
{
        this.playerName = playerName;
}

public int getPoints()
{
        return points;
}

public void setPoints(int points)
{
        this.points = points;
}



@Override
public int compareTo(Player o)
{
        if (this.getPoints() == o.getPoints())
        {
                return 0;
        }
        else if (this.getPoints() > o.getPoints())
        {
                return 1;
        }
        else
                return -1;
}
}