
package kincses;


public class lada {
    
    private String anyaga;
    private String szovege;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return "Anyaga: "+anyaga+"\nSzövege: "+ szovege;
        
    }
    public String getAnyag(){
        return "Anyaga: "+anyaga;
    }
    public String getMond(){
        return "Szövege: "+ szovege;
    }

    
    public void setString(String anyaga,String szovege) {
        this.anyaga = anyaga;
        this.szovege=szovege;
    }

}
