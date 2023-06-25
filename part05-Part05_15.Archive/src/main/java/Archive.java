/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Archive {
    private String id;
    private String name;
    
    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String toString() {
        return this.id + ": " + this.name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return false;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        return this.id.equals(comparedArchive.id);
    }
}
