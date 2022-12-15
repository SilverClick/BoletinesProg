
package com.gonzalo.boletin15;


public class Película extends Multimedia{
    private String actorprin;
    private String actrizprin;

    public Película() {
        
    }

    public Película(String actorprin, String actrizprin, String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.actorprin = actorprin;
        this.actrizprin = actrizprin;
    }

    public String getActorprin() {
        return actorprin;
    }

    public void setActorprin(String actorprin) {
        this.actorprin = actorprin;
    }

    public String getActrizprin() {
        return actrizprin;
    }

    public void setActrizprin(String actrizprin) {
        this.actrizprin = actrizprin;
    }

    @Override
    public String toString() {
        return  "actorprin=" + actorprin + ", actrizprin=" + actrizprin +super.toString();
    }
    
    
    
}
