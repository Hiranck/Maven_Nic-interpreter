/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nicSample;

/**
 *
 * @author HIRAN
 */
public class NicId {
    private final String nicId;
    private final String lastChar;

    public NicId(String nicId, String lastChar) {
        this.nicId = nicId;
        this.lastChar = lastChar;
    }

    public String getNicId() {
        return nicId;
    }

    public String getLastChar() {
        return lastChar;
    }
    
 
}
